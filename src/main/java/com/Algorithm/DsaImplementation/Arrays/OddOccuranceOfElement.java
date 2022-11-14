package com.Algorithm.DsaImplementation.Arrays;

import java.util.HashMap;
import java.util.HashSet;
public class OddOccuranceOfElement {
  public static void main(String args[]) {
	 int array [] = {3,3,2,2,1,3,1};
	 System.out.println(getElement(array));
	 System.out.println(hash(array));
     System.out.println(hash_map(array));
  }
  
  public static int getElement(int array[]) {
	  for(int i =0 ; i < array.length ; i++) {
		  int count = 0;
		  for(int j = 0 ; j< array.length ; j++) {
			  if(array[i] == array[j]) {
				  count++;
			  }
		  }
		  if(count % 2 != 0) {
			  return array[i];
		  }
	  }
	  return -1;
  }
  
  public static int hash(int array[]) {
	  HashSet<Integer> set = new HashSet<Integer>();
	  for(int i =0 ; i< array.length ; i++) {
		  if(set.contains(array[i])) {
			  set.remove(array[i]);
		  }else {
			  set.add(array[i]);
		  }
	  }
	  for(int i = 0 ; i< array.length ; i++) {
		  if(set.contains(array[i])) {
			  return array[i];
		  }
	  }
	  return -1;
  }
  
  public static int hash_map(int array[]) {
	  HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	  for(int i =0 ; i< array.length ; i++) {
		  Integer count = map.get(array[i]);
		  if (count == null) {
			  map.put(array[i], 1);
		  }else {
			  map.put(array[i], count + 1);
		  }
	  }
	  for(Integer i : map.keySet()) {
		  if(map.get(i)%2 != 0) {
			  return i;
		  }
	  }
	  return -1;
   }
}