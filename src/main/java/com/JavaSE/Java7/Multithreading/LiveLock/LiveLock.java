package com.JavaSE.Java7.Multithreading.LiveLock;

public class LiveLock {
	    public static void main(String[] args) {
		    final Worker worker1 = new Worker("Worker 1", true);
	        final Worker worker2 = new Worker("Worker 2", true);
            final sharedResources resources = new sharedResources(worker1);
          new Thread(new Runnable() {
			@Override
			public void run() {
			   worker1.work(resources, worker2);	
			}
		}).start(); ;
          
          new Thread(new Runnable() {
			
			@Override
			public void run() {
			worker2.work(resources, worker1);	
			}
		}).start();;
	    }
}
