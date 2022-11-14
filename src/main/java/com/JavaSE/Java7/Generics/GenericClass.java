package com.JavaSE.Java7.Generics;

public class GenericClass<T> {
    private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
    public static void main(String args []) {
        GenericClass<String> g1 = new GenericClass<String>();
        g1.setT("hello");
        System.out.println(g1.getT());
        GenericClass<Integer> g2 = new GenericClass<Integer>();
        g2.setT(12);
        System.out.println(g2.getT());
    }
}
