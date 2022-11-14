package com.Excercises.LogicalCode;

public class DuplicateElement {
  public static void main(String args[]) {
	  int array[] =  {4,3,1,2,2,3,4,5};
      duplicateElement(array);
   }
  
  public static void duplicateElement(int array[]) {
	  for(int i = 0 ; i < array.length ; i ++) {
		  if(array[Math.abs(array[i])] >= 0) {
			  array[Math.abs(array[i])] = -array[Math.abs(array[i])];
		  }
		  else {
			  System.out.println("already present " + Math.abs(array[i]));
		  }
	  }
  }
}
