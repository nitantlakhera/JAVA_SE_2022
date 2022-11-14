package com.JavaSE.Java7.Multithreading.ProducedAndConsumer;

public class mainMethod {
  public static void main(String args []) {
	  message message = new message();
      (new Thread(new writer(message))).start();
      (new Thread((new reader(message)))).start();

  }
} 
