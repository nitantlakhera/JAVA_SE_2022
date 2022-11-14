package com.Algorithm.Searching;

public class BinarySearchRecursion {
   
   public static void main(String args []) {
	   int array [] = {10,30, 33, 65, 70, 120 , 222, 300};
	   int key = binaySearch(array, 0, array.length-1, 300);
       System.out.println(key);
   }
   
   static int binaySearch(int array [] , int low , int high , int data) {
	   if(low <= high) {
		   int mid =  (low+high)/2;
		   if(array[mid] == data) {
			   return mid;
		   }
		   if(data > array[mid]) {
			   return binaySearch(array, mid +1, high, data);
		   }
		   return binaySearch(array, low, mid-1, data);
	   }
	   return -1;
   }
}
