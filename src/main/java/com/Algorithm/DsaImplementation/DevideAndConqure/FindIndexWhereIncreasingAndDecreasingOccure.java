package com.Algorithm.DsaImplementation.DevideAndConqure;

public class FindIndexWhereIncreasingAndDecreasingOccure {
    public static void main(String args[]) {
    	int array[] = {5,20,12,11,10,9,2};
    	System.out.println(find(array, 0, array.length-1));
    }
	
	public static int find(int array[], int left , int right) {
		
		if(left == right) {
			return left;
		}
		if((right == left+1) && array[left] >= array[right]) {
		  return left;
		}
		if((right == left + 1) && array[left] < array[right]) {
		 return right;
		}
		int mid = (left + right)/2;
		if(mid == 0 && mid == array.length-1) {
				return -1;
		}
		if(array[mid] > array[mid-1] && array[mid] > array[mid+1] ) {
				return mid;
		}
		if(array[mid] > array[mid-1] && array[mid] < array[mid+1]) {
				return find(array, mid+1, right);
		}
		if(array[mid] < array[mid-1] && array[mid] > array[mid+1]) {
				return find(array, left, mid-1);
		}
		return -1;
	}
}

