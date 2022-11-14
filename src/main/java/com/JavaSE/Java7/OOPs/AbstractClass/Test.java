package com.JavaSE.Java7.OOPs.AbstractClass;

public class Test {
 public static void main(String args[]) {
	 AbstractClass  c = new childClass("elaknit", 12, 0);
	 c.work();
	 AbstractClass c1 =  new childClass("epatada", 25, 2);
	 c1.work();
	 System.out.println(c1.toString());
	 c1.changeName("hello");
	 System.out.println(c1.toString());
 }
}
