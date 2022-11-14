package com.JavaSE.Java7.Multithreading.reenteranrLock;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

import com.JavaSE.Java7.Multithreading.MultipleThread.Color;

public class mainMethod {
	public static final String EOF ="EOF";
    public static void main(String args []) {
    List<String> buffer = new ArrayList<String>();
    ReentrantLock lock = new ReentrantLock();
    myProducer producer  = new myProducer(buffer, Color.ANSI_BLUE , lock);
    myConsumer consumer1 = new myConsumer(buffer, Color.ANSI_GREEN , lock);
    myConsumer consumer2 = new myConsumer(buffer, Color.ANSI_GREEN , lock);
    new Thread(producer).start();
    new Thread(consumer1).start();
    new Thread(consumer2).start();
    }
}