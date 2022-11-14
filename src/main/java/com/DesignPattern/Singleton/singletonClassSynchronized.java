package com.DesignPattern.Singleton;

public class singletonClassSynchronized {
  private static singletonClassSynchronized instance;
  private singletonClassSynchronized() {};
  public static synchronized singletonClassSynchronized getInstance() {
	  if(instance ==  null) {
		  instance = new singletonClassSynchronized();
	  }
	  return instance;
  }
}
