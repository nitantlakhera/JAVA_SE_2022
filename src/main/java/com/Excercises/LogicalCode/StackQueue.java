package com.Excercises.LogicalCode;

import java.util.Stack;

public class StackQueue {
	static Stack<Integer> s1 = new Stack<Integer>();
	static Stack<Integer> s2 = new Stack<Integer>();
	public static void main(String args []) {
		push(1);
		push(2);
		push(3);
		push(4);
	}
	
	public static void push (int data) {
		 while(!s1.isEmpty()) {
			 s2.add(s1.pop());
		 }

		 s1.add(data);

		 while (!s2.isEmpty()) {
			 s1.add(s2.pop());
		 }
	}
}
