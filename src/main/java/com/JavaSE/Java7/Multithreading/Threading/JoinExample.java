package com.JavaSE.Java7.Multithreading.Threading;

public class JoinExample extends Thread {
   public int processingCount = 0;

public JoinExample(int processingCount) {
	super();
	this.processingCount = processingCount;
    System.out.println("Thread created");
}
public void run() {
    System.out.println("Thread " + this.getName() + " started");
    while (processingCount > 0) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Thread " + this.getName() + " interrupted");
        }
        processingCount--;
    }
    System.out.println("Thread " + this.getName() + " exiting");
}  
  public static void main(String args []) throws InterruptedException {
	  Thread thread = new JoinExample(1);
	  thread.start();
	  System.out.println("Invoking Join");
	  thread.join();
	  if(thread.isAlive()) {
		  System.out.println("thread is not dead");
	  }else {
		  System.out.println("Thread is dead");
	  }
  }
}