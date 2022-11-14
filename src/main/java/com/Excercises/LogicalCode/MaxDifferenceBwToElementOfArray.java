package com.Excercises.LogicalCode;

public class MaxDifferenceBwToElementOfArray {
  public static void main(String args[]) {
	  int array[] = {3,1,4,7,130,5,100,10,120};
	  System.out.println(getElement(array));
  }
  public static int getElement(int array[]) {
	  int start = 0;
	  int max = 99999;
	  int end = array.length -1;
	  while (start < end) {
		  int sum =  array[start] - array[end];
		  if (sum < max) {
			  max = sum;
		  }
		  start++;
		  end--;
	  }
	  return Math.abs(max);
  }
}
