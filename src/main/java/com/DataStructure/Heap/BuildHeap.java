package com.DataStructure.Heap;

public class BuildHeap {
       public void build_heap(int array[] , int length) {
    	   HeapiFy heap = new HeapiFy();
    	   int index = (length/2)-1;
    	   for(int i = index; i>=0 ; i--) {
    		   heap.heapify(array,i ,0);
    	   }
       }
}
