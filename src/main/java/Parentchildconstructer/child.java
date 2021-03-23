package Parentchildconstructer;

public class child extends Parent {

	public void mathod1()
	{
		
		System.out.println("child class mathod1 called");
		
	}
	public void mathod2()
	{
		System.out.println("child class mathod2 called");
		
	}
	child()
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
		// again all child method called  with parent constructor called and child constructor also called and also called parent mathod
//      child c1 = new Parent(); it is not allow 
		
		Parent p1 = new Parent();
		p1.mathod1();
		p1.mathod2();
		// it called only Parent method with parent constructor called only
		System.out.println("===================================");
		
	}
	// if we write parent and child constrroter than both is call same time 
	
	
	
}
