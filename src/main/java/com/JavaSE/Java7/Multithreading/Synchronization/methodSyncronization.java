package com.JavaSE.Java7.Multithreading.Synchronization;

public class methodSyncronization {
  public static void main(String args []) {
	   method m = new method(); 
	    Runnable runnable = new Runnable() {
		@Override
		public void run() {
			try {
				m.print(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	};
	
	new Thread(runnable , "ONE").start();
	new Thread(runnable , "TWO").start();
  }
}  
