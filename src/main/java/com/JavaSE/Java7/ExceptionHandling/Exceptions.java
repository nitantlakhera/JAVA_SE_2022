package com.JavaSE.Java7.ExceptionHandling;

class ParentClass {
	public void get() {
		System.out.println("ParentClass");
	}
}
class ChildClass extends ParentClass {
    public void get() throws ArithmeticException{
		System.out.println("ChildClass");
	}
}
public class Exceptions {
	public static void main(String args []) {
		ParentClass p = new ChildClass();
		p.get();// RTP
	}
	public static int get () {
		try {
		   int num1=30, num2=0;
	       int output=num1/num2;
	       System.out.println(output);
	       return 12;
		} catch (Exception e) {
			return 10;
		}
	}
}