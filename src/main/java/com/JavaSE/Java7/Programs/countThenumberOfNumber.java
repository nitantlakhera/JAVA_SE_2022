package com.JavaSE.Java7.Programs;

public class countThenumberOfNumber {
public static void main(String arg []) {
	int number = 123;
	int count =0;
	for( ; number!=0 ; number= number/10) {
      ++count;
	}
	System.out.println(count);
}
}
