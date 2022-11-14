package com.JavaSE.Java7.ExceptionHandling;
class test {
	public static void get()  throws IllegalAccessException{
		System.out.println("Hello");
	}
}
public class ExceptionHandling {
    public static void main(String args[]) throws Exception {
    	try {
    		test.get();
    	} catch (IllegalAccessException e) {
    		System.out.println(e);
    	} 
    }
}