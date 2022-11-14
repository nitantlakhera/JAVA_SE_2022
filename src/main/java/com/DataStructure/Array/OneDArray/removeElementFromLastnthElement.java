package com.DataStructure.Array.OneDArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class removeElementFromLastnthElement {
	public static void main (String args[])
	{
		Integer a[] = new Integer[] { 10, 20, 30, 40,50,60,70,80,90,100 };
		List<Integer> list = Arrays.asList(a);
		
		int i = getElement(list, 5);
		System.out.println(i);
	}
	
	
	private static int getElement(List<Integer> array, int nthElement) {
		int j = 0;
		Iterator<Integer> itr = array.iterator();
		
		while (itr.hasNext()) {
			int i =  itr.next() ;
			j = i - (nthElement);
			System.out.println(array.get(j));
		}
		return array.get(j);
	}
}
