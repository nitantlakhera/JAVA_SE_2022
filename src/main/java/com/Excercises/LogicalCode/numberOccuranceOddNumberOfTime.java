package com.Excercises.LogicalCode;

import java.util.HashSet;

public class numberOccuranceOddNumberOfTime {
  public static void main(String args []) {
	  int array[] = {1,1,2,2,3,3,3};
      System.out.println(find(array));
  }
  
  public static int findTheNumber(int array[]) {
	  int currentNumber = array[0];
	  int count = 1;
	  for(int i = 1; i < array.length ; i ++) {
		  if(array[i] == currentNumber) {
		    count++;
		  }
		  if(array[i]!=currentNumber) {
			  if(count%2 != 0) {
			     System.out.println(currentNumber);
			  }else {
				  count = 1;
				  currentNumber = array[i];
			  }
		  }
	  }
	  return -1;
  }
  
  public static int find(int array[]) {
	  HashSet< Integer> set = new HashSet<Integer>();
	  for(int i =0 ; i < array.length ; i ++) {
		  if(set.contains(array[i])) {
			  set.remove(array[i]);
		  }
		  else {
			  set.add(array[i]);
		  }
	   }
	   
	  for(int i =0 ; i < array.length ; i ++) {
		   if(set.contains(array[i])) {
			   return array[i];
		   }
	   }
	  return -1;
  }
}