package com.Excercises.LogicalCode;

public class MajorityElement {
  public static void main(String args[]) {
	  int array[] = {1,1,1,2,2,2,1,1,1,1,2,2,2,2,1,1,2,2};
	  getCounter(array, getMejority(array));
  }
  
  public static int getMejority(int array[]) {
	  int vote = 1;
	  int voter = array[0];
      for (int i = 0 ; i < array.length-1; i ++) {
    	  if (vote == 0) {
    		  voter = i;
    		  vote = 1;
    	  }
    	  if (array[voter] == array [i]) {
    		  vote ++;
    	  } else {
    		  vote --;
    	  }
      }
      return array[voter];
  }
 
  public static void getCounter(int array[], int voter) {
	  int count = 0;
	  for (int i =0 ; i < array.length; i ++) {
		  if (array[i] == voter) {
			  count ++;
		  }
	  }
	  
	  System.out.println((array.length)/2);
	  if (count > (array.length)/2) {
		  System.out.println("Yes Majority Element");
	  }
  }
}
