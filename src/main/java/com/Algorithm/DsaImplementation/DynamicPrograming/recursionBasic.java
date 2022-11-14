package com.Algorithm.DsaImplementation.DynamicPrograming;

public class recursionBasic {
	public static void main (String args[]) 
	{
		//test1(0);
	//	System.out.println(sumOfNumbers(10, 0));	
	}
	
	public static int test1(int counter) {
		if (counter == 10) {
			return counter;
		} else {
			counter ++;
			System.out.println("counter " + counter);
			return test1(counter);
		}
	}
	
//	public static void sumOfNumbers(int number, int sum) {
//		System.out.println(number + " " + sum);
//		if (number == 0) {
//			return;
//		} else { 
//			sum = sum + 
//		}
//		sumOfNumbers(number, sum);
//	}
}
