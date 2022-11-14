package com.DataStructure.Tree.Vertical_node;

import java.util.HashMap;
import java.util.Map;

public class verticalSumOFTreeJavaHashMap {
	private static Map<Integer, Integer> map = null;
    static Node root;
	public static void main(String args []) {
		root = new Node(1); 
	    root.leftLink = new Node(2); 
	    root.rightLink = new Node(3); 
	    root.leftLink.leftLink = new Node(4); 
	    root.leftLink.rightLink = new Node(5); 
	    root.rightLink.leftLink = new Node(6); 
	    root.rightLink.rightLink = new Node(7); 
	    root.rightLink.leftLink.rightLink = new Node(8); 
	    root.rightLink.rightLink.rightLink = new Node(9);
		verticalOrderSumOfBTree(root);
    }
    
	public static void verticalOrder(Node root , int distance) {
   	if (null == root)
			return;
		int existingValue = 0;
		if (map.containsKey(distance)) {
			existingValue = map.get(distance);
		}
		map.put(distance, root.data + existingValue);
		verticalOrder(root.leftLink, distance - 1);
		verticalOrder(root.rightLink, distance + 1);
	}
	
	public static void verticalOrderSumOfBTree(Node root) {
		if (null == map) {
			map = new HashMap<Integer, Integer>();
		} else {
			map.clear();
		}
		verticalOrder(root, 0);
		map.forEach((k, v) -> System.out.println("Nodes at distance " + k + " = " + v));
	}
}
