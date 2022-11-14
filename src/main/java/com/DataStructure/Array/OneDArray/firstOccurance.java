package com.DataStructure.Array.OneDArray;

import java.util.HashMap;

public class firstOccurance {
 public static void main(String args[]) {
   int array [] = {3,2,4,5,6,2,5,4,3};
   calculate(array);
 }
 
 public static void calculate(int array[]) {
  HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
  for(int i =0 ; i<array.length ; i++) {
	  Integer count = map.get(array[i]);
	  if(count ==  null) {
		  count = 1;
	  }else {
		  count = count + 1;
	  }
	  map.put(array[i], count);
    }
  
  for(int i = 0 ; i<array.length ; i++) {
	   for(int j =0  ; j< map.get(array[i]) ; j++) {
		   System.out.println(array[i]);
	   }
	   map.remove(array[i]);
	   if(map.isEmpty()) {
		   break;
	   }
    }
 }
}