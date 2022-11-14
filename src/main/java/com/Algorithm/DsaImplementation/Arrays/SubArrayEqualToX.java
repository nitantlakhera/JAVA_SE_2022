package com.Algorithm.DsaImplementation.Arrays;

import java.util.HashMap;
import java.util.HashSet;

public class SubArrayEqualToX {

	public static void main(String args []) {
		int array []= {1, 4, 20, 3, 10, 5};
		int x = 33;
		//SubArray(array, x);
		//naive_approach(array, x);
		hash_function(array, x);
		//findSubarray(array, x);
		hash__map_function(array, x);
	}
	
	public static void naive_approach(int array[], int x) { 
		for(int i =0 ; i< array.length ; i++) {
			int sum = 0;
			for(int j = i  ; j < array.length ; j++) {
				sum = sum + array[j];
				if(sum == x) {
				  print_array(array, i , j);
			  }
			}
		}
	}
	
	public static void print_array(int array [], int left, int right) {
		for(int i =left ; i <= right ; i++) {
			System.out.print(" "+array[i]);
		}
	}

	public static void SubArray(int array[], int x) {
	  int left = 0;
	  int sum = array[0];
		for(int right = 1 ; right<= array.length ; right++) {
		  while(sum > x && left < right-1) {
			  sum = sum - array[left];
			  left++;
		  }
		  if(sum == x) {
			  int p = right -1 ;
	          print_array(array, left, p);
		  }
		  if(right < array.length)  {
			  sum = sum + array[right];
		  }
		}
	}
	
	public static boolean hash_function(int array[], int x) {
		HashSet<Integer> hash = new HashSet<Integer>();
		hash.add(0);
		int sum = 0;
		for(int i = 0 ; i <= array.length ; i++) {
			sum = sum + array[i];
			if(hash.contains(sum-x)) {
				System.out.println("yes");
				return true;
			}
		    hash.add(sum);
		}
		return  false;
	}
   
	public static void findSubarray(int[] A, int sum)
	{
		int windowSum = 0;
		int low = 0, high = 0;
		for (low = 0; low < A.length; low++)
		{
			while (windowSum < sum && high < A.length)
			{
				windowSum += A[high];
				high++;
			}
			if (windowSum == sum)
			{
				print_array(A, low, high-1);
				return;
			}
			windowSum = windowSum - A[low];
		}
    }
	
	public static boolean hash__map_function(int array[], int x) {
		HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
		hash.put(0, -1);
		int sum = 0;
		for(int i = 0 ; i <= array.length ; i++) {
			sum = sum + array[i];
			if(hash.containsKey((sum-x))) {
				print_array(array, hash.get(sum-x)+1, i );
				return true;
			}
		    hash.put(sum, i);
		}
		return  false;
	}
}