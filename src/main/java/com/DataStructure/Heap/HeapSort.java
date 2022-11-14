package com.DataStructure.Heap;

public class HeapSort {
     public void sortHeap(int array[]) {   
    	
    	 int n = array.length;
    	 for (int i=n-1; i>=0; i--) 
         { 
             int temp = array[0]; 
             array[0] = array[i]; 
             array[i] = temp; 
             new HeapiFy().heapify(array, i, 0); 
         } 
     }
}
