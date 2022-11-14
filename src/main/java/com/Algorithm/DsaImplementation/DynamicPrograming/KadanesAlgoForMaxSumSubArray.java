package com.Algorithm.DsaImplementation.DynamicPrograming;

public class KadanesAlgoForMaxSumSubArray {
  public static void main(String args[]) {
	 int array[] =  {10,-5,-3,4,2,12,-8,-12,19};
	 System.out.println(maxSum(array));
  }
  
  public static int maxSum(int array[]) {
	  int max = 0;
	  int current_sum = 0;
	  int i  = 0 ;
	  for(i = 0 ; i < array.length ; i++) {
		  current_sum =  current_sum + array[i];
		  if(current_sum < 0) {
			  current_sum = 0;
		  }
		  else if(current_sum > max) {
			  max =  current_sum;
		  }
	  }
	  return max;
  }
  
  public static void printSubArray(int array[] , int start, int end) {
	  for(int i = start ; i < end ; i ++) {  
		  System.out.print(" "+array[i]);
	  }
  }
}