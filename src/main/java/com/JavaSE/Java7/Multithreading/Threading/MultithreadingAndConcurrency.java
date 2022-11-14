package com.JavaSE.Java7.Multithreading.Threading;

class sharedResource {
   synchronized void print(int n) {
	 for(int i =0 ; i < 5 ; i++) {
		 System.out.println(i*n + " " +Thread.currentThread().getName());
		      try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}  
     }
   }
}

class Th1 extends Thread {
   sharedResource shared;
   public Th1(sharedResource shared) {
		 super();
		 this.shared = shared;
	 }
	 public void run() {
		 shared.print(1);	
	 }
}

class Th2 extends Thread {
  sharedResource shared;
 public Th2(sharedResource shared) {
	 super();
	 this.shared = shared;
 }
 public void run() {
	 shared.print(2);	
 }
}

class Th3 extends Thread {
  sharedResource shared;
  public Th3(sharedResource shared) {
		 super();
		 this.shared = shared;
  }
  public void run() {
		 shared.print(3);	
  }
}

public class MultithreadingAndConcurrency {
   public static void main(String args[]) {
	   sharedResource shared = new sharedResource();
	   Th1  t1 = new Th1(shared);
	   Th2  t2 = new Th2(shared);
	   Th3  t3 = new Th3(shared);
       t1.start();
       t2.start();
       t3.start();
   }
}
