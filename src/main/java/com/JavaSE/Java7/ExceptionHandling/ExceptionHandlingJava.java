package com.JavaSE.Java7.ExceptionHandling;

import java.io.IOException;
import java.sql.SQLException;
class A {
    public void get() {
    	System.out.println("A()");
    }
}
class B extends A {
    public void get() {
		System.out.println("B()");
	}
}
class multiCatch {
	@SuppressWarnings("finally")
	public int getMethod() {
		try {
			return 1;
		} catch (ArithmeticException e) {
			return 2;
		} catch (Exception e) {
			return 10;
		} catch (Throwable e) { 
		    return 3;
		} finally {
			return 4;
		}
		// return 5;  CT
	}
}
class throwError {
	public static void throwErr() {
	   throw new Error();
	}
}

class throwErrorChild {
	
}

public class ExceptionHandlingJava {
   public static void main(String args []) throws Exception {
	   multiCatch m = new multiCatch();
	   System.out.println(m.getMethod());
   }
}