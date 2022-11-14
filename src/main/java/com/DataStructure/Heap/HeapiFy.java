package com.DataStructure.Heap;

public class HeapiFy {
    
	public void heapify(int array[] ,int length ,  int index) {
        int left = 2*index+1;
        int right = 2*index+2;
        int largest=  index;
        
        if(left <length && array[left] > array[index] ) {
        	largest = left;
        }else {
        	largest = index;
        }
        if(right <length && array[right] > array[largest]) {
        	largest = right;
        }
        if(largest!=index) {
           int swap = array[index]; 
           array[index] = array[largest]; 
           array[largest] = swap;
           heapify(array, length , largest);
        }
    }
}
