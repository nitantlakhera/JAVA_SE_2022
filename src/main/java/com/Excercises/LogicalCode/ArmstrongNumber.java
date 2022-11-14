package com.Excercises.LogicalCode;

public class ArmstrongNumber {	
	public static void main (String args []) {
		checkArmstrong(153, getNumberRecursion(153));
	}
	
	public static int getNumber (int number) {
		int temp = number;
		int count = 0;
		while (number != 0) {
			count ++;
			number =  number / 10;
		}
        number = temp;
		int result = 0;
        while (number != 0) {
			int remender = number % 10;
			result = (int) (result + Math.pow(remender, count));
			number =  number / 10;
		}
        return result;
	}
	
	public static double getNumberRecursion (int result, int number) {
		if (number == 0) {
			return result;
		}
		int remender = number % 10;
	    result = (int) (result + Math.pow(remender, 3));
		return getNumberRecursion(result, number / 10);
	}
	
	public static double getNumberRecursion (int number) {
		if (number == 0) {
			return 0;
		}
		
		int remender = number % 10;
	    double result =  Math.pow(remender, 3);
	    return result + getNumberRecursion(number / 10);
	}
	
	public static void checkArmstrong(double A, double B) {
		if (A != B) 
		{
			System.out.println("NO");
		} 
		else 
		{
			System.out.println("YES");
		}
	}
}