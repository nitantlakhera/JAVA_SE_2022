package com.DataStructure.StackQueue;

public class mainMethd {
public static void main(String args []) {
	StackImplementation stack = new StackImplementation();
	stack.push(1);
	stack.push(2);
	stack.push(3);
	stack.push(24333);
	stack.push(12);
	stack.printStackData();
	System.out.println();
    System.out.println("popped element -> "+stack.pop());
    System.out.println("popped element -> "+stack.pop());
    }
}
