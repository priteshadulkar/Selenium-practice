package Testng;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClassE {
	@BeforeTest
	public void mathod1()
	{
		
		System.out.println("EClassE @BeforeTest called");
		
	}
	@BeforeClass
	public void mathod2()
	{
		System.out.println("EClassE @Beforeclass called");
	}
	
	@Test
	public void mathod3()
	{
		System.out.println("EClassE @Test called");
	}
	@BeforeMethod
	public void mathod4()
	{
		System.out.println("EClassE @BeforeMethod called");
	}
	@Test
	public void mathod5()
	{
		System.out.println("EClassE @Test2 called");
	}
	// 1ST cLASS D @Before Test method is execute  than Class E @Before Test  execute than D all method than E all Method
	/*DClass @BeforeTest called
	EClassE @BeforeTest called
	DClass @Beforeclass called
	DClass @BeforeMethod called
	DClass @Test called
	DClass @BeforeMethod called
	DClass @Test2 called
	EClassE @Beforeclass called
	EClassE @BeforeMethod called
	EClassE @Test called
	EClassE @BeforeMethod called
	EClassE @Test2 called*/

}
