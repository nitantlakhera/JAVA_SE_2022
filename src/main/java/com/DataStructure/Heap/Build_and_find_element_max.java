package com.DataStructure.Heap;

public class Build_and_find_element_max {
   
   public static void main(String args[]) {
	   int arr[] = {1,2,3,4,5,6,7,8,9,10,200,120};
	   build_Heap(arr, arr.length);
	  System.out.println( findMaxElement(arr, arr.length));
   }
   
   public static void build_Heap (int arr[], int size) {
	   int index;
		for(index = size/2 -1; index >= 0; index-- )
			MinHeapify(arr, index, size);
   }
   
   static int findMaxElement(int arr[], int size)
   {
   	int  Max = 0,index;
   	for(index = (size + 1)/2; index < size; index++)
   		if(arr[index] > Max)
   			Max = arr[index];
   	return Max;
   }
   public static void MinHeapify (int arr[] , int index , int size) {
	   int left = 2*index + 1;
		int right = 2*index + 2;
		int smallest = index;

		if (left < size && arr[left] < arr[index])
	        smallest = left;
	    if (right < size && arr[right] < arr[smallest])
	        smallest = right;
	    if (smallest != index)
	    {
	        swap(arr[index], arr[smallest]);
	        MinHeapify(arr, index, smallest);
	    }
   }
   
   static void swap(int a , int b) {
	   int temp = a;
		a = b;
		b = temp;
   }
}