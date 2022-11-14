package com.Excercises.LogicalCode;

public class RemoveDuplicateFromArray {
	public static void main(String args[]) {
	  int array[] = {0,0,1,1,1,2,2,3,3,4};
	  int j = 0;
	  for (int i = 0; i < array.length - 1; i ++) {
		  if (array[i] != array[i + 1]) {
			  array[j++] = array[i];
		  }
	  }
	  array[j++] = array[array.length - 1];	
	}
}
