package com.JavaSE.Java7.Concepts;

class Parent {
   public  void get() {
	   System.out.println("Parent method");
   }
}

public class Child extends Parent {
      public void get() {
    	  System.out.println("Child cmethod");
      }
      public static void main(String args[]) {
    	  Parent p = new Child();
    	  p.get();
      }
}
