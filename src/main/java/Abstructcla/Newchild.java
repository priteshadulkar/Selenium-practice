package Abstructcla;

import Privateconstrutor.Parent;

public class Newchild extends NewParent {

	public void mathod1()
	{
		
		System.out.println("parent class mathod1 called");
		
	}
	public void mathod2()
	{
		System.out.println("parent class mathod2 called");
	}
	
    Newchild() //same private constructor can not be called
	{
		System.out.println("child constructer called");
		
		
	}
	public static void main(String[] args)
	{
	Newchild p1 = new Newchild();
	p1.mathod1();
	p1.mathod2();
	p1.p();
	System.out.println("===================================");
	
	
	NewParent p = new Newchild();
	p.mathod1();
	p.mathod2();// all child class method called but parent method also allow to call 
	p.p(); // it is same as c= new c
	}
}
