package com.DataStructure.Tree;

public class BinarySearchTreeWithArray {
   static Node root;
	static class Node{
	   int data;
	   Node left, right;
      Node(int data){
    	  this.data =  data;
    	  this.left = null;
    	  this.right = null;
      }
	}
	
	public static void main(String args[]) {
		int array [] = {10,2,31,42,52,6,7,82,91,11};
		for(int i =0 ;i< array.length ; i++) {
			root = insert(root, array[i]);
		}
		inOrder(root);
	}
	
	public static Node insert(Node root, int data) {
		if(root == null ) {
			  root = new Node (data);
		     return root ;
		  }
		  if(data < root.data) {
			  root.left = insert(root.left , data);
		  }
		  else if(data > root.data){
			   root.right = insert(root.right , data);
		  }
		  return root;
	}
	
	public static void inOrder(Node root) {
		if(root!=null) {
			inOrder(root.left);
			System.out.print(root.data+" ");
			inOrder(root.right);
		}
	}
}
