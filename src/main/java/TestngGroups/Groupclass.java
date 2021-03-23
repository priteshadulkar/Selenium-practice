package TestngGroups;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Groupclass {

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
	
	@Test(groups= "smoke")
	public void mathod3()
	{
		System.out.println("@Test1 A called");
	}
	
	@Test(groups ="sanity")
	public void mathod4()
	{
		System.out.println("@Test1 4 called");
	}
	@Test(groups ="sanity")
	public void mathod5()
	{
		System.out.println("@Test1 5 called");
	}@Test(groups ="sanity")
	public void mathod6()
	{
		System.out.println("@Test1 6 called");
	}
	
}
