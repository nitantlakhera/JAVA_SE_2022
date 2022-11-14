package com.JavaSE.Java8.Lambda;
interface sumOfTwoNumber {
	int getCount(int array[], int number);
}

public class SumOfTwoNumerEqualToK {
	public static void main (String args []) 
	{
		int array[] = {1,3,2,4,5,6,7,8,9};
		sumOfTwoNumber sum = (arr, number) -> {
				int count = 0;
				for (int i = 0; i < array.length-1 ; i ++) {
					for (int j =  i + 1; j < array.length; j ++) {
						if (array[i] + array[j] == number) {
							count ++;
						}
					}
				}
				return count;
		};
		System.out.println(sum.getCount(array, 6));
	}
}
