package com.JavaSE.Java7.Programs;

public class palendromNumber {
public static void main(String args []) {
	int number = 12321 ;
	int result =0;
	int originalNumbner = number ;
	
	for(; number !=0; number = number /10) {
		int remender = number%10;
		result = result*10+remender;
	}
	
	if(result == originalNumbner ) {
		System.out.println("Palendrom Number ");
	}
	
	else {
     System.out.println("Not a palendrom number");		
	}
  }
}
