package com.Algorithm.DsaImplementation.DynamicPrograming;

public class FibbonacciTabulation {
	public static void main (String args []) {
		int n = 7;
		int number = getSeries(n);
		System.out.println(number);
	}
	
	public static int getSeries(int number) {
		
		int dp[] = new int[number+2];
	    dp[0] = 0;
	    dp[1] = 1;
	    for (int i = 2; i <= number; i++)
	    {
	        dp[i] = dp[i-1] + dp[i-2];
	    }     
	    return dp[number];
	}
}
