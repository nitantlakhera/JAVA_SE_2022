package com.JavaSE.Java7.Multithreading.concurrency.ExecutorServices;

import java.util.concurrent.Callable;

public class MyCallabe implements Callable<String>{
	@Override
	public String call() throws Exception {
		Thread.sleep(1000);
		return Thread.currentThread().getName();
	}
}
