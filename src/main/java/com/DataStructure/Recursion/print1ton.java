package com.DataStructure.Recursion;

public class print1ton {
	public static void main (String args []) {
	  printNumber(3);
	  System.out.println();
	  printNumberReverse(3);
	}
	public static void printNumber(int number) {
		if (number < 1) {
			return;
		}
		printNumber(number - 1);
		System.out.print(" " + number);
	}
	
	public static void printNumberReverse(int number) {
		if (number < 1) {
			return;
		}
		System.out.print(" " + number);
		printNumber(number - 1);
	}
}
