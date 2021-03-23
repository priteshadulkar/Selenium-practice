package TestngGroups;

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
   		System.out.println("@BeforeMathod() A called");
   	}
    
    @Test(dependsOnMethods ="mathod3")
   	public void mathod9()
   	{
   		System.out.println("dependsOnMethods 9 called");
   	}  // order is with BeforeMethod is always execute before every @test mathod
    
    @Test(dependsOnMethods ="mathod3")
   	public void mathod10()
   	{
   		System.out.println("dependsOnMethods 10 called");
   	}  // order is with BeforeMethod is always execute before every @test mathod
    
}
