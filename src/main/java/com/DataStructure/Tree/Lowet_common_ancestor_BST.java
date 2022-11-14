package com.DataStructure.Tree;

public class Lowet_common_ancestor_BST {
    static Node root;
	public static void main(String args[]) {
		root = new Node(20); 
        root.leftLink = new Node(8); 
        root.rightLink = new Node(22); 
        root.leftLink.leftLink = new Node(4); 
        root.leftLink.rightLink = new Node(12); 
        root.leftLink.rightLink.leftLink = new Node(10); 
        root.leftLink.rightLink.rightLink = new Node(14);
		//System.out.println("recursion-> " +findLCA_Recursion(root, 4, 5).data);
	    System.out.println("iteration-> " +LCA_BST_Iteration(root , 14 , 8).data);
	    findLCA(root, 14, 8);
	    System.out.println("The LCA is -> " + root.data);
	}
    public static Node LCA_BST_Iteration(Node root , int p , int q) {
    	//Binary search tree
    	Node temp = root;
    	while(temp!=null) {
    		if(temp.data > p && temp.data > q) {
    			temp= temp.leftLink; 
    		}
    		else if(temp.data < p && temp.data < q) {
    			temp = temp.rightLink;
    		}
    		else {
    			break;
    		}
    	}
    	return temp;
    }
    
   static Node findLCA_Recursion_Binary_Tree(Node node, int n1, int n2) 
    { 
        if (node == null) 
            return null; 
        if (node.data == n1 || node.data == n2) 
            return node; 
        Node left_lca = findLCA_Recursion_Binary_Tree(node.leftLink, n1, n2); 
        Node right_lca = findLCA_Recursion_Binary_Tree(node.rightLink, n1, n2); 
        if (left_lca!=null && right_lca!=null) 
            return node; 
        return (left_lca != null) ? left_lca : right_lca; 
    }
   
   static Node findLCA(Node node , int n1 , int n2) {
	    { 
	        if (node == null) 
	            return null; 
	        if (node.data > n1 && node.data > n2) {
	            return findLCA(node.leftLink, n1, n2); 
	        }
	        else if (node.data < n1 && node.data < n2) {
	            return findLCA(node.rightLink, n1, n2); 
	        }
	       return node; 
	    }
    }
}