package com.Excercises.LogicalCode;

import java.util.HashMap;
import java.util.Map.Entry;

public class SecondLargestValueFromArray {
	public static void main(String args[]) {
		int array[] = {100,788,1,2,3,21,33,443,65,6,4, 777};
		int max = 0;
		int secondMax = 0;
		for (int i =0; i < array.length; i++) {
			if (array[i] > max) {
				secondMax = max;
				max = array[i];
			} else if (array[i] > secondMax) {
				secondMax =  array[i];
			}
		}
		//System.out.println(secondMax);
		//secondMax(array);
		HashMap<String , Integer> list = new HashMap<String, Integer>();
		list.put("elaknit", 123);
		list.put("sonu", 100);
		list.put("monu", 121);
		for (Entry<String, Integer> map : list.entrySet()) {
			System.out.println(map.getKey() + " " + map.getValue());
		}
	}
	
	public static void secondMax(int array[]) {
		int max = 0;
		for (int i = 0; i < array.length; i ++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		int min = 0;
		for (int i = 0; i < array.length; i ++) {
			if (array[i] < max) {
			   min = array[i];
			}
		}
		System.out.println(min);
	}
}
