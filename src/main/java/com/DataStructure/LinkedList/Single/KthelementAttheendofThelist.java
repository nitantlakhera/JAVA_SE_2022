package com.DataStructure.LinkedList.Single;

public class KthelementAttheendofThelist {
 static Node head;
	public static void main(String args []) {
		head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node (3);
		head.next.next.next = new Node (4);
		head.next.next.next.next = new Node (5);
		head .next.next.next.next.next = null;
	    print(head);
	    System.out.println();
	    kthElement(head, 3);
	    System.out.println();
	    System.out.println("using second method");
	    secondMethod(head, 1);
	    
  }
  public static void kthElement(Node head , int k) {
	  int count=0;
	 Node current = head; 
	  while(current !=null) {
		  count++;
		  current=current.next;
	  }
	  
	  for(int i =0 ; i<count-k; i++) {
		  head = head.next;
	  }
	  System.out.println(head.data);
  }
  public static void print(Node head) {
	  while(head !=null) {
		  System.out.print(head.data + " ");
	  head = head.next;
	  }
  }
  
  public static void secondMethod(Node head , int k) {
	  Node referencePth = head ;
	  Node mainPth = head;
	  int count =0;
	  if(head !=null) {
		  while(count<k) {
			  if(referencePth==null) {
				  System.out.println("No requested element -> ");
			  }
			  referencePth = referencePth.next;
			  count++;
		  }
		  
		  while(referencePth !=null) {
			  referencePth = referencePth.next;
			  mainPth = mainPth.next;
		  }
	  }
	  System.out.println(mainPth.data);
  } 
}