package com.DataStructure.Array.OneDArray;

import java.util.HashMap;

public class OddNumberoccurence {
   public static void main(String args[]) {
	   int array[] = {1, 2, 3, 2, 3, 1, 3};
	   System.out.println(occurence(array));
	   System.out.println();
	   System.out.println(hashing(array));
       System.out.println();
       System.out.println(xor(array));
   }
   public static int  occurence(int array[]) {
	   for (int i = 0; i < array.length; i++) { 
           int count = 0; 
           for (int j = 0; j < array.length; j++) { 
               if (array[i] == array[j]) 
                   count++; 
           } 
           if (count % 2 != 0) 
               return array[i]; 
       } 
       return -1; 
   }   
   public static int hashing(int array[]) {
	   HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
	   for(int i =0 ; i<array.length ; i++) {
		   if(hash.containsKey(array[i])) {
			   int val = hash.get(array[i]);
			   hash.put(array[i], val+1);
		   }
		   else {
			   hash.put(array[i], 1);
		   }
	   }
	   for(Integer a : hash.keySet()) {
		   if(hash.get(a)%2!=0) {
			   return a;
		   }
	   }
	   return -1;
   }
   public static int xor(int array[]) {
	   int result =0;
	   for(int i =0; i<array.length ; i++) {
		   result = result^array[i];
	   }
	   return result;
   }
}
