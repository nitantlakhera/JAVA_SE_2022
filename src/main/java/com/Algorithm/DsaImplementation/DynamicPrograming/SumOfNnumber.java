package com.Algorithm.DsaImplementation.DynamicPrograming;

public class SumOfNnumber {
	public static void main (String args[]) {
		SumOfNnumber.parametrizedWay(5, 0);
		System.out.println("Sum "+ SumOfNnumber.functionalSum(3));
	}
	
	public static void parametrizedWay(int Number, int sum) {
		if (Number <= 0) {
			System.out.println("Sum " + sum);
			return;
		}
		parametrizedWay(Number - 1, sum + Number);
	}
	
	public static int functionalSum(int Number) {
		if (Number == 0) {
			return 0;
		}
		return Number + functionalSum(Number - 1);
	}
}
