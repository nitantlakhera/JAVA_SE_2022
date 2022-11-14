package com.Algorithm.DsaImplementation.Arrays;

public class FindDuplicateNumberFromArrayInOrderOfSpaceOne {
 public static void main(String [] ags) {
	 int array[] = {4,3,1,1,2,2,3,4};
	 findElement(array);
 }
 
 public static void findElement(int array[]) {
	 for(int i = 0 ; i < array.length ; i++) {
	   	 if(array[Math.abs(array[i])] >=0 ) {
			 array[Math.abs(array[i])] = -array[Math.abs(array[i])];
		 }
		 else {
			 System.out.println(Math.abs(array[i]));
		 }
	 }
   }
}
