package DSA.LinkedList.Single;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import DSA.LinkedList.Single.LinkedList.Node;

public class RemoveZeroSumConsecutiveNode {
	public static void main (String args []) 
	{
		LinkedList list = new LinkedList();
		// 1,2,3,-3,4
		// 1,2,3,-3,-2
		// 6 -6 3 2 -5 4
		// 1 2 3 -3 -1
		NitantLinkedList.CreateLinkedList(list, 1);
		NitantLinkedList.CreateLinkedList(list, 2);
		NitantLinkedList.CreateLinkedList(list, 3);
		NitantLinkedList.CreateLinkedList(list, -3);
		NitantLinkedList.CreateLinkedList(list, 4);
		//UsingPrefixSumMethod(list);
		NitantLinkedList.printList(list);
		System.out.println();
		removeConsecutiveNode(list);
	}
	
	public static LinkedList usingHashMethod(LinkedList list) 
	{
		Node head = list.head;
		Map<Integer, Node> m = new HashMap<>();
		
		Node dummy=new Node(0);
        dummy.next=head;
        int prefixsum=0;
        
        while(head!=null)
        {
            prefixsum = prefixsum + head.data;
            if(m.containsKey(prefixsum))
            {
                Node start=m.get(prefixsum);
                int sum = prefixsum;
                while(start!=null && start!=head)
                {
                    start=start.next;
                    sum = sum + start.data;
                    if(start!=head) 
                    {
                    	m.remove(sum);
                    }
                }
                
                Node temp = m.get(prefixsum);
                temp.next = head.next;
            }
            else
            {
            	m.put(prefixsum, head);
            } 
            head=head.next;
        }
        return list;
    }
	
	public static void usingStackMethod (LinkedList root) 
	{
		 Node start = root.head;
	     Stack<Node> stack = new Stack<>();
	     boolean flag = false;
	     List<Node> list = new ArrayList<>();
	     
	     while (start != null) 
	     {
	        if (start.data > 0) 
	        {
	            stack.push(start);
	        }
	        else 
	        {
	            int sum = start.data;
	            flag = false;
	            while (!stack.isEmpty()) 
	            {
	                Node temp = stack.pop();
	                sum = sum + temp.data;
	                if (sum == 0) 
	                {
	                	flag = true;
	                    list.clear();
	                    break;
	                }
	                list.add(temp);
	            }
	            if (!flag)
	            {
	            	list.forEach(i -> stack.add(i));
	                stack.add(start);
	            }
	        }
	        start = start.next;
	     }
	     stack.forEach(i -> System.out.print(i.data +" -> "));
	     System.out.println("NULL");
	}

	public static void removeConsecutiveNode(LinkedList list)
	{
		Node start = list.head;
		int prefixSum = 0;
		Map<Integer, Node> map = new HashMap<>();
		Node nodeFromDelete =  null;
		
		while (start != null) 
		{
			prefixSum = prefixSum + start.data;
			if (!map.containsKey(prefixSum)) 
			{
				map.put(prefixSum, start);
			} 
			else
			{
				nodeFromDelete =  map.get(prefixSum);
				break;
			}
			start = start.next;
		}
		
		System.out.println("Start Pointer " + start.data);
		System.out.println("Node to delete from " + nodeFromDelete.data);
		
		Node node = nodeFromDelete.next;
		System.out.println(node.data);
		
		while (node != start) 
		{
			start = start.next;
		}
		
		NitantLinkedList.printList(list);
	}
	
	public static void NaiveMethd (LinkedList list) 
	{
		Node head = list.head;
		
		Node Head = new Node(0);
        
		Head.next= list.head;
        
		Node cur = Head; 
		
        while(cur!=null)
        {
            int sum = 0;
            while(head!=null)
            {
                sum = sum + head.data;
                System.out.println("sum " + sum);
                if(sum==0)
                {
                   cur.next=head.next; 
                }
                head=head.next;
            }
            cur=cur.next;
            if(cur!=null)
            {
                head=cur.next;
            }
        }
        
        Node node = Head.next;
        System.out.print("Head");
        while (node != null) {
        	System.out.print(" -> " + node.data);
        	node = node.next;
        }
	}
	
	public static void UsingPrefixSumMethod (LinkedList list) 
	{
		   Node head = list.head;
		   Map<Integer, Node> map = new HashMap<>();	     
	       int prefixSum = 0;
	       while(head != null){
	           prefixSum = prefixSum + head.data;
	           if(map.containsKey(prefixSum)){
	               Node prev = map.get(prefixSum);
	               Node node = prev.next;
	               int sum = prefixSum;
	               while(node != head)
	               {
	                   sum = sum + node.data;
	                   map.remove(sum);
	                   node = node.next;
	               }
	               prev.next = head.next;
	           } 
	           else
	           {
	               map.put(prefixSum, head);
	           }
	           
	           head = head.next;
	       }
	}
}