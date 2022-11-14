package com.JavaSE.Java7.Multithreading.ProducedAndConsumer.BlockingQueue;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
	 
	 BlockingQueue queue=null;
	 
	 public Consumer(BlockingQueue queue) {
	  super();
	  this.queue = queue;
	 }
	 
	 @Override
	 public void run() {
	 
	  while(true)
	  {
	   try {
	    System.out.println("Consumed "+queue.take());
	   } catch (InterruptedException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	   }
	  }
	 }
}