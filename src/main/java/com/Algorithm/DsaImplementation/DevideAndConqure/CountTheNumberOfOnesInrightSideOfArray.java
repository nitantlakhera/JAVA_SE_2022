package com.Algorithm.DsaImplementation.DevideAndConqure;

public class CountTheNumberOfOnesInrightSideOfArray {

	public static void main(String args[]) {
		int array[] = {0,0,0,0,0,0,0,0,1,1,1,1,1,1,1};
		int index  = find(array, 0 , array.length-1);
		int count =  (array.length-1) - index;
		System.out.println(count);
	}
	
	public static int find(int array[], int left , int right) {
		if(right >= left ) 
		{
		  int middle = (right + left)/2;
		  if(array[middle] == 0 || array[middle-1] == 0 && array[middle] ==1) {
			  return middle;
		  }
		  if(array[middle] == 0) {
			  return find(array, middle+1, right);
		  }else {
			  return find(array, left, middle-1);
		  }
		}
		return -1;
	}
}
