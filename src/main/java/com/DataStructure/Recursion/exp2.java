package com.DataStructure.Recursion;

public class exp2 {
	public static void main (String args []) 
	{
		//System.out.println(A(2048, 0));
		B(2048, 0);
	}
	
	public static void B(int n, int sum) {
		int k = 0, j = 0;
		if (n == 0) {
			System.out.println(sum);
			return;
		}
		k = n % 10;
		j = n / 10;
		sum = sum + k;
		B(j, sum);
	}
	
	public static int A(int n, int sum) {
		int k = 0, j = 0;
		if (n == 0) {
			return sum;
		}
		k = n % 10;
		j = n / 10;
		sum = sum + k;
		return A(j, sum);
	}
	
	public static int A(int n) {
		if (n == 0) {
			return 0;
		}
		return n % 10 + A(n / 10);
	}

}