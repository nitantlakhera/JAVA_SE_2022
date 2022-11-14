package com.Algorithm.DsaImplementation.DynamicPrograming;

import java.util.ArrayList;
import java.util.List;

public class PrintSubSubsequencesWhoseSumTarget {
	public static void main (String args []) {
		int array[] = {2,3,6,7};
		int target = 7;
		List<ArrayList<Integer>> list = new ArrayList<>();
		print(array, 0, target, list, new ArrayList<Integer>());
		System.out.println(list);
	}
	
	public static void print(int array[], int index,int target, List<ArrayList<Integer>> list, ArrayList<Integer> ds) {
		if (index == array.length) {
			if (target == 0) {
				list.add(new ArrayList<>(ds));
				return;
			}
		}
		
		if (array[index] <= target ) {
			ds.add(array[index]);
			print(array, index, target - array[index], list, ds);
			ds.remove(ds.size() - 1);
		}
		print(array, index + 1, target, list, ds);		
	}
}
