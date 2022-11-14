package com.DataStructure.Recursion;

public class printnto1 {
  public static void main(String args[]) {
       new printnto1().print(10);	
       System.out.println();
       new printnto1().print1ton(10);
  }
public void print(int n ) {
	if(n< 0) {
		return;
	}else {
		System.out.print(" "+ n);
		print(n-1);
	}
}

public void print1ton(int n) {
	if(n<0) {
		return;
	}
	print1ton(n-1);
	System.out.print(" "+n);
}
}
