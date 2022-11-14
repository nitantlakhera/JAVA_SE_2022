package com.DataStructure.String;

import java.util.Stack;

public class removeString {
   public static void main(String args[]) {
	    String s ="aaabccddd";
	    Stack<Character> stack = new Stack<Character>();
	    for(int i =0 ; i< s.length() ; i++) {
	    	if(!stack.isEmpty()&&stack.peek() == s.charAt(i)) {
	    		stack.pop();
	    	}
	    	else {
	    		stack.push(s.charAt(i));
	    	}
	    }
	    Object array[] = stack.toArray();
	    String str="";
	    for(int i =0 ; i<array.length ; i++) {
	    	str = str+array[i];
	    }
	    System.out.print(str);
   }
}
