package com.DataStructure.LinkedList.Single;

public class LinearSearch {
   static Node head ;
	public  static void main(String args[]) {
	   head = insert(2);
	   insert(10);
	   insert(5);
	   insert(10);
	   insert(12);
	   insert(3);
	   insert(41);
	   print(head);
	   System.out.println();
	  System.out.println(search(head ,41));
	}
	public static Node insert(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
		}else {
			Node temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
		   temp.next = newNode;
		}
		return head;
	}
	
	public static Node search( Node head ,int targetData) {
	   if(head != null) {
	   while(head != null) {
		    if(head.data == targetData) {
		    	return  head;
		    }
		   head = head.next;
	   }
	  }
	 return head;
   }
	
	public static void print(Node head) {
		Node current = head;
		while(current!= null) {
			System.out.print(" -> " +current.data);
		   current = current.next;
		}
	}
}