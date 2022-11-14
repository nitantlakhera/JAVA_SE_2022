package com.DesignPattern.Singleton;

public class singletonClassSynchronizedBlock {
  private static singletonClassSynchronizedBlock instance;
  private singletonClassSynchronizedBlock() {};
  public static singletonClassSynchronizedBlock getInstance() {
	  if(instance == null) {
		  synchronized (singletonClassSynchronizedBlock.class) {
			if(instance==null) {
				instance = new singletonClassSynchronizedBlock();
			}
		 }
	  }
	  return instance;
  }
}
