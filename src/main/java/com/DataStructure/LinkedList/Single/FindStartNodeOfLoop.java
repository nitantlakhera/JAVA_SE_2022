package com.DataStructure.LinkedList.Single;

public class FindStartNodeOfLoop {
 static Node head ;
	public static void main(String args []) {
		    head = new Node(50); 
		    head.next = new Node(20); 
		    head.next.next = new Node(15); 
		    head.next.next.next = new Node(4); 
		    head.next.next.next.next = new Node(10); 
		  
		    /* Create a loop for testing */
		    head.next.next.next.next.next = head.next.next; 
		  
		Node node =find(head);
	    System.out.println(node.data);
  }
	
	public  static Node find(Node head) {
		Node slow = head ;
		Node fast = head;
		int loopPresent=0;
		while(fast!=null && slow!=null &fast.next!=null) {
			fast = fast.next.next;
			slow = slow.next;
			if(fast == slow ) {
				loopPresent =1;
				break;
			}
		}
		if(loopPresent==1) {
			slow = head;
			while(slow!=fast) {
				slow = slow.next;
				fast = fast.next;
			}
		}
		return slow;
	}
}
