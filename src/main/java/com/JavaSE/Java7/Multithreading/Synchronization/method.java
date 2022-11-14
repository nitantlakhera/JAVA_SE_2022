package com.JavaSE.Java7.Multithreading.Synchronization;

public class method {
    public synchronized void print(int n) throws InterruptedException {
    	System.out.println("METHOD");
    	for(int i =0; i< n ; i++) {
    		System.out.println(Thread.currentThread().getName() +" :: "+ i);
    		Thread.sleep(500);
    	}
    }
}
