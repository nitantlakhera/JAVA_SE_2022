package com.Algorithm.Sorting;

public class quickSort {
 public static void main(String args []) {
	 int array[] = {1,2,3,0,10,77,3,2,5,77,3,9};
     print(array);
	 Sort(array, 0, array.length-1);
	 System.out.println();
     print(array);
 }
 public static int  partition(int array[], int low ,int high) {
	 int pivot = array[high];  
     int i = (low-1); // index of smaller element 
     for (int j=low; j<high; j++) 
     { 
         if (array[j] < pivot) 
         { 
             i++; 
             int temp = array[i]; 
             array[i] = array[j]; 
             array[j] = temp; 
         } 
     } 
     int temp = array[i+1]; 
     array[i+1] = array[high]; 
     array[high] = temp; 

     return i+1;
 }
 public static void Sort(int array [],int low,int high ) {
	 if(low < high) {
		 int position = partition(array , low , high);
		 Sort(array, low, position-1);
		 Sort(array, position+1, high);
	 }
 }
 public static void print(int array[]) {
	 for(int i =0 ; i<array.length ; i++) {
		 System.out.print(array[i]+" ");
	 }
 }
}