package com.JavaSE.Java7.Multithreading.concurrentPackage;

import java.util.List;
import java.util.Random;

public class myProducer implements Runnable{
	private List<String> buffer;
    private String color;
    public myProducer(List<String> buffer , String color){
        this.buffer=buffer;
        this.color=color;
    }
    public void run(){
        Random random = new Random();
        String number[]={"1","2","3","4","5"};
        for(String num : number){
            System.out.println(color+"Adding message ......" + num);
            synchronized (buffer) {
                buffer.add(num);
            }
            try {
                Thread.sleep(random.nextInt(500));
            } catch (InterruptedException e) {
                System.out.println("Producer was interrupted ");
            }
        }
        System.out.println(color+"Adding EOF and exiting ...");
        synchronized (buffer) {
            buffer.add("EOF");
        }
    }
}
