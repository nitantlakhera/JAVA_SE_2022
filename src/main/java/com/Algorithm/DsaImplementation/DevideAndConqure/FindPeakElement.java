package com.Algorithm.DsaImplementation.DevideAndConqure;

public class FindPeakElement {
    public static void main(String args []) {
    	int array[] = {1,2,3,4,5,6,7,6,5,4,3,2};
    	System.out.println(find(array, 0, array.length-1));
    }
	public static int find(int array[], int left, int right) {
		int middle = (left + right)/2;
		if(middle == 0 || array[middle-1] <= array[middle] && middle == array.length-1 || array[middle+1] <= array[middle]) {
			return middle;
		}
		return (middle > 0 && array[middle-1] > array[middle]? find(array, left, middle) : find(array,middle+1, right) );
	}
}
