package com.DataStructure.LinkedList.Double;

public class linkList {
  static Node head;
public static void main(String args[]) {
 createLinkList(1);
 createLinkList(2);
 createLinkList(3);
 createLinkList(4);
 System.out.println("print original");
 printList();
 insertAtStart(10);
 System.out.println();
 System.out.println("Add at the start");
 printList();
 System.out.println();
 insertAtEnd(20);
 System.out.println("Add at the end");
 printList();
 System.out.println();
 insertInBetween(100, 3);
 System.out.println("Add in between");
 printList();
}
public static Node createLinkList(int data) {
	Node node = new Node(data);
	if(head == null) {
		head = node;
	}else {
		Node tempNode = head;
		while(tempNode.next!=null) {
			tempNode =tempNode.next;
		}
		tempNode.next = node;
		node.prev = tempNode;
	}
	return head;
}

public static void printList() {
	Node temp =head;
	while(temp!=null) {
		System.out.print(temp.data +" ");
		temp = temp.next;
	}
}

public static void insertAtStart(int data) {
	Node temp =head;
	Node newNode = new Node(data);
	if(head == null) {
		head = newNode;
	}else {
		newNode.next = temp;
		head = newNode;
		head.next.prev = newNode;
	}
}

public static void insertAtEnd(int data) {
	Node temp = head;
	Node node = new Node(data);
	if(head == null) {
		head = node;
	}else {
	   	while(temp.next!=null) {
	   		temp = temp.next;
	   	}
	   	temp.next = node;
	   	node.prev = temp;
	}
}

public static void insertInBetween(int data, int position) {
	Node temp = head;
	Node node = new Node(data);
	while(temp!=null) {
		if(position == temp.data) {
            node.next = temp.next;
            temp.next = node;
            node.prev = temp;
            node.next.prev = node;
 		}
		temp = temp.next;
	}
  }
}