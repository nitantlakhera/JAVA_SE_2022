package com.Excercises.LogicalCode;

import java.util.Arrays;

public class CloserTo0 {
  public static void main(String ags []) {
	  int arr[] = {1, 60, -10, 70, -80, 85}; 
      findCloserToZero(arr);
  }

  public static void findCloserToZero(int array[]) {
	  int i = 0 , j = array.length-1;
	  Arrays.sort(array);
	  int sum = 0;
	  int a = i , b  = array.length-1;
	  int closerToZero = 999999;
	  while(i < j) {
		  sum = array[i] + array[j];
		  if(Math.abs(sum) < Math.abs(closerToZero)) {
			  closerToZero = sum;
			  a = i ; 
			  b = j ;
		  }
		  if(sum < 0) {
			  i++;
		  }else {
			  j--;
		  }
	  }
	  System.out.println("closer  " + closerToZero + " " +array[a] + "  " + array[b]);
  }
}