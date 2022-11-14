package com.Algorithm.DsaImplementation.DynamicPrograming;

public class FibbonacciNumber {
	public static void main (String args[]) {
		System.out.println(getFibbonacciNumber2(7));
	}
	
	public static int getFibbonacciNumber(int number) {
		if (number <= 1) {
			return number;
		}
		return getFibbonacciNumber(number - 1) + getFibbonacciNumber(number - 2);
	}
	
	public static int getFibbonacciNumber2(int number) {
		if (number <= 1) {
			return number;
		}
		int last = getFibbonacciNumber2(number -2);
		int first = getFibbonacciNumber(number -1);
		return first + last;
	}
}