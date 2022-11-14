package com.JavaSE.Java7.Multithreading.Threading;

class myThread_one extends Thread {
	public void run() {
		for(int i  = 0 ; i < 5 ; i++) {
			System.out.println( Color.ANSI_RED+ " thread one" );
		}
	}
}

class myThread_two extends Thread {
	public void run() {
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println( Color.ANSI_GREEN+" thread two");
		}
	}
}

public class Testing {
	
  public static void main(String args[]) throws InterruptedException {

	    myThread_one thread1 = new myThread_one();
	    myThread_two thread2 = new myThread_two();
	    thread1.start();
	    thread2.start();
	    
	    Thread threadRunnable = new Thread(new myTestRunnable());
	    threadRunnable.start();
	    System.out.println(Color.ANSI_BLACK+" Main thread ");
	    thread1.join();
	    thread2.join();
	    threadRunnable.join();
        System.out.println(Runtime.getRuntime().availableProcessors()); 
  }
}

class myTestRunnable implements Runnable {
	@Override
	public void run() {
		for(int i = 0; i < 5; i ++) {
			System.out.println(Color.ANSI_BLUE+" Runnable thread " );
		}
	}
}