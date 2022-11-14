package com.DataStructure.Heap;

public class HeapTest {
   public static void main(String args []) {
	   long startTime = System.nanoTime();
	   int array[] = { 12, 11, 13, 5, 6, 7 , 24 , 2 , 34 };
	   int n = array.length;
	   new BuildHeap().build_heap(array , n);
	   new HeapSort().sortHeap(array);
       for(int i =0;i<array.length ; ++i) {
    	  System.out.println(array[i]);
       }
	   long endTime   = System.nanoTime();
	   long totalTime = endTime - startTime;
	   System.out.println("The time taken by algorithm -> "+totalTime);
	   }
}