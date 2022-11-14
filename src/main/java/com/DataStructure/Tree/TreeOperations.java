package com.DataStructure.Tree;

public class TreeOperations {
    static Node root;
	public static void main(String args []) {
		root = new Node(10);
		root.leftLink= new Node(20); 
		root.rightLink = new Node(30); 
		root.leftLink.leftLink = new Node(40); 
		root.rightLink.leftLink = new Node(50);    
		System.out.println("count is "+countOfTheNode(root));
	}
	
	public static void inOrderTraversal(Node root) {
		if(root!=null) {
			inOrderTraversal(root.leftLink);
			System.out.print(" "+root.data);
			inOrderTraversal(root.rightLink);
		}
	}
	
	public static void preOrderTraversal(Node root) {
		if(root!= null) {
			System.out.print(" "+root.data);
			preOrderTraversal(root.leftLink);
			preOrderTraversal(root.rightLink);
		}
	}
	public static void postOrderTraversal(Node root) {
		if (root !=null) {
			postOrderTraversal(root.leftLink);
			postOrderTraversal(root.rightLink);
			   System.out.print(" " +root.data);
		   }
	}
	
   public static int countOfTheNode(Node root) {
	   if(root!=null) {
		   return (1+ countOfTheNode(root.leftLink) + countOfTheNode(root.rightLink));
	   }else {
		   return 0;
	   }
   }
   public static int sumOfTheNode(Node root) {
	   if(root!=null) {
		   return (root.data + sumOfTheNode(root.leftLink) + sumOfTheNode(root.rightLink));
	   }else {
		   return 0;
	   }
   }

   int minvalue(Node node) { 
       Node current = node; 
       while (current.leftLink != null) { 
           current = current.leftLink; 
       }
       return (current.data); 
   } 
   
   int maxvalue(Node node) { 
       Node current = node; 
       while (current.rightLink != null) { 
           current = current.rightLink; 
       } 
       return (current.data); 
   } 
}