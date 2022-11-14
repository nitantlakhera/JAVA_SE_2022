package com.DataStructure.Recursion;

public class program1 {
   
   public static void main(String args []) {
	   System.out.println("calling from main()");
	   new program1().print(5);
   }
   
   public void print(int n) {
	   if(n < 1) {
		   return ;
	   }
	   else {
		   System.out.print(" "+ n);
		   print(n-1);
		   System.out.print(" "+n);
	   }
   }
}
