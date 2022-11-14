package com.JavaSE.Java7.Concepts;

public class Programmer extends Employee {
  
  public static void show() {  
	  System.out.println("Child class method");
  }
  
  public static void main(String args []) {
	  Employee.show();
	  Programmer.show();
  }
}
