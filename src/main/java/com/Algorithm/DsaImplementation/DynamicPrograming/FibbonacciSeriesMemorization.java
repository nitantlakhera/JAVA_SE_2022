package com.Algorithm.DsaImplementation.DynamicPrograming;

public class FibbonacciSeriesMemorization {
	static int dp[];
	public static void main(String args []) {
		int n = 7;
		dp = new int[n + 1];
		System.out.println(getSeries(n));
		
		System.out.println();
		int second = secondWay(n, new int[n + 1]);
		System.out.println("second way " + second);	
	}
	
	public static int getSeries (int n) {
		if (n <= 1) {
			return n;
		}
		if (dp[n] != 0) {
			return dp[n];
		}
		dp[n] = getSeries(n-1) + getSeries(n - 2);
	    return dp[n];
	}
	
	public static int secondWay (int number, int dp[]) {
		if (number <= 1) {
			return number;
		}
		if (dp[number] != 0) {
			return dp[number];
		}
		
		dp[number] = secondWay(number -2, dp) + secondWay(number -1, dp);
		return dp[number];
	}
}