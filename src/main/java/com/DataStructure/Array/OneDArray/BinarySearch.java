package com.DataStructure.Array.OneDArray;

import java.util.Scanner;


public class BinarySearch {
   private static Scanner kb;
   private static int elementAtIndex;

   public static void main(String args []) {
	   kb = new Scanner (System.in);
	   System.out.println("Enter the size");
	   int size = kb.nextInt();
	   int array [] = new int [size];
	   System.out.println("Enter element in array");
	   for(int i =0; i<array.length ; i++ ) {
		  array[i]= kb.nextInt();  
	   }
	   System.out.println("Enter element");
	   search(array , 0 , size, kb.nextInt());
   }
   
  public static void search(int array[] , int l_index , int r_index , int data) {
	   if(binarySearch1(array, l_index, r_index, data)==0) {
	       System.out.println("Element present in array at index -> " +elementAtIndex );
	   }else {
		   System.out.println("Element is not present");
	   }
   }
  
   public static int binarySearch(int array [] , int l_index , int r_index , int data) {
	   int middle_index ;
	   while(l_index <= r_index) {
		   middle_index = l_index + (r_index - l_index)/2;
		   if(array[middle_index] == data) {
			   elementAtIndex = middle_index;
			   return 0;
		   }
		   if(array[middle_index] < data) {
			   l_index = middle_index + 1;
		   }else {
			   r_index = middle_index - 1;
		   }
	   }
	   return -1;
   }
   
   public static int binarySearch1(int array [] , int l_index , int r_index , int data) {
	   int mid_value;
	   System.out.println("Data need to search is -> " + data);
	   while(l_index <= r_index) {
		   mid_value = (l_index + r_index)/2;
		   if(array[mid_value] == data) {
			   elementAtIndex = mid_value;
			   return 0;
		   }
		   if(data < array[mid_value]) {
			   r_index = mid_value -1 ; 
		   }else {
			   l_index = l_index + 1;
		   }
	   }
	   return -1;
   }
   
   public static int binaryThroughRecursion(int array [] , int l , int r , int data ) {
	   int mid;
	   if(l==r) {
		   if(array [l]== data) {
			   return l;
		   
		   }else {
			   return -1;
		   }
	   }else {
		   mid = (l+r)/2;
		   if(array [mid ] == data) {
			   elementAtIndex = mid;
			   return 0;
		   }
		   if(data < array[mid] ) {
			   binaryThroughRecursion(array, l , r-1, data);
		   }else {
			   binaryThroughRecursion(array, l +1, r, data);
		   }
	   }
	   return -1;
   }
}