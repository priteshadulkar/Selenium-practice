package Privateconstrutor;

public class child extends Parent {

	public void mathod1()
	{
		
		System.out.println("child class mathod1 called");
		
	}
	public void mathod2()
	{
		System.out.println("child class mathod2 called");
		
	}
	child()// if we write parent class constructor  as a private so in child class it can not inherit.
	{
		System.out.println("child construter called");
	}
	public static void main(String[] args)
	{
		child c = new child();
		c.mathod1();
		c.mathod2();
		// all child base method called with parent constructor called and child constructor also called
		System.out.println("===================================");
		Parent p = new child();
		p.mathod1();
		p.mathod2();
		System.out.println("===================================");
		// again all child method called  with parent constructor called and child constructor also called
//      child c1 = new Parent();
//		it is not allow 
		
		Parent p1 = new Parent();
		p1.mathod1();
		p1.mathod2();
		// it called only child method with parent constructor called only
		System.out.println("===================================");
		
	}
	// if we write parent and child constrroter than both is call same time 
	
	
	
}
