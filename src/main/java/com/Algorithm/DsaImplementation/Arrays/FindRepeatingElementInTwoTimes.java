package com.Algorithm.DsaImplementation.Arrays;

public class FindRepeatingElementInTwoTimes {
  public static void main(String args[]) {
	  int array[] = {1,1,2,3,4,3};
	  findElement(array);
  }
  
  public static void findElement(int array[]) {
	  
	  for(int i =0 ; i < array.length ; i++) {
		  if(array[Math.abs(array[i])] >= 0) {
			  array[Math.abs(array[i])] = -array[Math.abs(array[i])];
		  }
		  else {
			  System.out.print(" "+Math.abs(array[i]));
		  }
	  }
  }
}
