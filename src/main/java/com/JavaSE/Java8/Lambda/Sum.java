package com.JavaSE.Java8.Lambda;

interface Addition {
	int getSum (int a, int b);
}

// https://jenkov.com/tutorials/java/lambda-expressions.html

public class Sum {
	public static void main (String args []) {
		
		Addition add = (a,b) -> {return a + b;};
		
		System.out.println(add.getSum(6, 6));
	}
}
