package com.DataStructure.Tree;

public class Insertion {
  static Node root;
  public static void main(String args[]) {
	    root = insert(root,50);
	    insert(root,50); 
        insert(root,30); 
        insert(root,20); 
        insert(root,40); 
        insert(root,70); 
        insert(root,60); 
        insert(root,80); 
	    print(root);
	    System.out.println();
	    Node data = search(root, 30);
	    if(data == null) {
	    	System.out.println("No such element");
	    }else {
	    	System.out.println("Yes");
	    }
	    System.out.println("Min -: "+findMin(root));
	    System.out.println("Max -: "+findMax(root));
        secondLargestElement(root);
  }
  public static Node insert(Node node, int data) {
	    if (node == null) return new Node(data); 
	    if (data < node.data) 
	        node.leftLink = insert(node.leftLink, data); 
	    else if (data > node.data) 
	        node.rightLink = insert(node.rightLink, data);    
	    return node; 
  }
  
  public static void print(Node root) {
	  Node temp = root;
	  if(temp!=null) {
		  print(temp.leftLink);
		  System.out.print(temp.data+" ");
		  print(temp.rightLink);
	  }
  }
  
  public static Node search(Node root , int data) {
	  Node temp = root;
	  if(temp==null || data == temp.data) {
		  return temp;
	  }
	  if(data<temp.data) {
		return search(temp.leftLink, data);
	  }else {
		return search(temp.rightLink, data);
	  }
  }
  
  public static int findMin(Node node) {
	  Node temp = node;
	  while(temp.leftLink!=null) {
		  temp = temp.leftLink;
	  }
	  return temp.data; 
  }
  
  public static int findMax(Node node) {
	  Node temp = node;
	  while(temp.rightLink!=null) {
		  temp = temp.rightLink;
	  }
	  return temp.data; 
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
		  node.data = findMax(node.rightLink);
		  node.rightLink = deleteElement(node.rightLink, data);
	  }
	  return node;
  }
  
  public static void secondLargestElement(Node root) {
	  Node node = root;
	  if(node.leftLink == null && node.rightLink == null) {  
	  }  
  }
}