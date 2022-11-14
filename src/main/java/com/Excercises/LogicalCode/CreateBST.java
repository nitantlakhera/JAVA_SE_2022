package com.Excercises.LogicalCode;

import java.util.LinkedList;
import java.util.Queue;

import com.DataStructure.Tree.Node;

public class CreateBST {
static Node root = null;
  public static void main(String args []) {
	  int array [] = {10,2,31,42,52,6,7,82,91,11};
		for(int i =0 ;i< array.length ; i++) {
			root = insertIntoBST(root, array[i]);
		}
		//inorder(root);
		/*
		System.out.println();
		System.out.println(minValue(root));
		System.out.println(maxValue(root));
		System.out.println(search(root, 82).data);
		System.out.println(deleteElement(root, 10).data);
		inorder(root);
		System.out.println();
		System.out.println(isComplete(root));
		*/
		//print();
		System.out.println(LCA(root, 7, 52).data);
		System.out.println(whileLoop(root, 7, 52).data);
  }
  public static void inorder(Node root) {
	  if(root!=null) {
		  inorder(root.leftLink);
		  System.out.print(root.data + " ");
		  inorder(root.rightLink);
	  }
  }
  public static Node insertIntoBST(Node root , int data) {
	  if(root == null) {
		root = new Node(data); 
		return root;
	  }
	  if(data < root.data) {
		  root.leftLink = insertIntoBST(root.leftLink , data);
	  } else {
		  root.rightLink = insertIntoBST(root.rightLink , data);
	  }
	  return root;
  }
  
  static int minValue (Node root ) {
	  Node temp = root;
	  while(temp.leftLink  != null) {
		  temp = temp.leftLink;
	  }
	  return temp.data;
  }

  static int maxValue (Node root ) {
	  Node temp = root;
	  while(temp.rightLink  != null) {
		  temp = temp.rightLink;
	  }
	  return temp.data;
  }
  
  static Node search(Node root , int data) {
	  Node temp = root;
	  if(temp.data == data) {
		  return temp;
	  }
	  if(data < temp.data) {
		  return search(temp.leftLink, data);
	  }
	  else {
		  return search(temp.rightLink, data);
	  }
  }
  
  public static Node deleteElement(Node root , int data) {
	  Node node = root;
	  if(node == null) return node;
	  if(data < node.data) {
		  node.leftLink = deleteElement(node.leftLink, data);
	  }else if(data > node.data){
		  node.rightLink = deleteElement(node.rightLink, data);
	  }else {
		  if(node.leftLink ==  null) {
			  return node.leftLink;
		  }
		  else if(node.rightLink == null) {
			  return node.rightLink;
		  }
		  node.data = maxValue(node.rightLink);
		  node.rightLink = deleteElement(node.rightLink, data);
	  }
	  return node;
  }
  public static int isComplete(Node root) {
		Node temp = root;
		if(temp == null) {
			return 1;
		}
		if(temp.leftLink == null && temp.rightLink == null) {
			return 1;
		} else if(temp.leftLink!=null && temp.rightLink!=null) {
		   return isComplete(root.leftLink) + isComplete(root.rightLink);		
		} else {
			return 0;
		}
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

  public static Node LCA(Node root , int p , int q) { 
	  if(root == null) {
		  return null;
	  }
	  if(root.data > p && root.data > q) {
		  return LCA(root.leftLink, p, q);
	  }
	  else if(root.data < p && root.data < q) {
		  return LCA(root.rightLink, p, q);
	  }
	  return root;
  }

  public static Node whileLoop(Node root , int p , int q) {
	  if(root == null) {
		  return null;
	  }
	  Node temp = root;
	  while(root!=null) {
		  if(root.data > p && root.data > q) {
			  temp = root.leftLink;
		  } else if (root.data < p && root.data < q) {
		     temp = root.rightLink;
		  } else {
			  break;
		  }
	  }
	  return  temp;
  }
}