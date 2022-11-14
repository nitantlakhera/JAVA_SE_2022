package com.DataStructure.StackQueue;

import java.util.PriorityQueue;

public class priarotyueue {
  public static void main(String args[]){	
	  int array [] = {1,2,3,9,10,12};
	  int k =7;
	  PriorityQueue<Integer> qu = new PriorityQueue<Integer>();
	 for(int i : array) {
       qu.add(i);		 
	 }
	 int count = 0 ;
	 while(qu.size()>1 && qu.peek() < k) {
		int first = qu.poll();
		int second =  qu.poll();
		qu.add( 1 * first + 2* second);
		count ++;
	 }
	 System.out.println(count);
   if(qu.peek() < k) {
	   System.out.println(-1);
   }else {
	   System.out.println(count);
   }
  }
}
