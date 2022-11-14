package com.DataStructure.Tree;
public class TreeWithArray {
    static Node root;
	static class Node {
    	int data;
    	Node left, right;
        Node(int data){
        	this.data = data;
        	this.left = null;
        	this.right = null;
        }
	}

	public static void main(String args[]) {
		int array []  ={ 1, 2, 3, 4, 5, 6, 6, 6, 6 }; 
		root = TreeWithArray.createTree(array, root, 0);
		TreeWithArray.inorder(root);
	}
	
	public static Node createTree(int array[] , Node root, int index) {
		if(index < array.length ) {
			Node temp = new Node(array[index]);
			root = temp;
			root.left =  createTree(array, root.left ,  2*index + 1);
		    root.right = createTree(array, root.right, 2*index + 2);
		}
		return root;
	}
	
	public static void inorder(Node root) {
		if(root!=null) {
			inorder(root.left);
			System.out.print(root.data+" ");
			inorder(root.right);
		}
	}
}