package com.JavaSE.Java7.OOPs.MultipleInheritance;

public class C implements A,B {
  public static void main(String args[]) {
	  C c = new C();
	  c.show();
	  c.print();
  }
  
@Override
public void show() {
	System.out.println("Class A::");
}
@Override
public void print() {
System.out.println("Class B::");	
}
}
