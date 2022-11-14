package com.Excercises.LogicalCode;

public class Factorial {
	public static void main (String args []) {
		System.out.println(getFact(6));
		System.out.println(getFactForLoop(6));
	    System.out.println(getFactWithoutTemp(6));
	    System.out.println(getFactRecursion(6));
	}
	
	public static int getFact(int number) {
	int fact = 1;
	while (true) 
	{
		if (number == 0) 
		{
			return fact;
		}
		fact =  fact * number;
		number --;
		}	
	}
	
	public static int getFactForLoop (int number) {
		int temp = 0;
		for (int i = 1 ; number > 0; number --) {
			i = i * number;
			temp = i;
		}
		return temp;
	}
	
	public static int getFactWithoutTemp (int number) {
		int fact = 0;
		for (fact = 1 ; number > 0; number --) {
			fact = fact * number;
		}
		return fact;
	}
	
	public static int getFactRecursion (int number) {
		if (number == 0) 
		{
			return 1;
		} 
		return number * getFactRecursion(number - 1);
	}
}