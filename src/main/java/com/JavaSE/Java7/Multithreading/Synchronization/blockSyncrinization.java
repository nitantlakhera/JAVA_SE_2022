package com.JavaSE.Java7.Multithreading.Synchronization;

public class blockSyncrinization {
   public static void main(String args[]) {
	     block b = new block();
	     
	     Runnable runnable = new Runnable() {
			@Override
			public void run() {
		      try {
				b.printNumber(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	   	
		  }
	    };
	    new Thread(runnable , "ONE ").start();
	    new Thread(runnable  , "TWO ").start();
   }
}
