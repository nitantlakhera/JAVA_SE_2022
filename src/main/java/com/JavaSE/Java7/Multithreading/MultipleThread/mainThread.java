package com.JavaSE.Java7.Multithreading.MultipleThread;

public class mainThread {
  public static void main(String args []) {
	  ConutDown countDown = new ConutDown();
	  CountDownThreads t1 = new CountDownThreads(countDown);
	  t1.setName("neha");
	  CountDownThreads t2 = new CountDownThreads(countDown);
	  t2.setName("roshni");
	  CountDownThreads t3 = new CountDownThreads(countDown);
	  t3.setName("megha");
	  
	  t1.start();
	  t2.start();
	  t3.start();
	  
  }
}
