package com.JavaSE.Java7.Concepts.UpAndDownCasting;


class  A {
   public void show() {	
	   System.out.println("A");
   }
}

class B  extends A {
	public void show () {	
		System.out.println("B");
	}
}

public class upCasting {
      public static void main(String args[]) {
    	  A a = new B(); //up casting
    	  a.show();
    	  System.out.println();
    	  A obj = new A();
    	  obj.show();
      }
}
