package com.DataStructure.StackQueue;

public class QueueImplementation {
      int max = 7 , front = -1 , rear = -1 ;
	  int queue[] = new int [max];

	  public void insert(int data) {
		    rear = (rear+1)% max;
		    if(front == rear ) {
		    	System.out.println("Queue is full ");
		    	if(rear == 0) {
		    		rear = max-1;
		    	}else {
		    		rear = rear-1;
		    	}
		    } else {
		    	queue[rear ]= data;
		    }
	  }

      public void delete() {
    	  if(front == rear ) {
    		  System.out.println("UnderFlow nothing to delete");
    	  }else {
    		  front = (front+1)%max;
    		  System.out.println("deleted item is " +queue[front]);
    	  }
      }

      public void print() {
    	for(int i = rear ; i<=front ; i++) {
    		System.out.println(queue[i]);
    	}
      }
}
