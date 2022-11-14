package com.Algorithm.DsaImplementation.Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class ArrayElementSumEqualToXTriplate {
  public static void main(String args[]) {
	  int array[]  =  {6,9,1,4,2,7};
      //element(array, 7);
      //binarySearch(array, 7);
      usingHashing(array, 7);
  }
  
  public static void element(int array[], int number) {
	  for(int i = 0 ; i< array.length ; i++) {
		 for(int j = i + 1 ; j < array.length-1 ; j++) {  
			 for(int k = j + 1 ; j< array.length-1 ; j++) {
				 if(array[i]+ array[j] + array[k ] == number) {
					 System.out.println(array[i] +" "+ array[j] +" "+ array[k]);
				 }
			 }
		 }
      }
  }
  
  public static void binarySearch(int array[], int sum) {
	  Arrays.sort(array);
	  int l,r;
	  for(int i = 0 ; i < array.length-2 ; i++) {
		  l = i+1;
		  r = array.length - 1;
		  while(l < r) {
			  if(array[i] + array[l] + array[r] == sum) {
				  System.out.println(array[i] + " " +array[l] + " " +array[r]);
			  }
			  if(array[i] + array[l] + array[r] > sum) {
				 r--;  
			  }else {
				 l++;
			  }
		  }
	  }
  }
  
  public static int BSA(int array[], int number) {
	  int left = 0;
	  int right = array.length - 1;
	  while(left < right) {
		  int middle =  (left + right)/2;
		  if(array[middle] == number) {
			  return number;
		  }
		  if(number > array[middle]) {
			  left++;
		  }
		  if(number < array[middle]) {
			  right--;
		  }
	  }
	  return -1;
   }
  
  public static void usingHashing(int A[], int sum) {
	  HashSet<Integer> s = new HashSet<Integer>(); 
      for (int i = 0; i < A.length - 2; i++) { 
		  int curr_sum = sum - A[i]; 
          for (int j = i + 1; j < A.length; j++) { 
              if (s.contains(curr_sum - A[j])) { 
                  System.out.printf("Triplet is %d, %d, %d", A[i], 
                                    A[j], curr_sum - A[j]); 
              } 
              s.add(A[j]); 
          } 
          s.clear();
      } 
   }
}