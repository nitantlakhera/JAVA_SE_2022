package com.Excercises.LogicalCode;

public class Separate0sAnd1s {
  public static void main(String args []) {
	  int array[] =  {0,1,1,1,0,1,0,1,0,1,0,1,0,1};
	  separete(array);
	  System.out.println();
	  whileLoop(array);
  }

  public static void separete(int array[]) {
       int count = 0;
       for(int i =0 ; i < array.length ; i ++) {
    	   if(array[i] == 0) {
    		   count ++;
    	   }
       }
       for(int i = 0; i < array.length ; i++) {
    	   if(i < count) {
    		   array[i] = 0;
    	   }
    	   else {
    		   array[i] = 1;
    	   }
       }
       print(array , "using count method");
  }

  public static void print(int array[], String message) {
	  System.out.println(message);
	  for(int i =0 ; i < array.length ; i++) {
		  System.out.print(array[i]+ " ");
	  }
  }
  
  public static void whileLoop(int array[]) {
	  int i  = 0 , j = array.length-1;
	  while(i < j) {
		  if(array[i] != 0 && array[j]!= 1 ) {
			  int temp = array[i];
			  array[i] = array[j];
			  array[j] = temp;
		  }
		  if(array[i]==0) {
			  i ++;
		  }
		  if(array[j] == 1) {
			  j --;
		  }
	  }
	    print(array, "using devide and conqure method");
    }
}