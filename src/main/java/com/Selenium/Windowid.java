package com.Selenium;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Windowid {

	static String Pid ="//button[@id='openwindow']";
	static String Pid2 ="//a[@id='opentab']";
	static WebDriver driver ;
	
	@BeforeClass
	public static void openbrowser()
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
	

	@Test
	public static  void windowhandle() throws InterruptedException
	{
		 System.out.println("1st page tittle ="+driver.getTitle());
		
		 String Parentid = driver.getWindowHandle();
	     driver.findElement(By.xpath(Pid2)).click();
	     Thread.sleep(5000);
	      
	     driver.findElement(By.xpath(Pid2)).click();
	     Thread.sleep(5000);
	     /*Set<String> child   =driver.getWindowHandles();
	     Iterator<String> itr =child.iterator();
	      System.out.println(child.size());
	     String main    = itr.next();
	     String childid =itr.next();
	     
	     driver.switchTo().window(childid);*/
	     
	     windowh(2); 
	     
	     System.out.println("title od the child page is ="+driver.getTitle());
	     driver.manage().window().maximize();
	     Thread.sleep(4000); 	
	     
	     
	     driver.close();
	     
	     windowh(1); 
	     
	 
	     
	     System.out.println("title od the main  page is ="+driver.getTitle());
	            
	      
	}
	public static  void windowh(int index) throws InterruptedException
	{
		String childid = null;
		 Set<String> child   =driver.getWindowHandles();
	     Iterator<String> itr =child.iterator();
		
		for( int i =0 ;i<=index ; i++)
		{
			childid =itr.next();
		}
		driver.switchTo().window(childid);
		
	}
	}
