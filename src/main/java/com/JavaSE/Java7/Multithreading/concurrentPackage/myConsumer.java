package com.JavaSE.Java7.Multithreading.concurrentPackage;

import static com.JavaSE.Java7.Multithreading.concurrentPackage.mainMethod.EOF;

import java.util.List;

public class myConsumer implements Runnable {
	private String color;
    private List<String> buffer;
    public myConsumer(List<String> buffer , String color){
        this .buffer = buffer;
        this .color= color;
    }
    public void run(){
        while (true) {
            synchronized (buffer) {
                if (buffer.isEmpty()) {
                    continue;
                }
                if (buffer.get(0).equals(EOF)) {
                    System.out.println(color + "Exiting.... ");
                    break;
                } else {
                    System.out.println(color + "Removed " + buffer.remove(0));
                }
            }
        }
    }
}