package com.DataStructure.Heap.Heapify;

import java.util.Collections;
import java.util.PriorityQueue;

public class priorityueue {
   public static void main(String args []) {
    PriorityQueue<Integer> queue = new PriorityQueue<Integer>(Collections.reverseOrder());   
    queue.add(200); 
    queue.add(100); 
    queue.add(20); 
    queue.add(400);
    queue.add(10);
    queue.add(60);
    queue.add(300);
    queue.add(120);
    System.out.println(queue);
    System.out.println(queue.poll());
    System.out.println(queue);
   }
}
