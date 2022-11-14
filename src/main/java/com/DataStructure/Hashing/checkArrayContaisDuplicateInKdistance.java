package com.DataStructure.Hashing;

import java.util.HashSet;

public class checkArrayContaisDuplicateInKdistance {
public static void main(String args []) {
	int array [] = {10, 5, 3, 4, 3, 5, 6};
	if(checkIdduplicatePresent(array , 2)) {
	   System.out.println("present");
	}else {
		System.out.println("not present");
	}
	
}
public static boolean checkIdduplicatePresent(int array [] , int k) {
	HashSet<Integer > hash = new HashSet<Integer>();
	for(int i =0 ; i<array.length ; i++) {
		if(hash.contains(array[i])) {
			return true;
		}else {
			hash.add(array[i]);
		}			
		if(i>=k) {
			hash.remove(array[i-k]);
		}
	}
	return false;
}
}
