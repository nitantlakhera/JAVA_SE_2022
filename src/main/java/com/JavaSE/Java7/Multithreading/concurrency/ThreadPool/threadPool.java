package com.JavaSE.Java7.Multithreading.concurrency.ThreadPool;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class threadPool {
  public static void main(String args[]) {
	  ThreadPoolExecutor thread = (ThreadPoolExecutor) Executors.newFixedThreadPool(4);
	  for(int i = 0  ; i < 5 ; i++) {
		  Task t = new Task("Task " + i);
		  System.out.println(" "+ t.getName());
		  thread.execute(t);
	  }
	  thread.shutdown();
    }
}
