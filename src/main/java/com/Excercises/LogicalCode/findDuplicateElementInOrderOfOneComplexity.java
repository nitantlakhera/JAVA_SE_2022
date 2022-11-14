package com.Excercises.LogicalCode;

public class findDuplicateElementInOrderOfOneComplexity {
  public static void main(String args[]) {
	  int array[] = {1, 2, 3, 1, 3, 6, 6};
	  findDuplicate(array);
  }
  public static void findDuplicate (int array[]) {
	for (int i = 0 ; i < array.length; i ++) {  
		if(array[Math.abs(array[i])] >= 0) {
			  array[Math.abs(array[i])] = -array[Math.abs(array[i])];
		}
		else {
			  System.out.println("already present " + Math.abs(array[i]));
		}
	}
  }
}
