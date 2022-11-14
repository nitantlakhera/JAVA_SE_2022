package com.DataStructure.LinkedList.Single;

public class LinkedListOperations {
    Node head;

    public void insertInList(int data) {
  	  Node newNode = new Node(data);
  	  newNode.data = data;
  	  if(head == null) {
  		 head = newNode;
  	  }
  	  else{
  	     Node tempNode = head;
  	     while (tempNode.next!=null) {
  	    	 tempNode= tempNode.next;
  	     }
  	     tempNode.next = newNode;
  	   }
  	}

	public void printList() {
	  	   Node n = head;
	  	   System.out.print(" " + head);
	  	   while (n!=null) {
	  		   System.out.print( " -> " + n.data);
	  		   n = n.next;
	  	   }
	  }
	
	public void insertAtStart(int data) {
		  Node newNode = new Node (data);
		  if(head == null) {
			  head = newNode;
		  }else {
			  Node temp = head ;
			  head = newNode;
			  head.next = temp;
		  }
	}
	
	public void inserAttheEnd(int data) {
           Node newNode = new Node(data);
	       Node temp = head ;
	       while (temp.next!= null) {
	    	   temp = temp.next;
	       }
	       temp.next = newNode;
	  }
	
	public static Node insertAtEnd(Node head , int data) {
		 Node newNode = new Node(data);
	     Node temp = head;
	       if(head==null){
	           head = newNode;
	       }
	       while(temp.next!=null){
	        temp=temp.next;
	       }
	       temp.next = newNode;
	    return head;
	}
	public void insertAtlocationUwant(int location, int data ) {
		  Node newNode = new Node (data);
		  Node temp = head ;
		  if(head == null) {
			  head = newNode;
		  }
		  while (temp.data!= location) {
			  temp = temp.next;
		  }
		     newNode.next =  temp.next;
             temp.next = newNode;
	 }
	  
	public void deleteAtStart() {
		 Node temp = head ;
		 head  = temp.next;
	     temp= null;
    }
    
    public void deleteAtTheEnd() {
		 Node temp = head;
		 while(temp.next.next!=null) {
			 temp = temp.next;
		 }		  
         temp.next = null;
	  }
	 
	public void deleteAtLocation(int location) {
		  Node temp = head ;
		  if(head == null) {
			  System.out.println("No element to delete");
		  }
		  while (temp.next.data != location) {
			  temp = temp.next;
		  }
		  temp.next = temp.next.next;
    }
	 
	public void reverseTheLinkList() {
	    Node nextNode =null, previous = null , currentNode = head;
	    while(currentNode!=null) {
	    	 nextNode=currentNode.next;
	         currentNode.next = previous;
	         previous = currentNode;
	         currentNode = nextNode;
	    }
	    head = previous;
	}
}