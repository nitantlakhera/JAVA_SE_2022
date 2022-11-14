package com.JavaSE.Java7.Multithreading.concurrency.ExecutorServices;

import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableTest {
   public static void main(String args[]) throws InterruptedException, ExecutionException {
	   
	   MyCallabe test = new MyCallabe();
	   
	   ArrayList<Future<String>> list = new ArrayList<Future<String>>();
	   
	   ExecutorService service = Executors.newFixedThreadPool(10);
	   
	   for(int i = 0; i< 100; i++) {
		   Future<String> result = service.submit(test);
		   list.add(result);      
	   }
	   
	   for(Future<String> fut : list) {
		   System.out.println(new Date() + " :: " + fut.get());
	   }
	   
	   System.out.println("--------List-------");
	   
	   for(int i =0 ; i<list.size() ; i++) {
		   System.out.println(i+ " "+list.get(i));
	   }
	   service.shutdown();
   }
}