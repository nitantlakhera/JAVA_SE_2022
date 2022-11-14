package com.Excercises.LogicalCode;

public class SumOfTheTwoNumberEqualToNumber {
	public static void main (String args []) {
		int array[] = {1,3,5,6,2,8,9,4};
		int count = getCount(array, 6);
		System.out.println(count);
	}
	
	public static int getCount(int array [], int number) {
		int count =  0;
		for (int i = 0 ; i < array.length - 1 ; i ++) {
			for (int j = i + 1 ; j < array.length ; j ++) {
				if (array[i] + array[j] == number) {
					count ++;
				}
			}
		}
		return count;
	}

}
