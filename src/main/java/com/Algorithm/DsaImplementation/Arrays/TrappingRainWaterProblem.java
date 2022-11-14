package com.Algorithm.DsaImplementation.Arrays;

public class TrappingRainWaterProblem {
  
  public static void main(String args []) {
	  int arr [] ={ 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
	  System.out.println(findWater(arr));
  }
  
  public static int findWater(int array[]) {
	  int water = 0;
	  int left[] = new int[array.length];
	  int right[] = new int[array.length];
	  left[0] = array[0];
	  for(int i = 1 ; i < array.length ; i++) {
		  left[i] = max(left[i-1], array[i]); 
	  }
	  right[array.length-1] = array[array.length-1];
	  for(int i = array.length-2 ; i > 0 ; i--) {
		  right[i] = max(right[i+1], array[i]);  
	  }
	  for(int i =0 ; i < array.length ; i++) {
		  water = water + min(left[i], right[i])-array[i];
	  }
	  return water;
  }
  
  static int max(int a, int b) {
	  return a > b ? a : b;
  }
  
  static int min(int a ,int b) {
	  return a < b ? a : b;
  }
}
