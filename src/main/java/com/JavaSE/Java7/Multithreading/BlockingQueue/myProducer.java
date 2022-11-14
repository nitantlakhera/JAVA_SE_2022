package com.JavaSE.Java7.Multithreading.BlockingQueue;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;

public class myProducer implements Runnable{
	private ArrayBlockingQueue<String> buffer;
    private String color;
    public myProducer(ArrayBlockingQueue<String> buffer , String color){
        this.buffer=buffer;
        this.color=color;
    }
    public void run(){
        Random random = new Random();
        String number[]={"1","2","3","4","5"};
        for(String num : number){
            System.out.println(color+"Adding message ......" + num);
            try {
					buffer.put(num);
				    Thread.sleep(random.nextInt(500));
		    } catch (InterruptedException e) {
                System.out.println("Producer was interrupted ");
            }
        }
        System.out.println(color+"Adding EOF and exiting ...");
          try {
				buffer.put("EOF");
		  } catch (InterruptedException e) {
		} 
    }
}