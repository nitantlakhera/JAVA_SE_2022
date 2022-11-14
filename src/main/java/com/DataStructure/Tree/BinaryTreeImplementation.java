package com.DataStructure.Tree;
import java.util.Scanner;

public class BinaryTreeImplementation {
	static Node root ;
	private static Scanner kb;
	public static void main(String args []) {
     kb = new Scanner(System.in);
	 System.out.println("Number of The node");
	 int number = kb.nextInt();
	 System.out.println("Insert Data in tree ");
	 for(int i =0 ; i < number ; i++) {
		 root = insert(root, kb.nextInt());
	 }
	 inorder(root);
	 System.out.println();
	 minumum(root);
	 maximun(root);
	 searchData(12);
	}
	
	public static Node insert(Node root ,int data ) {
	  if(root == null ) {
		  root = new Node (data);
	     return root ;
	  }
	  if(data < root.data) {
		   root.leftLink = insert(root.leftLink , data);
	  }
	  else if(data > root.data){
		   root.rightLink = insert(root.rightLink , data);
	  }
	  return root;
	}

	public static void inorder(Node root) {
		if(root!=null) {
			inorder(root.leftLink);
			System.out.print(root.data +" ");
			inorder(root.rightLink);
		}
	}
	
	public static void minumum(Node root ) {
		while(root.leftLink != null) {
			root = root.leftLink;
		}
		System.out.println("min value "+root.data);
	}
	
	public static void maximun(Node root ) {
		while(root.rightLink != null) {
			root = root.rightLink;
		}
		System.out.println("max value "+ root.data);
	}
	
	public static void searchData(int data) {
		if(search(root, data)!=0) {
			System.out.println("Searched data is present is node " + data );
		}else{
			System.out.println("Data is not present");
		}
	}
	public static int search(Node root , int data ) {
	  if(root == null) {
		 return 0;
	  }
	  if(data == root.data) {
		  return root.data;
	  }
	  return data < root.data ?search(root.leftLink, data):search(root.rightLink, data);
    }
}