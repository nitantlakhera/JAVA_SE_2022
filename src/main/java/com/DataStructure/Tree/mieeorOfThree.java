package com.DataStructure.Tree;

public class mieeorOfThree {
    static Node root;
	public static void main(String args []) {
		root = new Node(10);
		root.leftLink= new Node(20); 
		root.rightLink = new Node(30); 
		root.leftLink.leftLink = new Node(40); 
		root.rightLink.leftLink = new Node(50);    
		print(root);
		mirror(root);
		System.out.println();
		print(root);    
	}
	
   public static Node mirror(Node root) {
	if(root==null) {   
		return root;
	}
     mirror(root.leftLink);
     mirror(root.rightLink);
     Node temp;
     temp = root.leftLink;
     root.leftLink = root.rightLink;
     root.rightLink = temp ;
   return root;
   }
   
   public static void print(Node root) {
	   if(root!=null) {
		   print(root.leftLink);
		   System.out.print(root.data);
		   print(root.rightLink);
	   }
   }
}