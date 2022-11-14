package com.JavaSE.Java7.Concepts.UpAndDownCasting;

class parent {
	
}

class child extends parent {
	
}

public class isInstanceOfOperator {
  
  public static void main(String args[]) {
	child c = new child();
	if(c instanceof parent) {
		System.out.println("yes ");
	}
	else {
		System.out.println("NO ");
	}
  
    parent p = new parent();
    System.out.println(p instanceof child);
  
  }
}
