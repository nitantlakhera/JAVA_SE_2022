package com.DataStructure.Recursion;

public class CuttingRope {
	public static void main (String args []) {
		int result = cutt(21, 7, 16, 19);
		System.out.println(result);
	}
	
	public static int cutt(int length , int a , int b , int c) {
		
		if (length == 0) {
			return 0;
		} else if (length < 0) {
			return -1;
		}
		
		int result = Math.max(cutt(length - a, a, b, c),
				     Math.max(cutt(length - b, a, b, c), 
				    		 cutt(length - c, a, b, c)));
		if (result == -1) {
			return -1;
		} else {
			return 1 + result;
		}
	}
}