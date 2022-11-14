package com.Algorithm.Searching;

import java.util.Arrays;

public class BinarySearchAlgorithm {
   public static void main(String args []) {
	   int array [] = {1,2,3,4,5,6,7,8,9,10};
	   Arrays.sort(array);
	   int key = search(array, 10);
       System.out.println(key);
   }

   public  static int search(int array[] , int key) {
	   int low = 0 ;
	   int high = array.length-1;
	   while(low<=high) {
		   int mid =  (low + high)/2;
		   if(key == array[mid]) {
		     return mid;
		   }
		   if(key > array[mid]) {
			   low = mid+1;
		   }else if(key < array[mid]) {
			   high = mid-1;
		   }
	   }
	   return 0;
   }
}
