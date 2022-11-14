package com.JavaSE.Java7.Multithreading.ProducedAndConsumer;

public class message {
	private String message;
    private boolean empty= true;
    public synchronized String read_Message(){
        while(empty){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        empty = true;
        notifyAll();
        System.out.println(Color.ANSI_RED+"message is ->  " +message);
        return message;
    }

    public synchronized void write(String message){
    while (!empty){
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    empty = false;
    this.message = message;
    notifyAll();
    }
}