package com.DataStructure.Array.OneDArray;

import java.util.Arrays;
import java.util.HashSet;

public class PairOfSum {
    static int Hash[];
	public static void main(String args []) {
	  Hash = new int[10];  
	  int array []= {1,4,3,3,5,2,6};
	  pairOfSumWithorderOfN(array , 9);
	  System.out.println();
  }
	
  //time complexity o(n^2)
  public static void pairOfSum(int array [] , int sum ) {
	  for(int i =0 ; i< array.length ; i++) {
		  for(int j = i+1 ; j < array.length ; j++) {
			  if(array[i] + array [j] == sum ) {
				  System.out.print("( "+ array [i]+ " , " + array[j] + " ) "  );
			  }
		  }
	  }
  }
  
  // Using hashing , we can search with time complexity o(n).
  public static void pairOfSumWithorderOfN(int array [] , int sum) {
	  int temp =0 ;
	  for(int i =0 ; i<array.length ; i++ ) {
	      temp = sum -array[i];
	      if(temp>=0 && Hash[temp] == 1) {
	    	  System.out.print(sum + " ( " + array[i] + " " + temp + " ) " + " " );
	      }else {
	    	  Hash[array[i]] = 1;
	      }
	  }  
  }
  
  //using hashSet collection.
  public static void withCollection(int array [] , int sum) {
	  int temp;
	  HashSet<Integer> hash = new HashSet<Integer>(); 
	  for(int i =0 ; i< array.length ; i++) {
		  temp = sum - array[i];
		  if(temp >=0 && hash.contains(temp)) {
			  System.out.print(sum + "[ "+ array[i] + " "+ temp + " ] " + "  ");
		  }
		  hash.add(array[i]);
	  }
  }
  
  public static void usingSort(int array [] , int sum ) {
   int left =0 , right = array.length -1;
   Arrays.sort(array);
   while(left<right) {
	    if(array[left] + array[right] == sum ) {   
	    	System.out.print(sum+" [ " + array[left] + " " + array[right] +" ]" + " ");
	    }
	    if(array[left] + array[right] < sum ) {
	    	left++;
	    }else {
	    	right--;
	    }
   }
  }
}