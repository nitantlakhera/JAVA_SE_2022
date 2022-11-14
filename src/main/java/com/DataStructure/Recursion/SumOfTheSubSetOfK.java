package com.DataStructure.Recursion;

public class SumOfTheSubSetOfK {
	public static void main (String args []) {
		int array[] = {1,10,5,2,3,6,7};
		//System.out.println(sumOfSubSet(array, 3, array.length,0, 0));
	    sumOfSetNitant(array, 0, 0, 8, 0, "");
	    System.out.println();
	    System.out.println(geekSum(array, array.length, 8));
	}
	
	public static int geekSum (int array[], int n , int sum) {
		if (n == 0) {
			return (sum == 0) ? 1 : 0;
		}
		return geekSum(array, n -1, sum) + geekSum(array, n -1 , sum - array[n -1]);
	}
	static int subsetSum(int arr[], int n, int sum, int s,
            int count)
	{
		if (n == 0) {
			if (sum == s) {
				count++;
		}
		return count;
		}
		count = subsetSum(arr, n - 1, sum, s, count);
		count = subsetSum(arr, n - 1, sum, s + arr[n - 1],count);
		return count;
	}
	
	public static void sumOfSetNitant(int array[], int sum , int index, int k, int count , String set) {
		if (array.length == index) {
			if (sum == k) {
				System.out.println("{" +set.substring(0, set.length() - 1) + "}");
			}
			return;
		}
		sumOfSetNitant(array, sum, index + 1, k, count, set);
		sumOfSetNitant(array, sum + array[index], index + 1, k, count, set + array[index] + ",");
	}
	public static int sumOfSubSet(int array[], int sum, int n , int s, int count) {
		if (n == 0 ) {
			if (sum == s) {
				count ++;
			}
			return count;
		}
		count = sumOfSubSet(array, sum, n - 1, s, count);
		count = sumOfSubSet(array, sum, n - 1, s + array[n -1], count);
		return count;
	}

}
