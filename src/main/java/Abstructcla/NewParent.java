package Abstructcla;

public abstract class NewParent {

	abstract  void mathod1();
	
	abstract  void mathod2();
	
  // private 	NewParent()  if we write than not allow to extand abstruct class
	 	NewParent()
	{
		System.out.println("Parent construter called");
	}
   public void p()
   {
	   System.out.println("not abstract mathod called");
   }
	
}
