package DSA.LinkedList.Single;

import DSA.LinkedList.Single.LinkedList.Node;

public class MiddleOfTheLinkedList {
	public static void main (String args[]) {
		LinkedList list = new LinkedList();
		NitantLinkedList.CreateLinkedList(list, 11);
		NitantLinkedList.CreateLinkedList(list, 12);
		NitantLinkedList.CreateLinkedList(list, 13);
		NitantLinkedList.CreateLinkedList(list, 14);
		NitantLinkedList.CreateLinkedList(list, 15);
		NitantLinkedList.CreateLinkedList(list, 16);
		NitantLinkedList.CreateLinkedList(list, 17);
		NitantLinkedList.CreateLinkedList(list, 18);
		NitantLinkedList.CreateLinkedList(list, 19);
		list = NitantLinkedList.CreateLinkedList(list, 20);
	    NitantLinkedList.printList(list);
	    Node node = middleOfTheLinkedList(list);
	    System.out.println();
	    System.out.println("Middle Node " + node.data);
	}
	
	public static Node middleOfTheLinkedList (LinkedList list) 
	{
		LinkedList.Node slow = list.head;
		LinkedList.Node fast = list.head;
		
		while (slow.next != null && fast.next.next != null) 
		{
			slow = slow.next;
			fast = fast.next.next;
		}
		
		return slow;
	}
}