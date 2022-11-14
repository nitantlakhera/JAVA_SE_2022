package com.Excercises.LogicalCode;

public class FarestElement {
	public static void main (String args []) 
	{
		int array[]= {1,4,7,2,-10,5,8,6,3};
		System.out.println(farestFromZero(array));
	}
	public static int farestFromZero (int A[]) {
		int temp = A[0];
		int farest = 0;
		for (int i = 1; i < A.length; i ++) {
			if (Math.abs(A[i]) > temp) {
				temp = A[i];
			}
			if (Math.abs(temp) > Math.abs(farest)) {
				farest = temp;
			}
		}
		return farest;
	}
}
