package com.Excercises.LogicalCode;

import java.util.Arrays;
import java.util.HashSet;

public class PairOFSumEqualToNumber {
     public static void main(String args[]) {
    	  int array []= {1,4,3,3,5,2,6};
    	 //checkIfPresent(findPair(array, 9));
    	  UsingSorting(array, 9);
      }

	  public static int findPair(int[] array, int number) {
    	  HashSet<Integer> set = new HashSet<Integer>();
    	  for(int i =0 ; i < array.length ; i ++) {
    		  int X = number - array[i];
    		  if(set.contains(X)) {
    			  System.out.println("Number pair " + "{" + X + " , " + array[i] + "}");
    		      return 0;
    		  }
    		  set.add(array[i]);
    	  }
    	  return -1;
	  }
	  
	  public static void checkIfPresent(int number) {
		  if(number != 0) {
			  System.out.println("No pair available");
		  }
	  }

	  public static void UsingSorting(int array[], int number) {
		  int left = 0 , right = array.length-1;
		  Arrays.sort(array);
		  while(left < right) {
			  if(array[left] + array[right] == number) {
				  System.out.println(array[left] + " " + array[right]);
			  }
			  if(array[left] + array[right] < number) {
				  left ++;
			  }
			  else {
				  right --;
			  }
		  }
	  }
}