package com.JavaSE.Java7.OOPs.Overriding;

class A {
	void show() {
		System.out.println("parent class show");
	}
}

class Test1 extends A {
    void show() {
		System.out.println("child class show");
	}
	
	public static void main(String args[]) {
		 A b = new Test1();
		 A a = new A();
		 b.show();
         a.show();
	}
}

