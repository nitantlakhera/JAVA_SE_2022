package DSA.LinkedList.Single;

import java.util.ArrayList;
import java.util.List;

import DSA.LinkedList.Single.LinkedList.Node;

public class RemoveNthNodeFromLastOfTheLinkedList {
	public static void main (String args[]) 
	{
		LinkedList list = new LinkedList();
		NitantLinkedList.CreateLinkedList(list, 1);
		NitantLinkedList.CreateLinkedList(list, 2);
		NitantLinkedList.CreateLinkedList(list, 3);
		NitantLinkedList.CreateLinkedList(list, 4);
		NitantLinkedList.CreateLinkedList(list, 5);
		NitantLinkedList.CreateLinkedList(list, 6);
		NitantLinkedList.CreateLinkedList(list, 7);
		NitantLinkedList.CreateLinkedList(list, 8);
		NitantLinkedList.CreateLinkedList(list, 9);
		list = NitantLinkedList.CreateLinkedList(list, 10);
	    //deleteNodeUsingList(list, 10);
		NitantLinkedList.printList(list);
        deleteNodeUsingTwoPointer(list, 10);
        System.out.println();
	    NitantLinkedList.printList(list);
	}
	
	public static LinkedList deleteNodeUsingList(LinkedList list, int nth) {
		List<Node> arrayList = new ArrayList<>();
		Node tempNode = list.head;
		
		while (tempNode != null) {
			if (tempNode.next != null) 
			{
				arrayList.add(tempNode);	
			}
			tempNode = tempNode.next;
		}
		
		if ((nth-1) == arrayList.size()) 
		{
			list.head = list.head.next;
			return list;
		}
		
		Node prevPtr = arrayList.get(arrayList.size() - nth);
		prevPtr.next = prevPtr.next.next;
		return list;
	}
	
	public static LinkedList deleteNodeUsingTwoPointer(LinkedList list, int nth) 
	{
		Node start = list.head;
		Node endPointer =  list.head;
		
		System.out.println();
		
		while (endPointer != null && (nth - 1) > 0) 
		{
			endPointer = endPointer.next;	
			nth--;
		}
		
		if (nth == 1) 
		{
			list.head = list.head.next;
			return list;
		}
		
		while(endPointer.next.next != null) 
		{
			start = start.next;
			endPointer =  endPointer.next;
			
		}
		
		start.next =  start.next.next;
		return list;
	}
}