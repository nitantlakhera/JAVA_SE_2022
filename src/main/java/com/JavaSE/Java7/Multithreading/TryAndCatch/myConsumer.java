package com.JavaSE.Java7.Multithreading.TryAndCatch;

import static com.JavaSE.Java7.Multithreading.concurrentPackage.mainMethod.EOF;

import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

import com.JavaSE.Java7.Multithreading.MultipleThread.Color;

public class myConsumer implements Runnable {
	private String color;
    private List<String> buffer;
    private ReentrantLock lock;
    public myConsumer(List<String> buffer , String color , ReentrantLock lock){
        this .buffer = buffer;
        this .color= color;
        this.lock = lock;
    }
    public void run(){
    	int counter = 0 ;
        while (true) {
                if(lock.tryLock()) {
                	try {
                        if (buffer.isEmpty()) {
                			//lock.unlock();
                  		     continue;
                         }
                         System.out.println(Color.ANSI_PURPLE +"the counter is ->  " +counter );
                         counter = 0;
                          if (buffer.get(0).equals(EOF)) {
                              System.out.println(color + "Exiting.... ");
                              //lock.unlock();
                              break;
                          } else {
                              System.out.println(color + "Removed " + buffer.remove(0));
                          }
           	    		}finally { 
           	    		  lock.unlock();
                		}
         	    }else {
         	    	counter++;
         	    }
         }
    }
}