package com.JavaSE.Java7.Interface;
class test implements printable {
	public void print() {
		System.out.println("hello world");
	}
	public static void main(String args []) {
		printable p = new test();
		p.print();
		test t = new test();
		t.print();
	}
	
}