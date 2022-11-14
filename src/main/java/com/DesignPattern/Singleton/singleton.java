package com.DesignPattern.Singleton;

public class singleton {
    public static void main(String args[]) {
    	singletonClassEager instance1 =  singletonClassEager.getInstance();
    	System.out.println(instance1);
    	singletonClassEager instance2 =  singletonClassEager.getInstance();
    	System.out.println(instance2);
    	System.out.println();
    	singletonClassLazy instance3 = singletonClassLazy.getInstance();
    	System.out.println(instance3);
    	singletonClassLazy instance4 = singletonClassLazy.getInstance();
    	System.out.println(instance4);
    }
}