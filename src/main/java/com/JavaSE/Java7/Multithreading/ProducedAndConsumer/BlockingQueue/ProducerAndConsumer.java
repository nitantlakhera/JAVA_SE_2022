package com.JavaSE.Java7.Multithreading.ProducedAndConsumer.BlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerAndConsumer {
	public static void main(String args[]) 
	{
		  BlockingQueue queue=new ArrayBlockingQueue(10);
		  Producer producer=new Producer(queue);
		  Consumer consumer=new Consumer(queue);
		  new Thread(producer).start();
		  new Thread(consumer).start();
	}
}