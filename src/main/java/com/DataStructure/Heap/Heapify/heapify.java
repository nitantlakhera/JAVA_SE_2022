package com.DataStructure.Heap.Heapify;

public class heapify {
    public void heapi_fy(int array [],int length , int index ) {
        int left_child = 2*index;
        int right_child = 2*index+1;
    	int largest = index;
        if(left_child<=length && array[left_child] > array[index]) {
    		largest = left_child; 
    	}else {
    		largest = index;
    	}
        if(right_child <= length && array[right_child] > array[largest]) {
        	largest = right_child;
        }
        if(largest!=index) {
        	int swap = array[index]; 
            array[index] = array[largest]; 
            array[largest] = swap;
            heapi_fy(array, length, index);
        }
    }
}
