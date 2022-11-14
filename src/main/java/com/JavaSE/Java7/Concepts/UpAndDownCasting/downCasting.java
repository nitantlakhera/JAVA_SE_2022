package com.JavaSE.Java7.Concepts.UpAndDownCasting;

class parent1 {
   
}

class child1 extends parent1{
  public void prnt() {
	  System.out.println("called ");
  }
}

public class downCasting {
 public static void main(String args[]) {
	 parent1 p = new child1();
	 child1 c=null;
	 if(p instanceof child1) {
		  c = (child1)p; //downcasting	 
	 }
	 c.prnt();
   }
}
