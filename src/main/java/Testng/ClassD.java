package Testng;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClassD {

	@BeforeTest
	public void mathod1()
	{
		
		System.out.println("DClass @BeforeTest called");
		
	}
	@BeforeClass
	public void mathod2()
	{
		System.out.println("DClass @Beforeclass called");
	}
	
	@Test
	public void mathod3()
	{
		System.out.println("DClass @Test called");
	}
	@BeforeMethod
	public void mathod4()
	{
		System.out.println("DClass @BeforeMethod called");
	}
	@Test
	public void mathod5()
	{
		System.out.println("DClass @Test2 called");
	}
	
}
