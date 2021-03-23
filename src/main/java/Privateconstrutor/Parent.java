package Privateconstrutor;

public class Parent {

	public void mathod1()
	{
		
		System.out.println("parent class mathod1 called");
		
	}
	public void mathod2()
	{
		System.out.println("parent class mathod2 called");
	}
	
	private Parent()
	{
		System.out.println("Parent constructer called");
		
		
	}
	public static void main(String[] args)
	{
	Parent p1 = new Parent();
	p1.mathod1();
	p1.mathod2();
	}
}
