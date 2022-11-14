package com.Excercises.LogicalCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajoeityElement {
   public static void main(String args[]) {
	   int array[] = {3, 3, 4, 2, 4, 4, 2,2,2,2,2};
	   //MajorityElement(array);
	   isMejorElement(array, VotingAlgorithm(array));
   }
   public static void MajorityElement(int array[]) {
	   Arrays.sort(array);
	   HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	   int count = 0;
	   for(int i = 0 ; i < array.length-1 ; i++) {
		   if(array[i] == array[i+1]) {
			   count++;
			   map.put(array[i], count+1);
		   }else {
		    count = 0;
		   }
	   }
	   for(Map.Entry<Integer, Integer> hmap : map.entrySet()) {
	       if(hmap.getValue() >= ((array.length)/2)+1) {
	    	   System.out.println(hmap.getKey());
	       }
	   }
   }

   public static int VotingAlgorithm(int array[]) {
	   int voter = 0;
	   int vote = 1;
	   for(int i = 1 ; i < array.length-1 ; i ++) {
		   if(vote == 0) {
			   voter = i;
			   vote = 1;
		   }
		   if(array[voter] == array[i] ) {
			   vote++;
		   }
		   else {
			   vote --;
		   }
	   }
	   return array[voter];
   }
   public static void isMejorElement(int array[], int element) {
	   int count = 0;
	   for(int i = 0 ; i < array.length ; i++) {
	    if(array[i] == element) {   
	       count++;
	    }
	   }
	   if(count > (array.length/2)) {
		 System.out.println("Yes " + element);   
	   }else {
		   System.out.println("No");
	   }
   }
}