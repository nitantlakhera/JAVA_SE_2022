package com.DataStructure.Recursion;

public class fibbonachi {
    public static void main(String args[]) {
      for(int i =0 ; i <= 9 ; i++) {
    	  System.out.print(" "+new fibbonachi().print(i));
      }
    }
    
    public int  print(int n ) {
    	 if(n == 0) {
    		 return 0;
    	 }
    	 if(n ==1) {
    		 return 1;
    	 }
      return print(n-1)+print(n-2);
    }
}