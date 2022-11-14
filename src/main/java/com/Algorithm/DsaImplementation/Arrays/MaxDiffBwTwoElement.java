package com.Algorithm.DsaImplementation.Arrays;

public class MaxDiffBwTwoElement {
  public static void main(String args []) {
	  int array[] = {3,1,4,7,5,100,10};
	  //System.out.println(find(array));
	  //System.out.println(diffArray(array));
	  System.out.println(max_diff(array));
	  //System.out.println(max_diff_bestApproach(array));
	  //System.out.println(maxDiff(array, array.length));
	  //System.out.println(mxDiff(array));
  }
  
  static int maxDiff(int arr[], int arr_size)  
  { 
      int max_diff = arr[1] - arr[0]; 
      int min_element = arr[0]; 
      int i; 
      for (i = 1; i < arr_size; i++)  
      { 
          if (arr[i] - min_element > max_diff) 
              max_diff = arr[i] - min_element; 
          if (arr[i] < min_element) 
              min_element = arr[i]; 
      } 
      return max_diff; 
  } 
  
  private static int find(int array[]) {
	 int max = 0;
	 for(int i = 0 ; i < array.length ; i++) {
		 for(int j =i+1 ; j < array.length ; j ++) {
			 if(array[j] > array[i]) {
				 int diff = array[j]-array[i]; 
				 if(diff > max) {
					 max = diff;
				 }
			 }
		 }
	 }
	 return max;
  }
  
  private static int diffArray(int array[]) {
	  int diff[] = new int[array.length-1];
	  for(int i = 0 ;  i < array.length-1 ; i++) {
		  diff[i] =  array[i+1] - array[i];
	  }
	  print(array);
	  System.out.println();
	  print(diff);
	  int max =  diff[0];
	  for(int i = 1 ; i< diff.length ; i++) {
		  if(diff[i-1] > 0) {
			  diff[i] = diff[i-1] + diff[i];
		  }
		  if(diff[i] > max ) {
			  max = diff[i];
		  }
	  }
	 return max;
  }
  
  public static int max_diff(int array[]) {
	  int currMin =  array[0];
	  int max_diff = 0;
	  for(int i = 1 ; i< array.length ; i++) {
		  if(array[i]-currMin > max_diff) {
			  max_diff  =  array[i] - currMin;
		  }
		  if(currMin > array[i]) {
			  currMin = array[i];
		  }
	  }
	  return max_diff;
  }
  
  public static int max_diff_bestApproach(int array[]) {
	  int currMin =  array[0];
	  int max_diff = array[1] - array[0];
	  int current_diff = array[1] - array[0];
	  for(int i = 1; i < array.length ; i++) {
		  if(currMin > array[i]) {
			  currMin = array[i];
		  }else {
			  current_diff  =  array[i] - currMin;
			  if(current_diff  > max_diff) {
				  max_diff = current_diff;
			  }
		  }
	  }
	  return max_diff;
  }
  
  public static int mxDiff(int array[]) {
	  int max_diff = array[1]-array[0];
	  int min_element = array[0];
	  for(int i = 1 ; i < array.length ; i++) {
		  if(array[i]- min_element > max_diff) {
			  max_diff = array[i] - min_element;
		  }
		  if(array[i] < min_element) {
			  min_element = array[i];
		  }
	  }
	  return max_diff;
  }
  
  public static void print(int array[]) {
	  for(int i =0 ; i < array.length ; i++) {
		  System.out.print(" "+array[i]+ " ");
	  }
  }
}