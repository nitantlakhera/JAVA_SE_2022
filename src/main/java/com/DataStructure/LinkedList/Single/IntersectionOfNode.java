package com.DataStructure.LinkedList.Single;

import java.util.HashSet;

public class IntersectionOfNode {
static Node head1 ;
static Node head2;
public static void main(String args []) {
	
    head1 = new Node(1); 
    head1.next = new Node(2); 
    head1.next.next = new Node(3); 
    head1.next.next.next = new Node(4); 
    head1.next.next.next.next = new Node(5); 
    head1.next.next.next.next.next = new Node(6); 
    head1.next.next.next.next.next.next = new Node(7); 
    head2 = new Node(10); 
    head2.next = new Node(9); 
    head2.next.next = new Node(8); 
    head2.next.next.next = head1.next.next.next; 
	
		int l1 = getlength(head1);
    	int l2 = getlength(head2);
    	int length = Math.abs(l1-l2);
    System.out.println(getlength(head1) +" " + getlength(head2));
    System.out.println("difference -> "+length);
    if(l1 > l2) { 
    	System.out.println(getIntersectionPoint(l1-l2, head1, head2));
    }else {
      	System.out.println(getIntersectionPoint(l2-l1, head2, head1));
    }
    
    System.out.println("using hash " + usingHashing(head1, head2));
}

public static int getIntersectionPoint(int difference,Node head1 , Node head2) {
  Node current1 = head1;
  Node current2 = head2 ;
  for(int i =0 ; i<difference ; i++) {
	  if(current1==null) {
		  return -1;
	  }
	  current1 = current1.next;
  }
  
  while(current1!=null && current2!=null) {
	  if(current1 == current2) {
		  return current1.data;
	  }
	  current1 = current1.next;
	  current2 = current2.next;
  }
  return -1;
}

public static int getlength (Node head) {
	int count=0;
	while(head!=null) {
		count++;
		head= head.next;
	}
	return count;
}

public static int usingHashing(Node head1, Node head2) {
	HashSet<Node> hash = new HashSet<Node>();
	while(head1!=null) {
		hash.add(head1);
		head1 = head1.next;
	}
	while(head2 !=null) {
		if(hash.contains(head2)) {
			return head2.data;
		}
			head2= head2.next;
	}
	return -1;
}
}

