package com.JavaSE.Java7.Multithreading.ProducedAndConsumer.BlockingQueue;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
	 
	 BlockingQueue queue=null;
	 
	 public Producer(BlockingQueue queue) {
	  super();
	  this.queue = queue;
	 }
	 
	 @Override
	 public void run() {
	  for (int i = 1; i <=50; i++) {
	   System.out.println("Produced item "+i);
	   try {
	    queue.put("item "+i);
	   } catch (InterruptedException e) {
	    
	    e.printStackTrace();
	   }
	  }
	  
	 }
}