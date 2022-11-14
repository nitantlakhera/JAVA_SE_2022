package com.DataStructure.Tree.Vertical_node;

public class verticalSum {
	static int min  =0 ;
	static int max =0;
	static Node root;
public static void main(String args[]) {
	root = new Node(1); 
    root.leftLink = new Node(2); 
    root.rightLink = new Node(3); 
    root.leftLink.leftLink = new Node(4); 
    root.leftLink.rightLink = new Node(5); 
    root.rightLink.leftLink = new Node(6); 
    root.rightLink.rightLink = new Node(7); 
    root.rightLink.leftLink.rightLink = new Node(8); 
    root.rightLink.rightLink.rightLink = new Node(9);
    new verticalSum().findMinMax(root, min, max, 0);
    for(int i = min ; i<= max ; i++) {
		int sum = verticalSumData(root, i, 0);
		System.out.println("sum is " + sum);
	}
}
public static int verticalSumData(Node root, int line_no , int hd) {
	if(root ==null) {
		return -1;
	}
	if(line_no == hd) {
		return (root.data+verticalSumData(root.leftLink, line_no, hd-1)+verticalSumData(root.rightLink, line_no, hd+1));
	}
	return verticalSumData(root.leftLink, line_no, hd)+verticalSumData(root.rightLink, line_no, hd);
}
void  findMinMax(Node node, int min, int max, int hd)  
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
}
