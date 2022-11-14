package com.Excercises.LogicalCode;

public class SubArrayWhoseSumIsEqualToX {
  public static void main(String args[]) {
	  int array[] = {1, 4, 20, 3, 10, 5};
	  System.out.println(getIndex(array, 33));
  }
  
  public static int getIndex(int array[], int sum) {
	  int currentSum = 0;
	  int start = 0;
	  for (int i = 0; i < array.length; i ++) {
		while (currentSum > sum) {
				currentSum = currentSum - array[start];
				start++;
		}
		if (currentSum == sum) {
			return currentSum;
		}
	    currentSum = currentSum + array[i];
	  }
	  return -1;
  }
}
