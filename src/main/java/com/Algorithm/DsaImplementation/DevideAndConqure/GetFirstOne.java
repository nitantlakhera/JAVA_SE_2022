package com.Algorithm.DsaImplementation.DevideAndConqure;

public class GetFirstOne {
  public static void main(String args[]) {
	  int array []= {0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1};
	  System.out.println(find(array, 0, array.length-1));
  }
  
  public static int find(int array[] , int start , int end) {
	if(end >= start) {
		int middle =( start + end)/2;
		if(array[middle] == 1 || array[middle-1] == 0 && array[middle]==1) {
			return middle;
		}
		return (array[middle] == 0)? find(array, middle+1, end):
			find(array, start, middle-1);
	 }
	return -1;
  }
}

