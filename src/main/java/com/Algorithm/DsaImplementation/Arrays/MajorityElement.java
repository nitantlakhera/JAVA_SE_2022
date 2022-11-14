package com.Algorithm.DsaImplementation.Arrays;

public class MajorityElement {
  public static void main(String args[]) {
	  int array[] = {1,1,1,4,4,4,4,4,4,4,4,9,9,9,9};
	  int n = (array.length)/2+1;
	  findMajorityElement(array , n); 
  }  
  public static void findMajorityElement(int array[] , int n) {
	  for(int i =0 ; i < array.length ; i++) {
		   for(int j = i+(n-1) ; j< array.length ; j++) {
			   System.out.println(i+"  " + j);
			   if(array[i] == array[j]) {
				   System.out.println("" + array[j]);
			   }
		   }
	  }
  }
}
