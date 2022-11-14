package com.DesignPattern.Singleton;

public class singletonClassEager {
    private static singletonClassEager instance = new singletonClassEager();
    private singletonClassEager() {};
    public static singletonClassEager getInstance() {
    	return instance;
    }
}
