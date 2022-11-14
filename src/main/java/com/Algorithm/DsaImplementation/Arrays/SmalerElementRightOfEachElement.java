package com.Algorithm.DsaImplementation.Arrays;

public class SmalerElementRightOfEachElement {
   public static void main(String args[]) {
	   int array[] = {10,3,4,5,7,1,3,2};
	   count_1(array);
	   System.out.println();
	   printArray(new SmalerElementRightOfEachElement().countSmallerOnRight(array));
   }
   
   public static void count_1(int array[]) {
	   int count = 0;
 	   for(int i = 0; i < array.length ; i++) {
		   for(int j = i+1 ; j <= array.length-1 ; j++ ) {
		     if(array[j] <= array[i]) {
		    	 count ++;
		     }
		   }
		   System.out.print(" "+ count);
		   count = 0;
	   }
   }
 
public int size(final TreeNode node) {
    return node == null ? 0 : node.size;
}

public int height(final TreeNode node) {
    return node == null ? 0 : node.height;
}

public TreeNode rotateLeft(final TreeNode root) {
    final TreeNode newRoot = root.right;
    final TreeNode leftSubTree = newRoot.left;

    newRoot.left = root;
    root.right = leftSubTree;
    root.height = max(height(root.left), height(root.right)) + 1;
    newRoot.height = max(height(newRoot.left), height(newRoot.right)) + 1;
    newRoot.size = size(newRoot.left) + size(newRoot.right) + 1;
    newRoot.size = size(newRoot.left) + size(newRoot.right) + 1;
    return newRoot;
}

public TreeNode rotateRight(final TreeNode root) {
    final TreeNode newRoot = root.left;
    final TreeNode rightSubTree = newRoot.right;
    newRoot.right = root;
    root.left = rightSubTree;
    root.height = max(height(root.left), height(root.right)) + 1;
    newRoot.height = max(height(newRoot.left), height(newRoot.right)) + 1;
    newRoot.size = size(newRoot.left) + size(newRoot.right) + 1;
    newRoot.size = size(newRoot.left) + size(newRoot.right) + 1;
    return newRoot;
}

public int max(final int a, final int b) {
    return a >= b ? a : b;
}

public TreeNode insertIntoAVL(final TreeNode node, final int key, final int count[], final int index) {
    if (node == null) {
        return new TreeNode(key);
    }
    if (node.key > key) {
        node.left = insertIntoAVL(node.left, key, count, index);
    } else {
        node.right = insertIntoAVL(node.right, key, count, index);

        // update smaller elements count
        count[index] = count[index] + size(node.left) + 1;
    }

    // update the size and height
    node.height = max(height(node.left), height(node.right)) + 1;
    node.size = size(node.left) + size(node.right) + 1;

    // balance the tree
    final int balance = height(node.left) - height(node.right);
    // left-left
    if (balance > 1 && node.key > key) {
        return rotateRight(node);
    }
    // right-right
    if (balance < -1 && node.key > key) {
        return rotateLeft(node);
    }
    // left-right
    if (balance > 1 && node.key < key) {
        node.left = rotateLeft(node.left);
        return rotateRight(node);
    }
    // right-left
    if (balance > 1 && node.key < key) {
        node.right = rotateRight(node.right);
        return rotateLeft(node);
    }
    return node;
}

public int[] countSmallerOnRight(final int[] in) {
    final int[] smaller = new int[in.length];

    TreeNode root = null;
    for (int i = in.length - 1; i >= 0; i--) {
        root = insertIntoAVL(root, in[i], smaller, i);
    }

    return smaller;
}

public static void printArray(int array[]) {
	for(int i =0 ; i < array.length ; i++) {
		System.out.print(" "+array[i]);
	}
  }
}
class TreeNode {
    int key;
    int height;
    int size;
    TreeNode left;
    TreeNode right;
    TreeNode parent;

    public TreeNode(final int key) {
        this.key = key;
        this.size = 1;
        this.height = 1;
        this.left = null;
        this.right = null;
   }
}
