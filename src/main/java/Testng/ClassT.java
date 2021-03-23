package Testng;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClassT {
	@BeforeTest
	public void mathod1()
	{
		
		System.out.println("3Class @BeforeTest called");
		
	}
	@BeforeClass
	public void mathod2()
	{
		System.out.println("3Class @Beforeclass called");
	}
	
	@Test
	public void mathod3()
	{
		System.out.println("3Class3 @Test called");
	}
	@BeforeMethod
	public void mathod4()
	{
		System.out.println("Class3 @BeforeMethod called");
	}
	@Test
	public void mathod5()
	{
		System.out.println("3Class3 @Test2 called");
	}
	/*DClass @BeforeTest called
	EClassE @BeforeTest called
	3Class @BeforeTest called
	DClass @Beforeclass called
	DClass @BeforeMethod called
	DClass @Test called
	DClass @BeforeMethod called
	DClass @Test2 called
	EClassE @Beforeclass called
	EClassE @BeforeMethod called
	EClassE @Test called
	EClassE @BeforeMethod called
	EClassE @Test2 called
	3Class @Beforeclass called
	Class3 @BeforeMethod called
	3Class3 @Test called
	Class3 @BeforeMethod called
	3Class3 @Test2 called
*/
}
