package com.DataStructure.Hashing;

import java.util.HashSet;

public class checkTwoSetAreDisjointOrNot {
   
	public static void main(String args []) {
     int array1[] = {0,2,3,4,5,6,7};
     int array2[] = {12,13,14,15,16,17};
     if(checkWhetherElementIsPresentOrNot(array1 , array2)) {
    	 System.out.println("not disjoint ");
     }else {
    	 System.out.println("Disjoint");
     }
   }

   public static boolean checkWhetherElementIsPresentOrNot( int array1[] , int array2 [] ) {
	   HashSet<Integer> hash = new HashSet<Integer>();
	   
	   for(int i =0 ; i<array1.length ; i++) {
		   hash.add(array1[i]);
	   }
	   
	   for(int i =0 ; i<array2.length ; i++) {
		   if(hash.contains(array2[i])) {
			   return true;
		   }
	   }
	   return false;   
   }
}