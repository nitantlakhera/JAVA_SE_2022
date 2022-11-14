package com.JavaSE.Java7;

public class testing {
   public static void main(String args[]) {
	   int array[] = {11, 3, 4, 11, 6, 9};
       if (check(array) == -1) {
    	   System.out.println("Not Available");
       }
   }
   public static int check (int array[]) {
	   int totalSum = 0;
	   for (int i =0; i < array.length ; i ++) {
		   totalSum += array[i];
	   }
	   int sum = 0;
	   for (int i = 0; i < array.length; i++) {
          for (int j = i + 1; j < array.length; j++) {
           sum = array[i] + array[j];
           	if (totalSum - sum == sum) {
           		System.out.println("i-> " + i + " j-> " + j);
           		return 0;
           	}
          }   
       }
       return -1;
   }
}