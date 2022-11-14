package com.DataStructure.Array.OneDArray;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class orderByoccurenct {
 
  public static void main(String args[]) {
	  int array[] = {1,1,1,1,3,3,3,2,2,5,5,5,5,5};
	  Arrays.sort(array);
	  order(array);
  }
  
  public static void order(int array[]) {
    Deque<Integer > queue = new LinkedList<Integer>();
	int i=0;
	while(i<array.length) {	  
    	int count = 1;
		for(int j=i+1 ; j<array.length ; j++) {
			if(array[i] == array[j]) {
	    		count++;
	    	} else {
	    		break;
	    	}
		}
		if (queue.isEmpty()) {
			for(int j =0 ; j<count ; j++) { 	
		    	  queue.push(array[i]);
		      }
		}
		else if(queue.peekFirst() > array[i]) {	
	      for(int j =0 ; j<count ; j++) { 	
	    	  queue.add(array[i]);
	      }
	      System.out.println(count + " first " + array[i]);
	    }else if (queue.peekFirst() < array[i]) {
	    	for(int j =0 ; j<count ; j++) { 	
		    	  queue.push(array[i]);
		      }
	    	System.out.println(count + " last " + array[i]);
	    }
	    i = i + count;
	}
	System.out.println(queue);
  }
}