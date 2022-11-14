package com.Excercises.LogicalCode;

public class UnknownSizedArray {
   
   public static void main(String args []) {
	   int array[] = {0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1};   
       System.out.println(getIndex(array));
   }
   
   public static int find(int array[]) {
	   int i = 0;
	   while(true) {
		   if(array[i] == 1) {
			   return i;
		   }
		   i++;
	   }
   }

   public static int getIndex(int array[]) {
	   int i = 0;
	   while(true) {
		   if(array[i] == 1) {
			   break;
		   }
		   i = i+4;
	   }
	   int leftIndex = 0, rightIndex = i ; 
	   while(leftIndex < rightIndex) {
		   int mid = (leftIndex + rightIndex)/2;
		   if(array[mid-1] == 0 && array[mid+1] == 1) {
		      return mid+1;
		   }
		   if(array[mid]==0) {
			   leftIndex = mid + 1;
		   }
		   if(array[mid] == 1) {
			   rightIndex = mid -1;
		   }
	   }
	   return -1;
   }
}