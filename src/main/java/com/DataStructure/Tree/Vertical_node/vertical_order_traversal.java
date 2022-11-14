package com.DataStructure.Tree.Vertical_node;

public class vertical_order_traversal {
   public static void main(String args []) {
	   Node  root = new Node(1); 
       root.leftLink = new Node(2); 
       root.rightLink = new Node(3); 
       root.leftLink.leftLink = new Node(4); 
       root.leftLink.rightLink = new Node(5); 
       root.rightLink.leftLink = new Node(6); 
       root.rightLink.rightLink = new Node(7); 
       root.rightLink.leftLink.rightLink = new Node(8); 
       root.rightLink.rightLink.rightLink = new Node(9);
       HeadNode headNode = new HeadNode(0);
       createDDL(root, headNode );
   }  
   public static void createDDL(Node root, HeadNode headNode) {
	     entry list = new entry(root.data);
    	 list.next = headNode.list;
    	 headNode.list = list;
    	 if(root.leftLink!=null) {
    		 if(headNode.left==null) {
    			 headNode.left = new HeadNode(headNode.hd-1);
    			 headNode.left.right = headNode;
    		 }
    		 createDDL(root.leftLink, headNode.left);
    	 }
    	 if(root.rightLink!=null) {
    		 if(headNode.right == null) {
    			 headNode.right =  new HeadNode(headNode.hd+1);
    			 headNode.right.left =  headNode;
    		 }
    		 createDDL(root.rightLink, headNode.right);
    	 }   
    }
   
   void  findMinMax(Node node, int min, int max, int hd)  
   { 
       if (node == null)  
           return; 
       if (hd < min)  
           min = hd; 
       else if (hd > max)  
           max = hd; 
       findMinMax(node.leftLink, min, max, hd - 1); 
       findMinMax(node.rightLink, min, max, hd + 1); 
   }
}