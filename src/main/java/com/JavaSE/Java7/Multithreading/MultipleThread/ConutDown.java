package com.JavaSE.Java7.Multithreading.MultipleThread;

public class ConutDown {
    private int i ; //memory will get in heap area and it will be shared in between threads.
    // synchronized use in method, it will synchronized all the method.
    public void doCountDown() {
       String color;
       switch (Thread.currentThread().getName()) {
	   case "neha":
		   color = Color.ANSI_RED;
		   break;
	   case "roshni":
		   color = Color.ANSI_BLUE;
		   break;
	   default:
		    color = Color.ANSI_GREEN;
	   }
	   // shared resource, race condition can occur here
	   // here i is primitive type so we can not synchronized based on i.
       //Synchronized block
       //color does not work here because it is a local variable.
       //countDown reference
       //critical section
       synchronized (this) {
    	   for(i = 10; i>0 ;i--) {
    		   System.out.println(color + Thread.currentThread().getName() + " : i = " + i);
    	   }   
       }
   }
}