package com.DataStructure.StackQueue;

public class LinkListImplementationOfStack {
  Node top;
  public void push(int data) {
	  Node newNode = new Node(data);
	  if(top == null) {  
	       top = newNode;
	  }else {
		  newNode.next=top;
		  top = newNode;
	  }
  }
  public void pop() {
      Node temp = top; 
	  if(top!=null) {
		  System.out.println("Popped element is  " + top.data);
		  top = temp.next;
		  temp.next = null;
	  }
	  else {
		  System.out.println("UnderFlow nothing to pop ");
	  }
  }
  public void printData() {
	  Node temp = top ;
	  System.out.print( top);
      while(temp!=null) {
    	  System.out.print("-> " + temp.data);
          temp = temp.next;
      }
  }
}
