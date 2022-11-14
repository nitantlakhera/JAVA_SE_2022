package com.DataStructure.Tree;

public class vertical_order_traversal {
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
       new vertical_order_traversal().verticalOrder(root);
   }
   
   void findMinMax(Node node, int min, int max, int hd)  
   { 
       if (node == null)  
           return; 
       if (hd < min)  
           min = hd; 
       else if (hd > max)  
           max = hd; 
       findMinMax(node.leftLink, min, max, hd - 1); 
       findMinMax(node.rightLink, min, max, hd + 1); 
   }
   
   void printVerticalLine(Node node, int line_no, int hd)  
   { 
       if (node == null)  
           return; 
       if (hd == line_no)  
           System.out.print(node.data + " ");         
       printVerticalLine(node.leftLink, line_no, hd - 1); 
       printVerticalLine(node.rightLink, line_no, hd + 1); 
   } 
   void verticalOrder(Node node)  
   { 
	   int min = 0, max =0;
       findMinMax(node, min, max, 0); 
       for (int line_no = min; line_no <= max; line_no++)  
       { 
           printVerticalLine(node, line_no, 0); 
           System.out.println(""); 
       } 
   }
}