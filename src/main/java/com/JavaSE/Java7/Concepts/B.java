package com.JavaSE.Java7.Concepts;

public class B extends A {
  int b  = 200;
  public void child() {
	  System.out.println("CHILD ----:");
  }
  
  public void ToOverride() {
	  System.out.println("Child ToOverride() method");
  }
}
