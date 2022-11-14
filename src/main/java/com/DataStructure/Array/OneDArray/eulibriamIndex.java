package com.DataStructure.Array.OneDArray;

public class eulibriamIndex {
	public static void main(String args []) {
	  int array [] = {10 , 5,15,3,4 , 21 , 2 };
	  System.out.println(equlibrium(array, array.length-1));	  
  }
  
  public static int  equlibrium(int arr [] , int size) {
	int index, leftSum = 0, sum = 0;
	for(index = 0 ; index < size; index++) {
		sum += arr[index];
	}
	for(index = 0; index < size; index++)
	{
		sum -= arr[index];
		if( leftSum == sum) {
			return index;
		}
	leftSum += arr[index];
	}
	return -1;
  }
}
