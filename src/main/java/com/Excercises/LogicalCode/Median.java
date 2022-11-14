package com.Excercises.LogicalCode;

import java.util.ArrayList;
import java.util.Collections;

public class Median {
	public static void main(String args []) 
	{
		int array[] = {1,2,3,4,5,6};
		int median = getMedian(getList(array, 5, 5));
		System.out.println(median);
	}
	
	public static int getMedian (ArrayList<Integer> list) {
		System.out.println(list);
		System.out.println(list.size());
		int middle = 0;
		if (list.size() % 2 == 0) {
			middle = list.size() / 2 - 1;
		} else {
			middle =  list.size() / 2;
		}
		return list.get(middle);
	}
	
	public static ArrayList<Integer> getList (int arr[], int L, int R) 
	{
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = L -1 ; i < R; i ++) {
			list.add(arr[i]);
		}
		Collections.sort(list);
		return list;
	}
}
