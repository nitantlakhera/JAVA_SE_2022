package com.DataStructure.StackQueue;

public class StackImplementation {
	int stack[] = new int [5];
    int top =-1 ;
	public void push(int data) {
      	if(top==stack.length-1) {
      		System.out.println("Stack is overflow, Can not add more element");}
      	else{stack[++top] = data;}
    }
    public int  pop() {
    	int item = 0;
    	if(top ==-1 ) {
    		System.out.println("Stack is Underflow nothing to pop");
    	}else {
    	   item = stack[top--];
    	}
		return item;
    }
    public void printStackData() {
      for(int i =0 ; i<=top; i++) {
    	  System.out.println(stack[i]);
      }
    }
}
