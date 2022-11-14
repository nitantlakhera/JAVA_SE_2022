package com.JavaSE.Java7.Multithreading.ProducedAndConsumer;

import java.util.Random;

public class reader extends Thread{

	private message message;
    public reader (message message){
        this.message= message;
    }
    public void run(){
        Random random = new Random();
        for(String latest_message = message.read_Message();!latest_message.equals("finish");latest_message = message.read_Message() ){
            System.out.println(Color.ANSI_GREEN+latest_message);
            try {
                Thread.sleep(random.nextInt(5000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
