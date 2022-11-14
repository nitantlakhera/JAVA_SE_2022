package com.DataStructure.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class Level_order_Traversal {
  static Node root;
  public static void main(String args[]) {
	root = new Node(1); 
    root.leftLink = new Node(2); 
    root.rightLink = new Node(3); 
    root.leftLink.leftLink = new Node(4); 
    root.leftLink.rightLink = new Node(5);
	print();
  }
  public static void print() {
	  if(root==null) {
		  return;
	  }
	  Queue<Node> queue = new LinkedList<Node>();
	  queue.add(root);
	  while(!queue.isEmpty()) {
		  Node temp = queue.poll();
		  System.out.print(temp.data+" ");
		  if(temp.leftLink!=null) {
			  queue.add(temp.leftLink);
		  }
		  if(temp.rightLink!=null) {
			  queue.add(temp.rightLink);
		  }
	  }
  }
}