package com.Excercises.LogicalCode;

import java.util.HashSet;

public class SumOfTwoNumbeEqualToKInArray {
	
	public static void main (String args []) {
		int array [] = {1,2,3,4,5,6,7};
		//System.out.println(getNumberCount(array, 8));
	    //System.out.println(getNumberCount2(array, 8));
	    System.out.println(getNumberCount3(array, 8));
	}
	
	public static int getNumberCount (int array[], int number) {
		int count = 0;
		for (int i = 0; i < array.length - 1; i ++) {
			for (int j = i + 1; j < array.length; j ++) {
				if (array[i] + array [j] == number) {
					count ++;
				}
			}
		}
		return count;
	}
	
	public static int getNumberCount2 (int array[], int number) {
		int count = 0;
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < array.length; i ++) 
		{
			int b = number - array [i];
			if (set.contains(b) ) {
				count ++;
			}
			set.add(array[i]);
		}
		return count;
	}
	
	public static boolean getNumberCount3 (int arrA[], int number) {
		
		
		int i = 0;
		int j = arrA.length - 1;
		int Sum = 0;
		while (i != j) {
			Sum = arrA[i] + arrA[j];
			if (Sum == number)
				 return true;
			else if (Sum < number)
				i++;
			else if (Sum > number)
				j--;
		}
		return false;
	}
}