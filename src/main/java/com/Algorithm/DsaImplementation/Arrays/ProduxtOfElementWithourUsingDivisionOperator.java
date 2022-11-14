package com.Algorithm.DsaImplementation.Arrays;

public class ProduxtOfElementWithourUsingDivisionOperator {

	public static void main(String args[]) {
		int array[] = {1,2,3,4,5,6};
		product(array);
	}

	public static void product(int array[]) {
	   int tempArray[] = new int[array.length];
	   int temp = 1;
	   for(int i =0 ; i < array.length ; i++) {	
		   tempArray[i] = temp;
	       temp = temp * array[i];
	   }
	   temp =1;
	   for(int i = array.length -1 ; i > 0 ; i--) {
		   tempArray[i] = tempArray[i] * temp;
		   temp = temp* array[i];
	   }
	   print(tempArray);
	}
	
	public static void print(int array[]) {
		for(int i =0 ; i < array.length ; i++) {
			System.out.print(" "+ array[i]);
		}
	}
}