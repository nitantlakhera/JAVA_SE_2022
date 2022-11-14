package com.DataStructure.Array.OneDArray;

public class separate0and1 {
   public static void main(String args []) {
	   int array[] = {1,1,0,1,0,1,1,0,1,0};
	   print(countMethod(array));
	   System.out.println();
	   System.out.println("---------");
	   print(usingQuickSort(array));
	   
   }
   
   public static int[] countMethod(int array[]) {
	   int count_0 = 0 ;
	   for(int i = 0 ; i<array.length ; i++) {
		   if(array[i]==0 ) {
			   count_0++;
		   }
	   }
	   for(int i =0 ; i<array.length ; i++) {
		   if(count_0!=0) {
			   array[i] = 0;
			   count_0--;
		   }
		   else {
			   array[i] = 1;
		   }
	   }
	   return array;
   }
   public static void print(int array[]) {
	   for(int i =0 ; i<array.length ; i++) {
		   System.out.print(array[i]+" ");
	   }
   }
   
   public static int[] usingQuickSort(int array []) {
	   int leftIndex =0, rightIndex = array.length-1;
	   while(leftIndex< rightIndex) {
		   while(array[leftIndex] == 0 && leftIndex < rightIndex) {
			   leftIndex ++;
		   }
		   while(array[rightIndex ] ==1 && rightIndex > leftIndex) {
			   rightIndex --;
		   }
		   if(leftIndex < rightIndex) {
			   array[leftIndex++] =0;
			   array[rightIndex--] =1;
		   }
	   }
	   return array;
   }
}
