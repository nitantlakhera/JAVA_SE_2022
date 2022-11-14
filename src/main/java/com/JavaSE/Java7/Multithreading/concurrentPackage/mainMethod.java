package com.JavaSE.Java7.Multithreading.concurrentPackage;

import java.util.ArrayList;
import java.util.List;

import com.JavaSE.Java7.Multithreading.MultipleThread.Color;

public class mainMethod {
	public static final String EOF ="EOF";
    public static void main(String args []) {
    List<String> buffer = new ArrayList<String>();
    myProducer producer  = new myProducer(buffer, Color.ANSI_BLUE);
    myConsumer consumer1 = new myConsumer(buffer, Color.ANSI_GREEN);
    myConsumer consumer2 = new myConsumer(buffer, Color.ANSI_GREEN);
    new Thread(producer).start();
    new Thread(consumer1).start();
    new Thread(consumer2).start();
    }
}