package com.Algorithm.DsaImplementation.DynamicPrograming;

public class GetTheCountOfSubsequencesWhoseSumIsK {
	public static void main (String args []) {
		int array[]= {1,2,1};
		int k = 3;
		int count = getCount(array, 0, 0, k);
		System.out.println(count);
	}
	
	public static int getCount(int array[], int index, int sum,int k) {	
		if (array.length == index) {
			if (sum == k) {
				return 1;		
			} else {
				return 0;
			}
		}
		
		sum = sum + array[index];
		
		int l = getCount(array, index + 1, sum, k);
		
		sum = sum - array[index];
				
		int r = getCount(array, index + 1, sum, k);
		
		return l + r;
	}
}