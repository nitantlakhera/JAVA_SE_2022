package com.Algorithm.DsaImplementation.Arrays;

public class StartIndexOfOneUnknownSizedArray {
  public static void main(String args []) {
	  int arr[] = { 0, 0,0,0,0,0,0,0,0,0,0, 1, 1, 1, 1 };
	  StartIndex(arr);
  }
  
  public static int StartIndex(int array[]) {
	  int l = 0, h = 1; 
      
      while (array[h] == 0) { 
          l = h; 
          h = 2 * h; 
      }
      System.out.println(l +" "+ h);
      return -1;
  }
}
