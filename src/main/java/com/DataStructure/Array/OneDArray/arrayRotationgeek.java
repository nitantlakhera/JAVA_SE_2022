package com.DataStructure.Array.OneDArray;

public class arrayRotationgeek {
  public static void main(String args[]) {
	  int array[] = {1,2,3,4,5};
	  int rotate = 4;
	  StringBuilder s = new StringBuilder();
	  for(int i =rotate ; i < array.length ; i++) {
		    s.append(array[i]);
	  }
	  for(int i=0 ; i < rotate ; i++) {
		    s.append(array[i]);
	  }
	  System.out.println(s);
  }
}
