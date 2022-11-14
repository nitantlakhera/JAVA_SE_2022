package com.Algorithm.DsaImplementation.DynamicPrograming;

public class ReverseArray {
	public static void main  (String args[]) {
		int array[] = {1,2,3,4,5,6};
		reverse(array, 0, array.length - 1);
	    for (int i = 0; i < array.length ; i ++) {
	    	System.out.print(array[i] + " ");
	    }
	}
	
	public static void reverse(int array[], int i , int j) {
		if (j <= i) {
			return;
		}
		int temp = array[j];
		array[j] = array[i];
		array[i] = temp;
		i = i  + 1;
		j = j - 1;
		reverse(array, i, j);
	}
}