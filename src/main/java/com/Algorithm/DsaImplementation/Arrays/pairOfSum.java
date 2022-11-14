package com.Algorithm.DsaImplementation.Arrays;
import java.util.HashSet;

public class pairOfSum {
  public static void main(String args []) {
	  int array[] = {1,2,3,4,5,6,7,8,9,10};
	  search(array, 6);
	  System.out.println();
	  search_hash_table(array, 6);
  }
  private static void search(int array[], int sum) {
	  for(int i = 0 ; i < array.length ; i++){
	      for(int j = 1 ; j < array.length ; j ++) {
	    	  if(array[i] + array[j] == sum) {
	    		  System.out.print(array[i] + " " + array[j] +" ");
	    	  }
	      }
	  }
  }
  
  private static void search_hash_table(int array[] , int sum) {
	int temp;
	HashSet<Integer> set = new HashSet<Integer>();
	for(int i = 0 ; i < array.length ; i++) {
		temp =  sum - array[i];
		if(temp >= 0 && set.contains(temp)) {
		  System.out.print(sum + "[ "+ array[i] + " "+ temp + " ] " + "  ");
		}
		set.add(array[i]);
	}
  }
}