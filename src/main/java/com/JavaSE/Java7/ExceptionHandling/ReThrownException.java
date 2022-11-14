package com.JavaSE.Java7.ExceptionHandling;

public class ReThrownException {
	public static void main(String args[]) {
	    try {	
	    	String s = null;
	        System.out.println(s.length());
	    } catch (ArrayIndexOutOfBoundsException ex) {
	    	throw new NullPointerException();
	    } catch (NullPointerException e) {
	    	System.out.println("Catched " + e);
	    }
	}
	
}
