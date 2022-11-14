package com.JavaSE.Java7.Multithreading.ProducedAndConsumer;

import java.util.Random;

public class writer implements Runnable{
	private message message;
    public writer(message message ){
        this.message = message ;
    }

     public void run(){
             String messages []={
             "hello boys",
             "hello girls",
             "hello every one",
             "where all u from"};
    Random  random = new Random();
    for(int i =0 ; i<messages.length ; i ++){
        message.write(messages[i]);
        try {
            Thread.sleep(random.nextInt(5000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    message.write("finish");
}
}