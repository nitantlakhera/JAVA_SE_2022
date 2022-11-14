package com.JavaSE.Java7.Programs;

public class pyramid {
public static void main(String arg []) {
	int number =6;
	int i ,j ;
	for( i =0; i<number ; i++) {
		
		for(j =0 ; j<=i ;j ++) {
			System.out.print("* ");
		}
		System.out.println();
	}
  }
}