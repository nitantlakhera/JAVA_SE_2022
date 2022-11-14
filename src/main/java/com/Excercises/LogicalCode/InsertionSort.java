package com.Excercises.LogicalCode;

public class InsertionSort {
  public static void main(String args []) {
	  int array[] = {9,6,5,0,8,2,7,1};
	  print(sort(array));
  }

  public static void print(int array[]) {
	  for(int i =0 ; i < array.length ; i ++) {
		  System.out.println(array[i]);
	  }
  }

  public static int[] sort(int array[]) {
	  for(int i = 1 ; i<array.length ; i++) {
			  int key = array[i];
			  int j = i-1 ;
			  while(j>=0 && array[j] > key) {
				    array[j+1] = array[j];
					   j = j-1;
			  }
		      array[j+1] = key;
	  }
	  return array;
  }
}
