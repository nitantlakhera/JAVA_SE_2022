package com.DataStructure.Recursion;

public class JosephProblem {
	public static void main (String args []) {
		System.out.println(getNumber(4, 3));
	}
	
	public static int getNumber (int n , int k) {
		if (n == 1) 
		{
			return 0;
		}
		int x = getNumber(n-1, k);
		int y = (x+k) % n ;
		return y; 	
	}
}
