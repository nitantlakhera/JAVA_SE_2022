package com.JavaSE.Java7.Generics;

public class GenericMethod {
	public <T> void test (T element) {
		System.out.println(element.getClass().getName() + 
                " = " + element);
	}
    public static void main(String args[]) {
    	GenericMethod g = new GenericMethod();
    	g.test("hello");
    	g.test(12);
    }
}
