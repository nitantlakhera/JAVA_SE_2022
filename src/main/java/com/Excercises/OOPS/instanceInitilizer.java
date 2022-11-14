package com.Excercises.OOPS;

public class instanceInitilizer {
	{
		System.out.println("instance initilier block1");
	}

	static {
	   System.out.println("static block");	
	}
	
	{
		System.out.println("instance initilier block2");
	}
	
	public instanceInitilizer() {
	     System.out.println("construcuor called");
	}

    public static void main(String args[]) {
		instanceInitilizer i = new instanceInitilizer();
	    System.out.println(i);
    }
}