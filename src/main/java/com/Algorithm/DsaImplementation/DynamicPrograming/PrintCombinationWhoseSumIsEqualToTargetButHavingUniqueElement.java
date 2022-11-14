package com.Algorithm.DsaImplementation.DynamicPrograming;

import java.util.ArrayList;
import java.util.List;

public class PrintCombinationWhoseSumIsEqualToTargetButHavingUniqueElement {
	public static void main (String args []) {
		
	}
	
	// instead of list use set for unique element
	public static void getCombination(int array[], int index, List<List<Integer>> comb, List<Integer> ds, int target ) 
	{
		if (index == array.length) {
			if (target == 0) {
				comb.add(new ArrayList<>(ds));
			}
			return;
		}
		
		if (array[index] <= target) {
			ds.add(array[index]);
			getCombination(array, index + 1, comb, ds, target - array[index]);
			ds.remove(ds.size() - 1);
		}
		getCombination(array, index + 1, comb, ds, target);
	}

}
