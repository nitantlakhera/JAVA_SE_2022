package com.Algorithm.DsaImplementation.DynamicPrograming;

import java.util.ArrayList;

public class PrintSubsequencesWhereSumIsEqualToK {
	public static void main (String args[]) {
		int array[] = {1,2,1};
		ArrayList<Integer> list = new ArrayList<>();
		int sum = 2;
		print(array, 0,list, sum, 0);
	}
	
	public static void print(int arr[],  int index, ArrayList<Integer> list, int sum, int s) {
		if (index == arr.length) {
			if (s == sum) {
				System.out.println(list);
			}	
			return;
		}
		
		list.add(arr[index]);
		//System.out.println("Nitant List " + list);
		s = s + arr[index];
		//System.out.println("Sum added " + s + " index " + index);
		print(arr, index + 1, list, sum,s);
		s = s - arr[index];
        list.remove(list.size() - 1);
	    print(arr, index + 1, list, sum,s);   
	}
}
