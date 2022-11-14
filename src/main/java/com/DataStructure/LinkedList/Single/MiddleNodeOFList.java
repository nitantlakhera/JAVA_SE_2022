package com.DataStructure.LinkedList.Single;

public class MiddleNodeOFList {
   static Node  head;
	public static void main(String args[]) {
	   head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node (3);
		head.next.next.next = new Node (4);
		head.next.next.next.next = new Node (5);
		head .next.next.next.next.next = null;
	    print(head);
	    System.out.println(" ");
	    System.out.println("middle node data is -:");
	    System.out.println(middleNode(head));    
   }

   public static int middleNode(Node head) {
	   Node slowPointer = head;
	   Node fastPointer = head;
	  if(head !=null) {
	   while(fastPointer!=null && fastPointer.next != null) {
		   fastPointer = fastPointer.next.next;
		   slowPointer = slowPointer.next;
	   }
	  }
	   return slowPointer.data;
   }
   
   public static void print(Node head) {
	   while(head != null) {
		   System.out.print(head.data);
		   head = head.next;
	   }
   }
}