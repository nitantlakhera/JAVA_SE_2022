package com.DataStructure.Array.OneDArray;

import java.util.ArrayList;
import java.util.Collections;


public class cookies {
	

	
public static void main(String args []) {
	int array [] = {13, 47, 74, 12, 89, 74, 18, 38};
	int k =90;
	ArrayList<Integer> list = new ArrayList<Integer>();
	for(int i = 0 ; i<array.length ;i ++) {
		list.add(array[i]);
	}
	int count = 0;
	int swweetness = 0;
	while(swweetness < k) {
		if(list.size()<2) {
			if(swweetness < k) {
				System.out.println(count);
			}
			break;
		}
	    swweetness =  1 * list.get(0) + 2* list.get(1);
		System.out.println(swweetness);
		list.add(swweetness);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		if(list.get(0) > k) {
		  System.out.println(-1);
		}
		list.subList(0, 2).clear();
		System.out.println(list);
		count ++ ;
	}
	System.out.println(count);
	}
}