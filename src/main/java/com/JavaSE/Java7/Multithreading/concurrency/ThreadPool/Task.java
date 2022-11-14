package com.JavaSE.Java7.Multithreading.concurrency.ThreadPool;

import java.util.concurrent.TimeUnit;

public class Task implements Runnable{

	String name;
	
	public Task(String name) {
	   this.name = name;
	}
	 
	public String getName() {
		return name;
	}
	
	@Override
	public void run() {
		try {
	        Long duration = (long) (Math.random() * 10);
	        System.out.println("Executing : " + name);
	        TimeUnit.SECONDS.sleep(duration);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }	
	}
}