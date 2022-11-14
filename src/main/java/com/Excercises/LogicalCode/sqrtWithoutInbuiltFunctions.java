package com.Excercises.LogicalCode;

public class sqrtWithoutInbuiltFunctions {

	public static void main(String args []) {
		int number = 256;
		float sqrt, temp = 0;
		sqrt = number / 2;
		while(sqrt != temp) {
			temp = sqrt;
			System.out.println("temp "+temp);
			sqrt = (number/temp + temp)/2;
		}
	}
}