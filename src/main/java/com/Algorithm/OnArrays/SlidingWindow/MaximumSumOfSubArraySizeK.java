package com.Algorithm.OnArrays.SlidingWindow;

public class MaximumSumOfSubArraySizeK {
	
	public static void main (String args[]) 
	{
		int array[] = {1,2,3,4,5,6,7,8,9};
		int k = 4;
//		System.out.println(maxSum(array, k));
//		System.out.println();
		System.out.println(maxSum2(array, k));
	}
	
	public static int maxSum(int array[], int k) {
		int max_sum =  0;
		
		for (int i = 0; i < k ; i ++) {
			max_sum = max_sum + array[i];
		}
		
		int window_sum =  max_sum;
		
		for (int i =  k ; i < array.length; i ++) {
			window_sum = window_sum + array[i] - array[i - k];
		    max_sum =  Math.max(max_sum, window_sum);
		}
		return max_sum;
	}
	
	public static int maxSum2(int array[], int k) {
		int maxSum = 0;
		int windowSum = 0;
		int start = 0;
		
		for (int i = 0; i < array.length; i ++) {
			windowSum =  windowSum + array[i];
			if ((i - start + 1) == k) 
			{
				maxSum  =  Math.max(maxSum, windowSum);
				windowSum =  windowSum - array[start];
				start = start + 1;
			}
		}
		return maxSum;
	}
}