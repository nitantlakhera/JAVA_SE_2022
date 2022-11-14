package com.Excercises.LogicalCode;

import com.DataStructure.Tree.Node;

public class TreeDs {
	static Node root;
	public static void main(String args []) {
		root = new Node(10);
		root.leftLink= new Node(20); 
		root.rightLink = new Node(30); 
		root.leftLink.leftLink = new Node(40); 
		root.rightLink.leftLink = new Node(50); 
		System.out.println(countNode(root));
		System.out.println(numberOfleaf(root));
		System.out.println(sumOfNode(root));
		System.out.println(fullNode(root));
		System.out.println(HeightOfTree(root));
	}

	public static void inOrder(Node root) {
		if(root!=null) {
			inOrder(root.leftLink);
			System.out.println(root.data);
			inOrder(root.rightLink);
		}
	}
	
	public static int countNode(Node root) {
		if(root!=null) {
			return 1 + countNode(root.leftLink) + countNode(root.rightLink);
		}
		else {
			return 0;
		}
	}
	public static int numberOfleaf(Node root) {
		if(root == null) {
		      return 0;
		}
		if(root.leftLink == null && root.rightLink == null) {
				return 0;
		}else {
				return 1 + numberOfleaf(root.leftLink) + numberOfleaf(root.rightLink);
		      }
	}
	public static int sumOfNode(Node root) {
		if(root!=null) {
			return root.data + sumOfNode(root.leftLink) + sumOfNode(root.rightLink);
		}else {
			return 0;
		}
    }
	public static int fullNode (Node root) {
		if(root == null) {
			return 0;
		}
		if(root.leftLink == null && root.rightLink == null) {
			return 0;
		}
		return fullNode(root.leftLink) + fullNode(root.rightLink) + (root.leftLink!= null && root.rightLink != null ? 1 : 0 );
	}

	public static int HeightOfTree(Node root) {
      if(root ==  null) {		
    	  return 0;
      }
      if(root.leftLink == null && root.rightLink == null) {
    	  return 0;
      }
      int leftTree =  HeightOfTree(root.leftLink);
      int rightTree  = HeightOfTree(root.rightLink);
      return 1 + (leftTree > rightTree ? leftTree : rightTree);
	}
}