package com.JavaSE.Java7.Concepts;

public class Test {
	
	public static void main(String args[]) {
		  A aObj = new A();
		  aObj.parent();
		  System.out.println(aObj.a);
		  aObj.ToOverride();// parent class method
		  System.out.println();
		  
		  A s = new B();
		  s.parent();
		  System.out.println(s.a);
		  s.ToOverride();// child class method
		  System.out.println();
		  
		  B obj = new B();
		  obj.child();
		  obj.parent();
		  System.out.println(obj.a);
		  obj.ToOverride();// child class method
		  System.out.println(obj.b);
	}
}
