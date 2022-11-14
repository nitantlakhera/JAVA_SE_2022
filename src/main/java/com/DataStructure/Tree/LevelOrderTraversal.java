package com.DataStructure.Tree;
import java.util.LinkedList;
import java.util.Queue;
public class LevelOrderTraversal {
   static Node root;
	public static void main(String args []) {
	    root = new Node(1); 
	    root.leftLink = new Node(2); 
	    root.rightLink = new Node(3); 
	    root.leftLink.leftLink = new Node(4); 
	    root.leftLink.rightLink = new Node(5);
		printLeverOrderTraversal(root);
   }
   public static void printLeverOrderTraversal(Node root) {
	   if(root==null) {
		   return;
	   }
	   Queue<Node> queue = new LinkedList<Node>();
	   queue.add(root);
	   while(!queue.isEmpty()) {
		   Node tempNode = queue.poll();
		   System.out.println("Data at Node "+tempNode.data);
		   if(tempNode.leftLink!=null) {
			   queue.add(tempNode.leftLink);
		   }
		   if(tempNode.rightLink!=null) {
			   queue.add(tempNode.rightLink);
		   }
	   }
   }
}