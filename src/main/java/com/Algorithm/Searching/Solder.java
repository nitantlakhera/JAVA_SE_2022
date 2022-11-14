package com.Algorithm.Searching;

public class Solder {
   public static void main(String args []) {
	 int array[] = {1,2,3,4,5,6,7};
	 int key = search(array, 0, array.length-1, 7);
     int sum =0;
     if(key == -1 ) {
    	 key = array.length-1;
     }
	 for(int i =0 ; i < key+1 ; i++) {
		 sum = sum + array[i];
	 }
	 System.out.println(7+" "+sum);
   }
   
   static int search(int array [] , int low , int high , int data) {
	   if(low<=high) {
		   int mid =  (low + high)/2;
		   if(array[mid ]== data){
			   return mid;
		   }
		   if(data > array[mid]) {
			   return search(array, mid+1, high, data);
		   }
		   return search(array, low, mid-1, data);
	   }
	   return -1;
   }
}