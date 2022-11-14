package com.JavaSE.Java7.Multithreading.Threading;

public class MainThread {
	public static void main(String[] args) {
		System.out.println(Color.ANSI_PURPLE +"Running from the main Thread");
		Thread1 thread1 = new Thread1();
		thread1.setName("number 01");
		thread1.start();
		//thread.start();// Throw an exception (java.lang.IllegalThreadStateException)
	   new Thread() {
		   public void run() {
			   System.out.println(Color.ANSI_GREEN+"Runnign from the Annonomsus class");
		   }
	   }.start();
	   
	   //Thread myRunnableWithoutAnnonomus = new Thread(new MyRunnable());
	   //myRunnableWithoutAnnonomus.start();
	   
	   Thread myRunnable = new Thread(new MyRunnable() {
		 public void run() {   
			 System.out.println(Color.ANSI_RED+ "Running from the runnable from Main");
			 try {
				thread1.join();
				System.out.println("is dead -> "  + thread1.isAlive());
				System.out.println(Color.ANSI_RED+" thread terminated so i am running again");
			} catch (InterruptedException e) {
			  System.out.println(Color.ANSI_RED+"I could not wait after all i was interrupted");
			}
		 }
	   });
	   myRunnable.start();
	   System.out.println(Color.ANSI_PURPLE+"Running again from the main class");
	}
}