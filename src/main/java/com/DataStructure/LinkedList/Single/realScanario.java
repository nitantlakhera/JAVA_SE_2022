package com.DataStructure.LinkedList.Single;

public class realScanario {
	static Node head;
	public static void main(String args []) {
    head = new Node(11);
    Node second = new Node(2);
    Node third = new Node(23);
    Node fourth = new Node(4);
    head.next = second;
    second.next = third;
    third.next= fourth;
    show();
	}

	private static void show() {
	  Node n = head ;
	  System.out.print(" "+ head );
		while (n!=null) {	
		  System.out.print(" ->  " +n.data);
		  n= n.next;
	  }
	}
}