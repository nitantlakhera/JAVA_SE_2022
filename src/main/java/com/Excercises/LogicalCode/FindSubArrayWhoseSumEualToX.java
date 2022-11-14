package com.Excercises.LogicalCode;
public class FindSubArrayWhoseSumEualToX {
  public static void main(String args[]) {
	  int array[] = {1, 4, 20, 3, 10, 5};
	  int sum = 33;
	  findArray(array, sum);
	  sumX(array, sum);
  }
  
  public static void findArray(int array[] , int sum) {
      int csim = 0;
      for(int i = 0 ; i < array.length ; i ++) {
    	  csim = csim + array[i];
    	  for(int j = i+1 ; j < array.length; ) {
			  if(csim == sum) {
				  System.out.println(""+csim);
			  }
			  if(csim > sum || j == array.length) {
				  break;
			  }
			  csim = csim + array[j];
		  }
      }
  }

  public static void sumX(int array[], int value) {
	  int start = 0;
	  int currentSum = 0;
	  for(int i = 0 ; i < array.length ; i ++) {
		  while(currentSum > value) {
			  currentSum = currentSum - array[start];
			  start++;
		  }
		  if(currentSum == value ) {
			  System.out.println(currentSum);
		  }
		  if(i < array.length) {
			  currentSum = currentSum + array[i];
		  }
	  }
  }
}
