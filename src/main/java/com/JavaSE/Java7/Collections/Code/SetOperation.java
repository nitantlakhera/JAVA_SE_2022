package com.JavaSE.Java7.Collections.Code;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetOperation {
	public static void main(String args []) {
	  Set<Integer > hash_set1 = new HashSet<Integer> ();
	  hash_set1.addAll(Arrays.asList(new Integer[] {1,2,3,3,4,2,3,2,36,78,8,10}));
	  System.out.println(hash_set1);
	  
	  Set<Integer > hash_set2 = new HashSet<Integer> ();
	  hash_set2.addAll(Arrays.asList(new Integer[] {12,21,3,33,4,2,3,22,6,78,8,10 , 11 , 21 ,20}));
	  System.out.println(hash_set2);
	  
	  System.out.println("union");
	  Set<Integer> union = new HashSet<Integer>(hash_set1);
	  union.addAll(hash_set2);
	  System.out.println(union);
	  System.out.println("intersection");
	  Set<Integer> intersection = new HashSet<Integer>(hash_set1);
	  intersection.retainAll(hash_set2);
	  System.out.println(intersection);
	  System.out.println("Difference");
	  Set<Integer> difference = new HashSet<Integer>(hash_set1);
	  difference.removeAll(hash_set2);
	  System.out.println(difference);
	  
	}
}
