package com.DataStructure.LinkedList.Single;

import java.util.HashSet;

public class findLoopOflinkList {
static Node head;
public static void main(String args[]) {
	head = new Node(50); 
    head.next = new Node(20); 
    head.next.next = new Node(15); 
    head.next.next.next = new Node(4); 
    head.next.next.next.next = new Node(10); 
    head.next.next.next.next.next = head.next.next; 
    
    if(findLoop(head)) {
    	System.out.println("Loop found");
    }else{
    	System.out.println("Loop not present");
    }
    
    if(usingHash(head)) {
    	System.out.println("loop found");
    }else {
    	System.out.println("no loop present");
    }
}

public static boolean findLoop(Node head) {
	Node slow = head ;
	Node fast = head;
	while(fast!=null && slow!=null &fast.next!=null) {
		fast = fast.next.next;
		slow = slow.next;
		if(fast == slow ) {
			return true;
		}
	}
	return false;
}

public static boolean usingHash(Node head) {
   HashSet<Node> h = new HashSet<Node>();
   while(head!=null) {
	   if(h.contains(head)) {
		   return true;
	   }
	   h.add(head);
	   head = head.next;
   }
	return false;
   }
}