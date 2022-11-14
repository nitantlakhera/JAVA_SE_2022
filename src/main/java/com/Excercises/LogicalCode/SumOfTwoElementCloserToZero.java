package com.Excercises.LogicalCode;

import java.util.Arrays;

public class SumOfTwoElementCloserToZero {
	public static void main(String args[]) {
	   int array[] = {15, 5, -20, 30, -45};
	   getSumCloserToZero(array);
	}
	public static void getSumCloserToZero(int array[]) {
	 Arrays.sort(array);
	 int left = 0; int right = array.length - 1;
	 int min_left = 0;
	 int min_right = array.length-1;
	 int closerToZero = 9999999;
	 while (left < right) {
		 int sum = array[left] + array[right];
		 if (Math.abs(sum) < Math.abs(closerToZero)) {
			 closerToZero = sum;
			 min_left = left;
			 min_right = right;
		 }
		 if (sum < 0) {
			 left ++;
		 } else {
			 right --;
		 }
	 }
	 System.out.println(array[min_left] +  " " + array[min_right]);
	}
}
