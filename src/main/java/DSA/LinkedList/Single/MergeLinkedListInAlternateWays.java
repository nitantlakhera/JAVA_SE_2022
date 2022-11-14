package DSA.LinkedList.Single;

import DSA.LinkedList.Single.LinkedList.Node;

public class MergeLinkedListInAlternateWays {
	public static void main (String args[]) 
	{
		LinkedList list1 = new LinkedList();
		NitantLinkedList.CreateLinkedList(list1, 5);
		NitantLinkedList.CreateLinkedList(list1, 7);
		NitantLinkedList.CreateLinkedList(list1, 17);
		NitantLinkedList.CreateLinkedList(list1, 13);
		NitantLinkedList.CreateLinkedList(list1, 11);
		NitantLinkedList.CreateLinkedList(list1, 14);
		
		LinkedList list2 = new LinkedList();
		NitantLinkedList.CreateLinkedList(list2, 12);
		NitantLinkedList.CreateLinkedList(list2, 10);
		NitantLinkedList.CreateLinkedList(list2, 2);
		NitantLinkedList.CreateLinkedList(list2, 4);
		NitantLinkedList.CreateLinkedList(list2, 6);
		NitantLinkedList.printList(list1);
		System.out.println();
		NitantLinkedList.printList(list2);
		LinkedList finalList = mergeTwoList(list1, list2);
		NitantLinkedList.printList(finalList);
	}
	
	
	public static LinkedList mergeTwoList(LinkedList list1 , LinkedList list2) 
	{
		LinkedList finalList = new LinkedList();
		int i = 0;
		Node head1 = list1.head;
		Node head2 = list2.head;
		System.out.println();
		while (head1 != null || head2 != null) 
		{
			if (i % 2 == 0) 
			{
				NitantLinkedList.CreateLinkedList(finalList, head1.data);
				head1 = head1.next;
			}
			else 
			{
				NitantLinkedList.CreateLinkedList(finalList, head2.data);
				head2 = head2.next;
			}
			i ++;
		}
		return finalList;
	}

}
