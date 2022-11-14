package com.Excercises.LogicalCode;
public class SwapWithoutTempVariable {
	
	public static void main(String args[]) {
		swapXOR(10, 3);
	}
	
	public static void swap(int a, int b) {
		System.out.println("Before Swap " + a + " " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After Swap " + a + " " + b);
	}
	
	public static void swapXOR(int a , int b) {
		System.out.println(a + " " + b);
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println(a + " " + b);
	}
	
}