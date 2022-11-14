package com.JavaSE.Java7.Multithreading.concurrency.ExecutorServices;

import java.util.concurrent.Callable;

public class Task implements Callable<String>{

	String message;
	
	public Task(String message) {
		super();
		this.message = message;
	}
	
	@Override
	public String call() throws Exception {
		return "Hello " + message;
	}
}
