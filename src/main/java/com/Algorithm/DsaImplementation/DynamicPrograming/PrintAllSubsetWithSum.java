package com.Algorithm.DsaImplementation.DynamicPrograming;

import java.util.ArrayList;

public class PrintAllSubsetWithSum {
	static ArrayList<Integer> list = new ArrayList<>();
	public static void main (String args []) 
	{
		int array[] = {3,1,2};
		sum(array, 0, 0, list);
		System.out.println(list);
	}	
	public static void  sum(int array[], int index, int sum, ArrayList<Integer> list) {
		if (index == array.length) {
			list.add(sum);
			return;
		}
		
		// Pick element
		sum(array, index + 1, sum + array[index], list);
		
		// Not element
		sum(array, index + 1, sum, list);
	}
}
