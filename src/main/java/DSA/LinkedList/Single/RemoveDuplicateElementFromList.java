package DSA.LinkedList.Single;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import DSA.LinkedList.Single.LinkedList.Node;

public class RemoveDuplicateElementFromList 
{
	public static void main (String args []) 
	{
		LinkedList list = new LinkedList();
		NitantLinkedList.CreateLinkedList(list, 2);
		NitantLinkedList.CreateLinkedList(list, 8);
		NitantLinkedList.CreateLinkedList(list, 4);
		NitantLinkedList.CreateLinkedList(list, 2);
		NitantLinkedList.CreateLinkedList(list, 6);
		removeDuplicateElement(list);
	    NitantLinkedList.printList(list);
	}
	
	public static LinkedList removeDuplicateElement(LinkedList list) 
	{
		
		HashSet<Integer> hs = new HashSet<>();
		 
        Node current = list.head;
        Node prev = null;
        while (current != null) 
        {
            int curval = current.data;
            System.out.println("Current " + current.data);
            if (hs.contains(curval)) 
            {
                prev.next = current.next;
            }
            else 
            {
                hs.add(curval);
                prev = current;
                System.out.println("Prev " + prev.data);
            }
            current = current.next;
        }
		return list;
	}
}