package com.JavaSE.Java7.Multithreading.Starvation;

import com.JavaSE.Java7.Multithreading.MultipleThread.Color;

public class starvationOfThread {
    public static Object lock = new Object();
	public static void main(String args []) {
	Thread t1 = new Thread(new worker(Color.ANSI_BLUE) ,"Thread priority 10");
	Thread t2 = new Thread(new worker(Color.ANSI_GREEN),"Thread priority 8");
	Thread t3 = new Thread(new worker(Color.ANSI_RED),"Thread priority 6");
	Thread t4 = new Thread(new worker(Color.ANSI_CYAN),"Thread priority 4");
	Thread t5 = new Thread(new worker(Color.ANSI_PURPLE),"Thread priority 2");
	
	t1.setPriority(10);
	t2.setPriority(8);
	t3.setPriority(6);
	t4.setPriority(4);
	t5.setPriority(2);
	
	 t5.start();
	 t3.start();
	 t2.start();
	 t4.start();
	 t1.start();
	}
	public static class worker implements Runnable{
        private int counter = 1;
        private String color;
		public worker(String color) {
			super();
			this.color = color;
		}
		@Override
		public void run() {
		    synchronized (lock) {
		    	for(int i =0 ;i<100 ; i++) {
		    	   System.out.format(color + "%s: count = %d\n", Thread.currentThread().getName(), counter++);
		                 
		    		//critical section
			     }
		  }	
	   }
	}
}