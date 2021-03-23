package com.Selenium;

import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import  org.openqa.selenium.support.ui.Select ;

public class SelectDDL {
   
	/*// TO lIST OUT ALL possible method 
	//1. to read all value in drop down
	
	//1.SelectbyVisible() => used only to select a Text
	//2.SelectbyValue()   => used to select text value  "like  so = selenium"\
	//3.SelectbyIndex()   =>  used for the Index basis
	 * 
	 * To read the value we use =>sl.getFirstSelectedOption().getText();  
	 * To read all values  => List<WebElement> all options  =  sl.getOptions();
     // to read
*/	WebDriver driver ;
     String check ="Option2";
     String xapth ="//div[@id='checkbox-example']//following::label";
     String radio ="//input[@class='radioButton']";
     String Parentid ="//button[@id='openwindow']";
	
     //@BeforeClass
	 public void Select()
	 {
		 System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver2.44\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.navigate().to("https://www.rahulshettyacademy.com/AutomationPractice/");
		 driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 System.out.println("Page is load successfulluy");
		 
		 /*JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("window.scroll(2,400)");
		 System.out.println("scroll has done up to");*/
	 }
     
     @Test(priority = 1)
     public void Selctddl() throws InterruptedException
     {
    	 Select sl = new Select(driver.findElement(By.xpath("//select[@id='dropdown-class-example']")));
    	 sl.selectByVisibleText("Select");
    	 
    	 
    	 String firstalue1  = sl.getFirstSelectedOption().getText();
         System.out.println("firstalue is ="+ firstalue1);
       
       System.out.println("VLue is deselect"); 
   
       
       sl.selectByIndex(3);
       String firstalue2 = sl.getFirstSelectedOption().getText();
       System.out.println("firstalue is ="+ firstalue2);
     
    	 
       
         sl.selectByValue("option2");
         String firstalue3 = sl.getFirstSelectedOption().getText();
       System.out.println("firstalue is ="+ firstalue3);
       
     List<WebElement> allselect   =    sl.getAllSelectedOptions();
     for(WebElement el :allselect)
     {
    	String allselectedtext =el.getText();
    	System.out.println("allselectedtext option is ="+ allselectedtext);
    	
    }
     Thread.sleep(2000);
    	 
    	 
     List<WebElement> alloptions     =  sl.getOptions();
     System.out.println(alloptions.size());
     for(WebElement el1 :alloptions)
     {
    	String Textoptions =el1.getText();
    	System.out.println("Textoptions option is ="+ Textoptions);
    	}
    System.out.println(sl.isMultiple());
     
   	 
   	 	 
    	 
    }
    // @Test
	 public void checkbox()
	 {
    	// driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		 
		Boolean b = driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected();
		System.out.println(b);
		if(b.TRUE)
		{
			driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
			System.out.println("check box is clicked");
		}
		else
		{
			System.out.println(" not clicked");
		}
		//driver.findElement(By.xpath("//input[@id=checkBoxOption2']")).click();
		
		driver.findElement(By.xpath("//input[@id='checkBoxOption3']")).click();
		
		
	}
     
	 @Test(priority = 0)
      public void checkboxall()
      {
    	 // to select one from all => getAttribute("value"); not get text
    	
    	   List<WebElement >  el   =driver.findElements(By.xpath("//div[@id='checkbox-example']//following::label//input[@type='checkbox']"));
    	  System.out.println(el.size());
    	  for(WebElement elt : el)
    	  {
    	   
    		  String text = elt.getAttribute("value");
    		  
    		  System.out.println(text);
    		  if(text.contains("option2"))
    		  {
    			  Boolean  b =elt.isEnabled();
    			  System.out.println("B value is true="+b);
    			  if(b.TRUE)
    			  {
    				  elt.click();
    				  System.out.println("Lopp check box clicked");
    			  }
    		 }
    		}
    	  }
      @Test
     public void checkboxallset()
     {
    	  boolean boolva;
   	   List<WebElement >  el   =driver.findElements(By.xpath("//div[@id='checkbox-example']//following::label//input[@type='checkbox']"));
   	   boolva= el.get(0).isSelected();
   	   if(boolva==true)
   	   {
   		   el.get(1).click();
   		   System.out.println("2nd click ");
   	   }
   	   else
   	   {
   		   el.get(0).click();
   		   System.out.println("1 st click");
   	   }
    	 el.get(2).click();
    	 
     }
      @Test
      public void radiobutton()
      {
    	  List<WebElement>     el=      driver.findElements(By.xpath(radio));
    	  for(WebElement radio1 :el)
    	  {
    		  String radiotext =radio1.getAttribute("value");
    		  System.out.println(radiotext);
    		  
    		  if(radiotext.equals("radio2"))
    		  {
    			  Boolean value = radio1.isSelected();
    			  if(value.TRUE) 
    			 {
    			  radio1.click();
    			  System.out.println("radio button swlwcted");
    			  }
    		  }
    	  }
     }
      @Test(priority = 2)
      public void Autosuggestion() throws InterruptedException
	  {
    	  Thread.sleep(2000);
    	  driver.findElement(By.xpath("//input[@id='autocomplete']")).click();
		  driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("CAN");
		  Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys(Keys.ARROW_DOWN);
		  driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys(Keys.ARROW_DOWN);
		  driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys(Keys.ARROW_DOWN);
		  driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys(Keys.ENTER); 
		  System.out.println("Keys.Arrowdown value is selectes =CANEDA");
	  }
      
      @AfterClass
      public void teardown()
      {
    	  driver.quit();
       }
}
