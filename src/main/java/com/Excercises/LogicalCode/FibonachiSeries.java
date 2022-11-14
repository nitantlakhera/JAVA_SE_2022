package com.Excercises.LogicalCode;

public class FibonachiSeries {
	public static void main (String args []) {
		getSeries(10);
		System.out.println();
		System.out.println(fibonacci2(9));
		System.out.println(recursion(9));
	}
	
	public static int getSeries (int number) {
		int a = 0;
		int b = 1;
		int sum = 0;
		System.out.print("0 1");
		for (int i = 0; i < number-2 ; i ++) {
			sum = a + b;
			a = b ;
			b = sum;
			System.out.print(" "+sum);
		}
		return sum;
	}
	
	public static int fibonacci2(int number)
	{ 
		if(number == 1 || number == 2)
		{
			return 1; 
		} 
		int fibo1=1, fibo2=1, fibonacci=1; 
		for(int i= 3; i<= number; i++)
		{
			fibonacci = fibo1 + fibo2; 
			fibo1 = fibo2; 
			fibo2 = fibonacci; 
		}
		return fibonacci;
	}
	
	public static int recursion (int number) {
		if (number == 1 || number == 2) 
		{
			return 1;
		} 
		return recursion(number - 1) + recursion(number - 2);
	}
}