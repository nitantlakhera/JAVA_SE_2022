package com.JavaSE.Java7.AccessModifiersAndEncapsulation;

import java.io.IOException;

class Parent {
	public void get () throws IOException {
		System.out.println("Parent Method()");
	}
}

class Child extends Parent {
	public void get() throws IOException{
		System.out.println("Child Method()");
	}
}

public class AccessModifiers {
  public static void main(String args []) throws IOException {  
	 Parent p = new Child();
	 p.get();
  }
}