package com.JavaSE.Java7.ExceptionHandling;

public class Test1 {
	public static void main(String args []) 
	{
	   try {
		   throw new ArithmeticException();    
	   } catch (Exception e) {
		   System.out.println("elaknit  "+e);
	   }
	}
	@SuppressWarnings("finally")
	public static int get() {
		try {
			return 1;
		} catch (Throwable e) {
			return 2;
		} finally {
			return 3;
		}
	}
}