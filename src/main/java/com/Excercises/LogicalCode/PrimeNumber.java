package com.Excercises.LogicalCode;

import java.util.ArrayList;

public class PrimeNumber {
	public static void main (String args []) {
		System.out.println(primeInBetween(1, 100).size());
	}

	public static boolean isPrime (int number) 
	{
		int count = 0;
		if (number == 0 || number == 1) {
			return true;
		}
		for (int i = 2; i <= number ; i ++) {
			if (number % i == 0) {
				count ++;
			}
		}
		if (count == 1) 
		{
			return true;
		} else {
			return false;
		}
	}

	public static ArrayList<Integer> primeInBetween (int a , int b) 
	{
		ArrayList<Integer> primeList = new ArrayList<>();
		for (int i = a + 1 ; i < b ; i++) 
		{
			if (isPrime(i)) {
				primeList.add(i);
			}
		}
		return primeList;
	}
}