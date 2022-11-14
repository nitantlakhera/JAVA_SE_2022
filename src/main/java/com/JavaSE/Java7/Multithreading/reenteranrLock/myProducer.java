package com.JavaSE.Java7.Multithreading.reenteranrLock;

import java.util.List;
import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;


public class myProducer implements Runnable{
	private List<String> buffer;
    private String color;
    private ReentrantLock lock;
    public myProducer(List<String> buffer , String color , ReentrantLock lock){
        this.buffer=buffer;
        this.color=color;
        this.lock = lock;
    }
    public void run(){
        Random random = new Random();
        String number[]={"1","2","3","4","5"};
        for(String num : number){
            System.out.println(color+"Adding message ......" + num);
            lock.lock();
            try {
            	buffer.add(num);
            } finally {
             	lock.unlock();
            }
            try {
                Thread.sleep(random.nextInt(500));
            } catch (InterruptedException e) {
                System.out.println("Producer was interrupted ");
            }
        }
        System.out.println(color+"Adding EOF and exiting ...");
        lock.lock();   
    	try {
        	buffer.add("EOF"); 
        }finally {
        	lock.unlock();
       }
    }
}