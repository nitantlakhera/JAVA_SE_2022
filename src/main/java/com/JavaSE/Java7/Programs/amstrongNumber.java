package com.JavaSE.Java7.Programs;

public class amstrongNumber {
public static void main(String args []) {
	int number =371 ;
	int count = 0;
	int originalNumber = number ;
	
	for(; originalNumber !=0; originalNumber = originalNumber/10 ) {
		 count ++;
	}
	
	System.out.println("count is " + count);
	int  sum =0 ;
	originalNumber = number ;
	while (originalNumber!=0) {
		int rem = originalNumber%10;
		sum= (int) (sum  + Math. pow(rem , count));
		originalNumber = originalNumber/10;
	}
	System.out.println(sum);
	if(number == sum ) {
		System.out.println("ARMSTRONG number ");
	}
	}
}
