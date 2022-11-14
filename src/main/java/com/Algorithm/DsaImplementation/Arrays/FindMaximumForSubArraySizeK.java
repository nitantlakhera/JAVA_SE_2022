package com.Algorithm.DsaImplementation.Arrays;

import java.util.Deque;
import java.util.LinkedList;

public class FindMaximumForSubArraySizeK {
  public static void main(String args []) {
	  int array[] = {10,4,2,11,3,15,12,8,7,9,21,14};
      //findMaxInK(array, 3);
      System.out.println(" ");
      usinDQueue(array, 3);
      //solveEfficient(array, 3);
  }
  
  public static void findMaxInK(int arr[], int k) {
	  int j, max; 
	  for (int i = 0; i <= arr.length - k; i++) { 
          max = arr[i]; 
          for (j = 1; j < k; j++) { 
              if (arr[i + j] > max) {
                  max = arr[i + j]; 
              }
          } 
      System.out.print(max + " "); 
      } 
  }
  
  public static void usinDQueue(int array[], int k) {
	  Deque<Integer> queue = new LinkedList<Integer>(); 
	  
	  for(int i =0 ; i < k; i++) {
		  while(!queue.isEmpty() && array[i] >= array[queue.peekLast()] ) {
			  queue.removeLast();
		  }
		  queue.addLast(i);
	  }
	  System.out.println(queue);
	 
	  for(int i=k; i<array.length; i++)
	  {
	     System.out.println(array[queue.peekFirst()]);
	     if(queue.peekFirst()==(i-k))
	       queue.removeFirst();
	     
	     while(!queue.isEmpty() && array[i]>=array[queue.peekLast()])
	       queue.removeLast();
	     queue.addLast(i);
     }
	  System.out.println(array[queue.peekFirst()]);
  }
  
  public static void solveEfficient(int[] arr, int k) {
		LinkedList<Integer> deque = new LinkedList<>();
		for (int i = 0; i < arr.length; i++) {
			/* keep removing the elements from deque 
			 * which are smaller than the current element, 
			 * because we need to keep our deque sorted in dec order 
			 */
			while (!deque.isEmpty() && arr[i] > arr[deque.getLast()] ) {
				deque.removeLast();
			}
			/* removing the i-k element, because that element does not belong 
			 * to the subarray we are currently working on.
			 */
			while (!deque.isEmpty() && deque.getFirst() <= i - k) {
				deque.removeFirst();
			}
			deque.addLast(i);
			if(i >= k-1)
			{   
			/* only print when we have processed atleast k elements 
			 * to make the very first subarray
			 */
			System.out.print(" "+arr[deque.getFirst()]);
			}
		}
	}
}