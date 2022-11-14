package com.JavaSE.Java7.Programs;

public class fibonnacciseries {
public static void main(String args []) {
	int first = 0 , second = 1 , sum =0;
	int number =7;
	int cunter =0 ;
	System.out.println(first);
	System.out.println(second);
	while(cunter < number) {
		sum = first + second;
		System.out.println(sum  );
		first = second ; 
		second = sum ;
		cunter++;
	}
  }
}
