package com.Excercises.LogicalCode;

public class StackInplementation {
	static int Stack [] = new int [5];
    static int top = -1;
	public static void main(String args[]) {
	   push(1 );
	   push(2 );
	   push(3);
	   push(5);
	   push(6);
	   push(7);
	   pop();
	   pop();
	   pop();
	   pop();
	   pop();
	   pop();
   }

   public static int[] push(int data) {
	   if(top == Stack.length -1 ) {
		   System.out.println("OverFlow");
	   } else {
		 Stack[++top] = data;  
	   }
	   return Stack;
   }

   public static void pop() {
	   if(top == -1) {
		   System.out.println("UnderFolow");
       } else {
    	   System.out.println("popped element " + Stack[top]);
    	   top--;
       }
   }
}
