package com.JavaSE.Java7.Multithreading.MultipleThread;

public class CountDownThreads extends Thread {
     public ConutDown countDown;
     public CountDownThreads(ConutDown countDown) {
    	 this.countDown = countDown;
     }
     public void run() {
    	 countDown.doCountDown();
     }
}
