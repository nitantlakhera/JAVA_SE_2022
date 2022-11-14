package com.DesignPattern.Singleton;

public class singletonClassLazy {
  private static singletonClassLazy instance;
  private singletonClassLazy() {};
  public static singletonClassLazy getInstance() { 
	  if(instance ==  null) {
		  instance = new singletonClassLazy();
	  }
	  return instance;
  }
}
