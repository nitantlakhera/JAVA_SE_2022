package com.DataStructure.Heap;

public class Delete_element {
	
    public static void main(String args[]) {
        int heap[] = { 10, 5, 3, 2, 4 }; 
        build_heap(heap, heap.length);
        print(heap , heap.length);
        print(heap , deleteRoot(heap));
        System.out.println();
        print(heap, deleteRoot(heap));
    }
    
	public static int deleteRoot(int arr[]) {
		System.out.println("\nroot element is -> " +arr[0]);
		int n = arr.length;
		int lastElement = arr[n -1] ;
		arr[0] = lastElement;
		n = n - 1;
		heapify(arr, n, 0);
		return n;
	}
	
    public static void build_heap(int arr[] , int size ) {
    		   int index;
    			for(index = size/2 -1; index >= 0; index-- )
    				heapify(arr, index, size);
    }
    
    static void heapify(int arr[], int n, int i) 
    { 
    	int largest = i; // Initialize largest as root 
        int l = 2 * i + 1; // left = 2*i + 1 
        int r = 2 * i + 2; // right = 2*i + 2 
        if (l < n && arr[l] > arr[largest]) 
            largest = l; 
        if (r < n && arr[r] > arr[largest]) 
            largest = r; 
        if (largest != i) { 
            int swap = arr[i]; 
            arr[i] = arr[largest]; 
            arr[largest] = swap; 
            heapify(arr, n, largest); 
        } 
    }
    
    static void print(int arr[] , int n) {
    	for(int i =0 ; i<n ; i++) {
      	  System.out.print(arr[i]+" " );
        }
    }
}
