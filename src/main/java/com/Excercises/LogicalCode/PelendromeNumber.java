package com.Excercises.LogicalCode;

public class PelendromeNumber {
	public static void main (String args [])
	{
		System.out.println(check(1001));
	}
	
	public static boolean check(int number) 
	{
		int original = number;
		int temp = number;
		int sum = 0;
		while (temp != 0 ) 
		{
			number = number % 10;
			sum = (sum * 10) + number;
			temp = temp / 10;
			number = temp;
		}
		if (sum == original) 
		{
			return  true;
		}
		return false;
	}
}