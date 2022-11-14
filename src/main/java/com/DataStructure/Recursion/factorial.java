package com.DataStructure.Recursion;

public class factorial {
   public static void main(String args[]) {
	   System.out.println(new factorial().fact(5));
   }
   int fact(int n) { 
	   if(n==0) {
		   return 1;
	   }else {
		   return n*fact(n-1);
	   }
   }
}
