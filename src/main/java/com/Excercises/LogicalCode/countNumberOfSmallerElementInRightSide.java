package com.Excercises.LogicalCode;

public class countNumberOfSmallerElementInRightSide {
   public static void main(String arg[]) {
	   int array[]= {12, 1, 2,3,0,11,4};
	   count(array);
   }
   
   public static void count(int array[]) {
	   int count = 0;
	   for(int i = 0 ; i < array.length ; i ++) {
		   for(int j = i+1 ; j < array.length; j++) {
			   if(array[i] > array[j]) {
				   count++;
			   } 
		   }
		   System.out.println(count);
		   count = 0;
	   }
   }
}
