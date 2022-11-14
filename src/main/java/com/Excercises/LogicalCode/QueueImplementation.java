package com.Excercises.LogicalCode;

public class QueueImplementation {
	static int Queue[] = new int [5];
	static int front  =  -1;
	static int rear = -1;
  public static void main(String args []) {
	  enqueue(1);
	  enqueue(2);
	  enqueue(3);
	  enqueue(4);
	  enqueue(5);
	  enqueue(6);
	  enqueue(7);
	  print(Queue);
  }

   public static void insert(int data) {
	    rear = (rear+1)%Queue.length;
	    if(front == rear ) {
	    	System.out.println("Queue is full ");
	    	if(rear == 0) {
	    		rear = Queue.length-1;
	    	}else {
	    		rear = rear-1;
	    	}
	    }else {
	    	Queue[rear ]= data;
	    }
  }
  
  public static void enqueue(int data) {
      rear = (rear + 1)%Queue.length; 
      System.out.println("Rv" + rear);
      if(front == rear) {
    	  System.out.println("FRONT " + front + " REAR " +rear);
    	  System.out.println("Overflow");
    	  if(rear == 0) {
    		  rear = Queue.length - 1;
    	  }
    	  else {
    		  rear = rear - 1;
    	  }
      } else {
    	  Queue[rear] = data;
      }
  }

  public static void print(int []Queue) {
	  for(int i = 0; i < Queue.length ; i ++ ) {
		  System.out.println(Queue[i]);
	  }
  }
}