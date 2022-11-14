package com.DataStructure.Heap;

import java.util.PriorityQueue;

public class K_largest_element_using_priorityueue {
   
	public static void main(String args []) {
		int array[] = {1,2,10,21,4,3,50,60,32};
		fidElement(array, 2);
	}
	public static void fidElement(int num[] , int k) {
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>(k);
		for(int number : num) {
			queue.offer(number);
            if(queue.size() > k) {
            	queue.poll();
            }
            
		}
		System.out.println(queue);
		System.out.println(queue.peek());
	}
}
