package com.Excercises.LogicalCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeList1InOddAndList2InEvenPosition {
	public static void main(String args[]) {
		List<Integer> x = new ArrayList<>(Arrays.asList(10,11,12,13,14,15));
		List<Integer> y = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
		System.out.println(getFinalList(x, y));
	}
	
	public static ArrayList<Integer> getFinalList(List<Integer> list1, List<Integer> list2) {
		ArrayList<Integer> list = new ArrayList<>();
		int a = 0;
		int b = 0;
		for (int i = 0 ; i < list1.size() + list2.size() ; i ++) {
			if (i % 2 == 0) {
				list.add(list2.get(a++));
			}
			if (i % 2 != 0) {
				list.add(list1.get(b++));			
			}
		}
		return list;
	}
}
