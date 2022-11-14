package com.Excercises.OOPS;

public abstract class AbstractClass {
   public AbstractClass() {
        System.out.println("Constructure");
   }
   
   abstract void run();
   
   void changeGear(){
	   System.out.println("gear changed");
   }  
}
