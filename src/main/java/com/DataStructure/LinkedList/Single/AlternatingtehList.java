package com.DataStructure.LinkedList.Single;

public class AlternatingtehList {
   static Node head ;
	public static void main(String args []) {
	   head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		head.next.next.next.next = new Node(50);
		head.next.next.next.next.next = new Node(60);
		Node head1, head2;
		head1 = head2 = null;
	    alternate(head, head1, head2);
	    System.out.println();
	    print(head);
   }
	
   public static void print(Node head) {
	   while(head!=null) {
		   System.out.println(head.data);
	   }
	   head= head.next;
   }
   public static  int alternate(Node head , Node head1 , Node head2) {
	   head1 = head;
	   if(head == null || head.next == null) {
		   return -1;
	   }
	   Node temp;
	   head2 = head.next;
	   while(head!=null) {
		   temp = head.next;
		   if(temp!=null) {
			  head.next = temp.next;
		   }else {
			   head = temp;
		   }
		   head = temp;
	   }
	   return -1;
   }
   
}
