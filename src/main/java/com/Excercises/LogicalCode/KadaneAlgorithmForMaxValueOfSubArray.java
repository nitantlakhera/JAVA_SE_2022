package com.Excercises.LogicalCode;

public class KadaneAlgorithmForMaxValueOfSubArray {
	public static void main (String args[]) {
		int array [] = {-2 , 1 , -3 , 4 , -1 , 2 , 1, -5 , 4};
        int max = Integer.MIN_VALUE;
		int currentSum = 0;
		for (int i = 0; i < array.length; i ++) {
		    currentSum = currentSum + array[i];
			if (max < currentSum) {
		    	max = currentSum;
		    }
			if (currentSum < 0) {
				currentSum = 0;
			}
		}
		System.out.println("" + max);
	}
}