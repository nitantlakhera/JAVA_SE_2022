package com.DataStructure.Recursion;

public class execp1 {
	public static void main (String args []) {
		prinNumber(3);
	}
	
	public static void prinNumber (int number) {
		if (number < 1) {
			return;
		} 
		prinNumber(number-1);
		System.out.print(" " + number);
		prinNumber(number-1);
	}
}
