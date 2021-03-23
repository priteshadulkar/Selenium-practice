package Testng;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClassB {

	@BeforeSuite 
	public void mathod1()
	{
		
		System.out.println("BeforeSuite B  mathod called");
		
	}
	@BeforeClass
	public void mathod2()
	{
		System.out.println("BeforeClass B  mathod called");
	}
	
	@Test
	public void mathod3()
	{
		System.out.println("@Test1  B called");
	}
	@BeforeTest
	public void mathod4()
	{
		System.out.println("@BeforeTest B   mathod called");
	}
    @Test(priority = 1)
	public void mathod5()
	{
		System.out.println("priority = 1B called");
	}
    
    @Test(priority = 2)
   	public void mathod6()
   	{
   		System.out.println("priority = 2B called");
   	}
    @Test(priority = 3)
   	public void mathod7()
   	{
   		System.out.println("priority = 3B called");
   	}
  /*  @Test
   	public void mathod8()
   	{
   		System.out.println("parent class mathod8 called");
   	}*/
    
    @Test
   	public void mathod9()
   	{
   		System.out.println("@Test2B  called");
   	}
    /*Order is 
     * @BeforeSuite  mathod called
    @BeforeTest mathod called
    BeforeClass mathod called
    @Test1 called
    @Test2 called
    priority = 1called
    priority = 2called
    priority = 3called*/
}
