package com.JavaSE.Java7.Concepts.instanceInitilizer;

class parent {
	
	public parent() {
	  System.out.println("parent constructor" );
	}
	
}


class child extends parent{
	int speed;
	public child() {
		super();
		System.out.println("child constructor " + speed);
	}
	
	{
		speed =  100;
		System.out.println("Instance initilizer block");
	}
}

public class Test2 {
  
	public static void main(String args[])  {
	    child c = new child();
    }
	
}
