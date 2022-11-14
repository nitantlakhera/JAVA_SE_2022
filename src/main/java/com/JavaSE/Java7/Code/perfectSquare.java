package com.JavaSE.Java7.Code;
public class perfectSquare {
   public static void main(String args []) {
	   int array[] = {10,145,2,3,4,5,6,16,12,64,81,121,122,123,144};
	   int sum =0;
	   for(int i =0 ; i<array.length ; i++) {
	      if(Math.sqrt(array[i])%(int)Math.sqrt(array[i]) == 0) {
	    	  sum = sum+ (int)Math.sqrt(array[i]);
	    	  System.out.print(" "+ (int)Math.sqrt(array[i])+" ");
	      }
	   }
	   System.out.println("Sum-: " + sum);
   }
}