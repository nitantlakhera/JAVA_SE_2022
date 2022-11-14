package com.Algorithm.DsaImplementation.Arrays;

public class NumberOfTraingleWeCanForm {
 public static void main(String  args[]) {
     int array[] = { 10, 21, 22, 100, 101, 200, 300 };
	 find(array);
 }
 
 public static void find(int array[]) {
	 int count = 0;
	 for(int i =0 ; i < array.length ; i++) {
		 for(int j = i + 1 ; j < array.length; j++) {
			 for(int k = j +1 ; k < array.length; k ++) {
				 if (  array[i] + array[j] > array[k] 
		               && array[i] + array[k] > array[j] 
		               && array[k] + array[j] > array[i]) 
		               count++;
			 }
		 }
	 }
	 System.out.println(count);
  }
}
