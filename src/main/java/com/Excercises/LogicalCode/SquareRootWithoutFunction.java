package com.Excercises.LogicalCode;

public class SquareRootWithoutFunction {
	public static void main (String args []) {
		System.out.println(squareRoot(24));
	}
	
	public static int squareRoot (int number) {
		for (int i = 0; ; i ++) 
		{
			if (i * i == number) 
			{
				return i;	
			} else if (i * i < number) {
				return i;
			}
		}
	}

}
