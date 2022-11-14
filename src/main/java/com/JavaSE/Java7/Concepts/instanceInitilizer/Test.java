package com.JavaSE.Java7.Concepts.instanceInitilizer;

public class Test {
   int speed;
   
   public Test(){
	  System.out.println("Constructor: " + speed);   
   }

   static {
	   System.out.println("Static block");
   }
   
   {
	   speed = 100;
       System.out.println("Instance Initilizer block called");
   }
   
   public static void main(String [] args) {
	   Test t1 = new Test();
	   
	   System.out.println();
	   System.out.println("--------");
	   System.out.println();
	   
	   Test t2 = new Test();
   }
}
