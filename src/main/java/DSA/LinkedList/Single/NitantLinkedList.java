package DSA.LinkedList.Single;

import DSA.LinkedList.Single.LinkedList.Node;

class LinkedList {
	Node head;
	public static class Node {
		int data;
		Node next;
		Node (int data) {
			this.data = data;
			this.next = null;
		}
	}
}

public class NitantLinkedList {
	
	public static void main (String args []) 
	{
		LinkedList list = new LinkedList();
		CreateLinkedList(list, 1);
		CreateLinkedList(list, 2);
		CreateLinkedList(list, 3);
		CreateLinkedList(list, 4);
		CreateLinkedList(list, 5);
		CreateLinkedList(list, 6);
		CreateLinkedList(list, 7);
		CreateLinkedList(list, 8);
		CreateLinkedList(list, 9);
		list = CreateLinkedList(list, 10);
		printList(list);
		System.out.println();
		InsertNodeAtStart(list, 21);
		list =  InsertNodeAtStart(list, 32);
	    printList(list);
	    list = InsertNodeAtIndex(list, 100, 3);
	    System.out.println();
	    printList(list);
	    list = InsertNodeAtIndex(list, 100, 5);
	    System.out.println();
	    printList(list);
	    list = InsertNodeAtIndex(list, 200, 7);
	    System.out.println();
	    printList(list);
	    list = InsertNodeAtIndex(list, 300, 5);
	    System.out.println();
	    printList(list);
	}
	
	public static LinkedList CreateLinkedList(LinkedList list, int data) 
	{
		Node newNode = new Node(data);
		
		if (list.head == null) 
		{
			list.head = newNode;
		} 
		else 
		{
			Node temp = list.head;
			while (temp.next != null) 
			{
				temp = temp.next;
			}
			temp.next = newNode;
		}
		return list;
	}
	
	public static LinkedList InsertNodeAtStart(LinkedList list , int data) 
	{
		Node newNode = new Node(data);
		if (list.head == null) {
			list.head = newNode;
		} else {
			newNode.next = list.head;
		    list.head = newNode;
		}
		return list;
	}
	
	public static LinkedList InsertNodeAtIndex (LinkedList list, int data, int index) 
	{
		Node newNode = new Node(data);
		Node currentNode = list.head;
		int counter = 0;
		
		while (currentNode != null) 
		{
			if (counter == index - 2) 
			{
				newNode.next = currentNode.next;
				currentNode.next = newNode;
			}
			currentNode =  currentNode.next;
			counter ++;
		}
		return list;
	}
	
	public static void printList(LinkedList list) 
	{
		Node currentNode = list.head;		
		System.out.print("Head");
		while(currentNode != null) 
		{
			System.out.print(" -> "+currentNode.data);
			currentNode = currentNode.next;
		}
	}
}