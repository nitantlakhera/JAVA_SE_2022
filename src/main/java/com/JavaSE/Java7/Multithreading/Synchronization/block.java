package com.JavaSE.Java7.Multithreading.Synchronization;

public class block {
  public void printNumber(int n) throws InterruptedException { 
      System.out.println("BLOCK");
	  synchronized (this) {
	  for(int i = 1 ; i<=n ; i++) {
		  System.out.println(Thread.currentThread().getName() + " :: " + i );
		  Thread.sleep(500);
	  }
	  }
  }
}
