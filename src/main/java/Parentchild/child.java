package Parentchild;

public class child extends Parent {

	public void mathod1()
	{
		
		System.out.println("child class mathod1 called");
		
	}
	public void mathod2()
	{
		System.out.println("child class mathod2 called");
		
	}
	
	public void mathod4()
	{
		System.out.println("child class mathod4 called");
		
	}
	public static void main(String[] args)
	{
		child c = new child();
		c.mathod1();
		c.mathod2();
		c.mathod3(); // from parent called
		// all child base mathod called as wel as parent class
		System.out.println("=================");
		Parent p = new child();
		p.mathod1();
		p.mathod2();
		p.mathod3();// from parent called
	// again all child mathod called as well as parent class   
		//child c1 = new Parent();
//		it is not allow 
		System.out.println("=================");
		Parent p1 = new Parent();
		p1.mathod1();
		p1.mathod2();
		
		///it called only parent class method
		
	}
	
	
	
	
}
