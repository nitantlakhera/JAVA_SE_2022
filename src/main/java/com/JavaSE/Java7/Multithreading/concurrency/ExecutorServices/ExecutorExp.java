package com.JavaSE.Java7.Multithreading.concurrency.ExecutorServices;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorExp {
 public static void main(String args []) throws InterruptedException, ExecutionException {
	 Task task = new Task("World");
	 ExecutorService executorService = Executors.newFixedThreadPool(4);
	 Future<String> result = executorService.submit(task);
	 System.out.println(result.get());
	 executorService.shutdown();
 }
}
