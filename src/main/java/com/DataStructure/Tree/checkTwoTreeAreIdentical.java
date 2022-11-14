package com.DataStructure.Tree;

public class checkTwoTreeAreIdentical {
  static Node root1;
  static Node root2;
	public static void main(String args []) {
	  root1 = new Node(1); 
      root1.leftLink = new Node(2); 
      root1.rightLink = new Node(3); 
      root1.leftLink.leftLink = new Node(4); 
      root1.leftLink.rightLink = new Node(5); 
 
      root2 = new Node(1); 
      root2.leftLink = new Node(2); 
      root2.rightLink = new Node(3); 
      root2.leftLink.leftLink = new Node(4); 
      root2.leftLink.rightLink = new Node(5); 
      if(check(root1 , root2)) {
    	  System.out.println("identical ");
      }else {
    	  System.out.println("different");
      }
  }
  public static boolean check(Node root1 , Node root2) {
	  if(root1==null && root2 == null) {
		  return true;
	  }
      if(root1!=null && root2!=null) {
    	  return (root1.data == root2.data 
                  && check(root1.leftLink, root2.leftLink) 
                  && check(root1.rightLink, root2.rightLink)); 
      }
	  return false;
  }
}

