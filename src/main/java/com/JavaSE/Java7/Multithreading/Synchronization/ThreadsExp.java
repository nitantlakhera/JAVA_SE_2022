package com.JavaSE.Java7.Multithreading.Synchronization;

public class ThreadsExp extends Thread {
   public static void main(String args[]) {
	   System.out.println("using main");
	   ThreadsExp thread = new ThreadsExp();
	   thread.start();
   }
   public void run() {
	   System.out.println("using threads");
   }
}
