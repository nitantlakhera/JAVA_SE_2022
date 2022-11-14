package DSA.Stack;

import java.util.Stack;

public class getMinimumElementAtOrderOf1Time {
	static Stack<Integer> stack = new Stack<>();
	static Stack<Integer> min = new Stack<>();
	
	public static void main (String args []) 
	{
		getMinimumElementAtOrderOf1Time test = new getMinimumElementAtOrderOf1Time();
		test.push(7);
		test.push(1);
		test.push(10);
		test.push(2);
		test.push(4);
		test.push(3);
		test.push(5);
		System.out.println(stack);
		System.out.println(min);
		System.out.println();
		System.out.println(test.getMin());
	    test.pop();
	    test.pop();
	    test.pop();
	    test.pop();
	    System.out.println(test.getMin());
	}
	
	public void push(int value) 
	{
		stack.push(value);
	    if (min.empty()) 
	    {
	    	min.push(value);	
	    } else if (value < min.peek()) 
	    {
	    	min.push(value);
	    }
	}
	
	public void pop() 
	{
		if (stack.isEmpty())
		{
			System.out.println("Stack is Empty");
		}
		int popped = stack.pop();
		if (popped == min.peek()) 
		{
			System.out.println("Deleted from min stack " + min.pop());
		}
		System.out.println("Deleted from main stack " + popped);
	}
	
	public int getMin() 
	{
		return min.peek();
	}
}
