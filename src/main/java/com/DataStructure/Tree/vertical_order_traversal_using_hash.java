package com.DataStructure.Tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class vertical_order_traversal_using_hash {
    static Map<Integer , List<Integer>> map_virticalDistance = null;
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
	       print(root);
     }
     public static void vertical_order(Node root, int hd) {
    	 if(root == null) {
    		 return ;
    	 }
    	 List<Integer> list = null;
    	 if(map_virticalDistance.containsKey(hd)) {
    		 list = map_virticalDistance.get(hd);
    	 }else {
    		 list = new ArrayList<Integer>();
    	 }
    	 list.add(root.data);
    	 map_virticalDistance.put(hd, list);
    	 vertical_order(root.leftLink, hd-1);
    	 vertical_order(root.rightLink, hd+1);
     }
     public static void print(Node root) {
         if(map_virticalDistance == null) {
    	    map_virticalDistance = new HashMap<Integer, List<Integer>>();
         }else {
        	 map_virticalDistance.clear();
         }
         vertical_order(root, 0);
         map_virticalDistance.forEach((key, value) -> System.out.println(key + " : " + value));
     }
}