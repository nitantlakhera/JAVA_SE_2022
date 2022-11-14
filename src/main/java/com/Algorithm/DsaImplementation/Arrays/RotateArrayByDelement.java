package com.Algorithm.DsaImplementation.Arrays;

public class RotateArrayByDelement {
  public static void main(String args[]) {
	  int array[]= {1,2,3,4,5,6,7};
	  print(rotateArray(array, 2));
  }
  
  public static void reverse(int array[] , int left , int right) {
	  int temp;
	  for(; left < right ; left++, right--) {
		  temp = array[left];
		  array[left] = array[right];
		  array[right] = temp;
	  }
  }
  
  public static int [] rotateArray(int array[], int d) {
	  reverse(array, 0, d-1);
	  reverse(array, d, array.length-1);
	  reverse(array, 0, array.length-1);
     return array;
  }
  
  public static void print(int array[]) {
	  for(int i =0 ; i < array.length ; i++) {
		  System.out.print(" "+array[i]);
	  }
  }
}
