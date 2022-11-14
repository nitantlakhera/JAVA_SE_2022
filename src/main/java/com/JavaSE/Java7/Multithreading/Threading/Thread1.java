package com.JavaSE.Java7.Multithreading.Threading;

public class Thread1 extends Thread {
 	public void run() {
      System.out.println(Color.ANSI_BLUE+"Running from the thread " + currentThread().getName()  );		
	  try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		System.out.println(Color.ANSI_BLUE+"Another thread woke me up");
		return;
	}
	  System.out.println(Color.ANSI_BLUE+"I am awake");
 	}
}
