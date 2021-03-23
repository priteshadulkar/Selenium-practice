package com.Selenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Practice {

	static String Pid ="//button[@id='openwindow']";
	static String Pid2 ="//a[@id='opentab']";
	static WebDriver driver ;
	String alertbox ="//input[@placeholder='Enter Your Name']";
	String alertbutton ="//input[@id='alertbtn']";
	String mouse  = "//button[@id='mousehover']";
	String overm ="//*[text()='Reload']";	
	String fname ="//input[@name='username']";
	String fmobileno = "//input[@name='mobileno']";
	String fcountry   ="//input[@name='country']";
	String femail   ="//input[@name='email']";
	String ftext ="//*[@name='message']";
	String contact="//div[@class='nav-outer clearfix']//self::a[text()='Contact']";
	String sendmassage ="//div[@class='nav-outer clearfix']//following::button[text()='Send Message']";
	String hidetext ="//input[@id='displayed-text']";
	String hide =   "//input[@id='hide-textbox']";
	String show =  "//input[@id='show-textbox']";
	
	@BeforeClass
	public static void openbrowser()
	 {
		 System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver2.44\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.navigate().to("https://www.rahulshettyacademy.com/AutomationPractice/");
		 driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 System.out.println("Page is load successfulluy");
		 
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("window.scroll(2,900)");
		 System.out.println("scroll has done up to");
	 }

	public void prcticenet() throws InterruptedException
	{
		String Parentid = driver.getWindowHandle();
	     driver.findElement(By.xpath(Pid)).click();
	     Thread.sleep(5000);
	      
	     driver.findElement(By.xpath(Pid2)).click();
	     Thread.sleep(5000);
	     Set<String> child   =driver.getWindowHandles();
	     for(String ch :child)
	     {
	    	 if(!ch.equals(Parentid))
	    	 {
	    		driver.switchTo().window(ch);
	    		
	    		driver.manage().window().maximize();
	    		Thread.sleep(3000);
	    	 System.out.println("title od the child page is ="+driver.getTitle());
	    	 
	    	 driver.close();
	    	 Thread.sleep(3000);
	    	 
	    	 driver.switchTo().window(Parentid);
	    	 
	    	 System.out.println("title od the main  page is ="+driver.getTitle());
	    	 }
	    }
     }
	
	 public void alerthandling() throws InterruptedException
	 {
		 driver.findElement(By.xpath(alertbox)).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath(alertbox)).sendKeys("Pritesh");
		 driver.findElement(By.xpath(alertbutton)).click();
		 
		 Thread.sleep(2000);
		 Alert a = driver.switchTo().alert();
		 System.out.println(a.getText());
		 a.accept();
		 
		 System.out.println("alert ok button accpeted");
	 }
	
	public void mouse()
	{
		WebElement el = driver.findElement(By.xpath(mouse));
		Actions a = new Actions(driver);
		a.moveToElement(el).build().perform();
		driver.findElement(By.xpath(overm)).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("after page load PageSource is="+driver.getCurrentUrl());
	}
	
	 public void freamhandling() throws InterruptedException
	 {
		 Thread.sleep(2000);
		 driver.switchTo().frame(0);
		 
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("window.scroll(3,900)");
		 System.out.println("scroll has done up to");
		 System.out.println(driver.getTitle());
		 System.out.println("USEER ENTER INTO THE FRAME ");
		 
		 driver.findElement(By.xpath(contact)).click();
		  
		driver.findElement(By.xpath(fname)).sendKeys("Pritesh");
		 driver.findElement(By.xpath(fmobileno)).sendKeys("9028942411");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath(fcountry)).sendKeys("USA");
		 driver.findElement(By.xpath(femail)).sendKeys("Pritesh@gmail.com");
		 Thread.sleep(1000);
		 
		 Select sl =  new Select(driver.findElement(By.xpath("//select[@name='input-subject']")));
		 sl.selectByIndex(3);
		 System.out.println("drop sown value selected ");
		 
		 driver.findElement(By.xpath(ftext)).sendKeys("Pritesh AFDN SADJFBF A SDFJKASDDFNASKJFABF");
		 driver.findElement(By.xpath(sendmassage)).click();
		 System.out.println("all information sublit suceessfully");
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//*[@class='btn btn-default']")).click();
		 driver.switchTo().defaultContent();
	 }
	 @Test
	 public void ElementDispaly() throws InterruptedException
	 {
		 driver.findElement(By.xpath(hide)).click();
		 boolean b = driver.findElement(By.xpath(hidetext)).isEnabled();
		 System.out.println("value is boolean is ="+b);
		 if(b==false)
		 {
			 System.out.println("is hide enable");
			 driver.findElement(By.xpath(hidetext)).sendKeys("sdfn");
			
		 }
		 else
		 {
			 System.out.println("not hide enabbled");
		 }
		 
		 Thread.sleep(2000);
		 driver.findElement(By.xpath(show)).click();
		 boolean b1 = driver.findElement(By.xpath(hidetext)).isEnabled();
		 System.out.println("value is boolean is ="+b1);
		 if(b1==true)
		 {
			 driver.findElement(By.xpath(hidetext)).sendKeys("sdfn");
			 System.out.println("is show enable");
		 }
		 else
		 {
			 System.out.println("not show enabbled");
		 }
		 
		 
	 }
		
		 
		
		 
	 
	
	// @AfterClass
	 public void teradown()
	 {
		 driver.quit();
	 }
	
	
}