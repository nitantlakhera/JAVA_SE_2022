package com.JavaSE.Java7.Multithreading.ThreadPooling;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.ReentrantLock;

import com.JavaSE.Java7.Multithreading.MultipleThread.Color;

public class mainMethod {
	public static final String EOF ="EOF";
    public static void main(String args []) {
    List<String> buffer = new ArrayList<String>();
    ReentrantLock lock = new ReentrantLock();
    ExecutorService executorService = Executors.newFixedThreadPool(5);
    myProducer producer  = new myProducer(buffer, Color.ANSI_BLUE , lock);
    myConsumer consumer1 = new myConsumer(buffer, Color.ANSI_GREEN , lock);
    myConsumer consumer2 = new myConsumer(buffer, Color.ANSI_GREEN , lock);
    System.out.println("by thread pooling");
    executorService.execute(producer);
    executorService.execute(consumer1);
    executorService.execute(consumer2);
    
    Future<String > future = executorService.submit(new Callable<String>() {
		@Override
		public String call() throws Exception {
            System.out.println(Color.ANSI_RED +"I am printed for a callable class");
		return "this class s callable result";
		}
	}) ;
    try {
		System.out.println("the future value is --> "+future.get());
	} catch (InterruptedException e) {
	} catch (ExecutionException e) {
	}
    executorService.shutdown();
    }
}