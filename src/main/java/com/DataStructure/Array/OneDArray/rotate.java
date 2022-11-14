package com.DataStructure.Array.OneDArray;

import java.util.ArrayList;

public class rotate {
   public static void main(String []ars) {
	   int array [] = {1,2,3,4,5};
	   int d = 4;
	   ArrayList<Integer> list1 = new ArrayList<Integer>();
	   ArrayList<Integer> list2 = new ArrayList<Integer>();
	   for(int i = d;i<array.length; i++) {
		   list1.add(array[i]);
	   }
	   for(int i =0 ; i<d ; i++) {
		   list2.add(array[i]);
	   }
	   list1.addAll(list2);
	   System.out.println(list1);
   }
}
