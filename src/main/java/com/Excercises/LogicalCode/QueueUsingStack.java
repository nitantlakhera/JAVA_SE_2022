package com.Excercises.LogicalCode;

import java.util.Stack;

public class QueueUsingStack {
	static Stack<Integer> stack1 = new Stack<Integer>();
	static Stack<Integer> stack2 = new Stack<Integer>();
	static Stack<Integer> stack = new Stack<Integer>();
	   
	public static void main(String args[]) {
	 enQueue(10);  
	 enQueue(11);  
	 enQueue(12);  
	 enQueue(13);  
	 enQueue(14);
	 deQueue();
	 deQueue();
	 deQueue();
	}
   
	public static void enQueue(int data){
		  stack.add(data);
	}
		 
	public static void deQueue(){
	   if(stack.size()<1){
		  System.out.println("Nothing to deQueue");
		 return;
	   }
	   if(stack.size()==1){
		  System.out.println(stack.pop());
		  return;
		}
		int data = stack.pop();
		deQueue();
		stack.push(data);
		System.out.println(stack);
   }
		 
   public static void queue(int data) {
	   while(!stack1.isEmpty()) {
		   stack2.push(stack1.pop());
	   }
	   stack1.push(data);
	   
	   while(!stack2.isEmpty()) {
		   stack1.push(stack2.pop());
	   }

	   System.out.println(stack2);
   }
   
   public static void singleStackEnqueue(int data) {
	   stack.push(data);
   }
   public static void singleStackDequeue(int data) {
	 
	   
   }
}
