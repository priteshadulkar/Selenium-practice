package TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Base {

	 public static  WebDriver driver ;
	public Properties pro ;
	String tittle ;
	public void Property() throws IOException
	{
	FileInputStream fis = new FileInputStream("D:\\JenkinsWorkspace\\SeleniumPracticeOnly\\src\\main\\java\\com\\configur\\PropertiesFile");
	pro.load(fis);
	
	
	}
	
	public void startup()
	{
		 System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver2.44\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.navigate().to("https://www.facebook.com/");
		 System.out.println("user login sucessfully");
		 driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		 /*tittle=   driver.getTitle();
		 System.out.println(tittle);*/
	}  
	
}
