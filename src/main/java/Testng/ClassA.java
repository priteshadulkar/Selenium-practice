package Testng;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClassA {


	@BeforeSuite 
	public void mathod1()
	{
		
		System.out.println("BeforeSuite A mathod called");
		
	}
	@BeforeClass
	public void mathod2()
	{
		System.out.println("BeforeClass A mathod called");
	}
	
	@Test
	public void mathod3()
	{
		System.out.println("@Test1 A called");
	}
	@BeforeTest
	public void mathod4()
	{
		System.out.println("@BeforeTest A  mathod called");
	}
    @Test(priority = 1)
	public void mathod5()
	{
		System.out.println("priority = 1Acalled");
	}
    
    @Test(priority = 2)
   	public void mathod6()
   	{
   		System.out.println("priority = 2Acalled");
   	}
    @Test(priority = 3)
   	public void mathod7()
   	{
   		System.out.println("priority = 3Acalled");
   	}
    @BeforeMethod()
   	public void mathod8()
   	{
   		System.out.println(" @BeforeMathod() A called");
   	}
    
    @Test
   	public void mathod9()
   	{
   		System.out.println("@Test2A called");
   	}  // order is with BeforeMethod is always execute before every @test mathod
    /*@BeforeSuite  mathod called
    @BeforeTest mathod called
    BeforeClass mathod called
     @BeforeMathod() called
    @Test1 called
     @BeforeMathod() called
    @Test2 called
     @BeforeMathod() called
    priority = 1called
     @BeforeMathod() called
    priority = 2called
     @BeforeMathod() called
    priority = 3called*/
}
