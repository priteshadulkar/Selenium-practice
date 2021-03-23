package Facebookpage;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import TestBase.Base;

public class FacebookHomeassertioncheck extends Base {

	Base b = new Base();
	String actualtittle ="Facebook- log in or sign up" ;
	String namelogin = "//input[@name='email']";
	String pwd   = "//input[@name = 'pass']";
	String Loginbutton ="//button[@name = 'login']";
	String expactedtitle ="Facebook – log in or sign up";
	
	@BeforeClass
	public void launchHomepage()
	{
		Base b = new Base();
		b.startup();
		System.out.println("Home page launch successfully ");
		System.out.println("1");
		
		String Tittle =driver.getTitle();
		 System.out.println(Tittle);
		 
		 //Assert.assertNotEquals(Tittle, actualtittle);
		//Assert.assertEquals(Tittle ,expactedtitle );
		 //Assert.assertTrue(false, Tittle);
		// Assert.assertFalse(true, Tittle);//stop 
		//System.out.println("Tittle is matched of false assert "); //stop execution
		//  if we write here assert condition than its not allow to execution  
		 SoftAssert soft = new SoftAssert();
		 soft.assertEquals(Tittle, actualtittle);
		 //soft.assertNotEquals(Tittle, actualtittle);
		 //soft.assertTrue(false, actualtittle);
		 //soft.assertFalse(false, actualtittle);
		 //soft.assertNull(Tittle);
		 System.out.println("soft assertion executed");
		//soft.assertAll();// use assertAll to see at the end result and exception of the fail result

	}
	
	/*@Test(priority=0)
	public  void assertionc() 
	{
		// if we write here than it is just check condityon is true or not but it allow to execution becuse its is in different mnthod}
		 String Tittle =driver.getTitle();
		 System.out.println(Tittle);
		 
		//Assert.assertEquals(Tittle ,expactedtitle );
		//Assert.assertTrue(false, expactedtitle);// stop execution
		 
		 Assert.assertFalse(false, Tittle);
		System.out.println("Tittle is matched ");
		SoftAssert assert = new SoftAssert();
		a
		
		
		
	 }*/
	
	@Test(priority=1)
	public void login() throws InterruptedException
	{
		System.out.println("2");
		driver.findElement(By.xpath(namelogin)).click();
		driver.findElement(By.xpath(namelogin)).sendKeys("mayuradulkar.01@gmail.com");
		
		driver.findElement(By.xpath(pwd)).sendKeys("pritesh_0099");
		driver.findElement(By.xpath(Loginbutton)).click();
		
		
		Thread.sleep(2000);
	}
	// till now we get a assertion  now we are moving to the drop down list
	
	public void  dropdownlist()
	{
		//Select sl = new Select();
		
		
		
		
		
		
	}
	
	
}
