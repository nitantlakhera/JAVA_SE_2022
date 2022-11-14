package com.JavaSE.Java7.Multithreading.DeadLock;

public class DeadLock {
   public static Object lock1 = new Object();
   public static Object lock2 = new Object();
   
   public static void main(String args []) {
	new Thread(new thread_one()).start();
	new Thread(new thread_two()).start();
   }
  
public static class thread_one extends Thread{
	public void run() {
		synchronized(lock1) {
		  System.out.println("Thread one has lock1");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
			}
			System.out.println("Thread one waiting for lock two");
			synchronized (lock2) {
			  System.out.println("Thread one has lock2");
			}
			System.out.println("Thread one released lock two");
		}
		System.out.println("Thread two released lock1 and exiting...");
	}		
}
public static class thread_two extends Thread{
	 public void run() {
		 synchronized (lock2) {
			System.out.println("Thread two has lock2");
			try {
				Thread.sleep(100);
		  } catch (InterruptedException e) {
		  }
			System.out.println("Thread two waiting for lock one");
			synchronized (lock1) {
			System.out.println("Thread two has lock one");	
			}
			System.out.println("Thread two has released lock one");
		}
		 System.out.println("Thread two has released lock two");
	 }
   }
}