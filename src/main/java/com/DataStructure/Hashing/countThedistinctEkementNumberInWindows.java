package com.DataStructure.Hashing;

import java.util.HashSet;

public class countThedistinctEkementNumberInWindows {
   public static void main(String args []) {
	   int array[]= {10, 10, 20 , 30, 30 ,40 , 10};
       countTheNumber(array , 2);
   }
   
   public static void countTheNumber(int array[] , int k) {
	   HashSet<Integer> hashSet = new HashSet<Integer>();
	   int count =0;
	   for(int i =0; i<array.length ; i++) {
		   
		   for(int j =0 ; j< k; j++) {
			   if(hashSet.contains(array[i])) {
		    		  count --;
		       }
			   count ++;
		   }
    	  hashSet.add(count);
    	}
        System.out.println("hash is " + hashSet) ;
   }
}
