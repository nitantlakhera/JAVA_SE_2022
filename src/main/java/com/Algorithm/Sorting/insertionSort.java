package com.Algorithm.Sorting;

public class insertionSort {
  public static void main(String args []) {
	  int array[] = {12, 11, 13, 5, 6 , 120 , 11 , 4 , 9, 12, 11, 356, 7 , 8};
	  print(array);
	  System.out.println();
	  sort(array);
    print(array);
  }
  
  public static int [] sort(int array[]) {
	  
	  for(int i = 1 ; i<array.length ; i++) {
		  int key = array[i];
		  int j = i-1 ;
		  while(j>=0 && array[j] > key) {
			    array[j+1] = array[j];
				   j = j-1;
		  }
	      array[j+1] = key;
	  }
	  return array;
  }
  public static void print(int array []) {
	  for(int i =0 ; i<array.length ; i++) {
		  System.out.print(array[i]+" ");
	  }
  }
}
