package com.Algorithm.DsaImplementation.DevideAndConqure;

public class FindMissingNumberFromArithmeticProgression {
   
	public static void main(String args []) {
		int array[] = {2,4,8,10,12,14,16,18};
		System.out.println(findNumber(array, 0 , array.length-1 , 2));
	}
	
	public static int findNumber(int array[], int left , int right, int diff) {
		if(right <= left) {
			return -1;
		}
		int middle = (right + left) / 2;
		if(array[middle+1] - array[middle] != diff) {
			return array[middle] + diff;
		}
		if(middle > 0 && array[middle] - array[middle -1 ] != diff) {
			return array[middle-1] + diff;
		}
		if(array[middle] == array[0] + middle* diff) {
			return findNumber(array, middle + 1, right, diff);
		}
		return findNumber(array, left, middle -1 , diff);
	}
}