package com.Algorithm.DsaImplementation.DynamicPrograming;

import java.util.ArrayList;

public class PrintAllSubsequencesFromArray {
	public static void main (String args[]) {
		int array[] = {1,2,3};
		ArrayList<Integer> list = new ArrayList<>();
		printSubsequences(array, 0, list);
	}
	
	public static void printSubsequences(int arr[],  int index, ArrayList<Integer> list) {
		if (index == arr.length) {
			System.out.println(list);
			return;
		}
		 list.add(arr[index]);
		 printSubsequences(arr, index + 1, list);
         list.remove(list.size() - 1);
	     printSubsequences(arr, index + 1, list);   
	}
}
