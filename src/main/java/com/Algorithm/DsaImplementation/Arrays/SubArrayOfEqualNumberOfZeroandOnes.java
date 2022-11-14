package com.Algorithm.DsaImplementation.Arrays;

import java.util.ArrayList;
import java.util.HashMap;

public class SubArrayOfEqualNumberOfZeroandOnes {
  public static void main(String args []) {
	  int array[] = {1,1,1,0,1,0,0,0,1,1,1,0};
	  //find(array);
	  //System.out.println();
	  //find(array);
	  System.out.println();
	  Hashing(array);
  }
  
  public static void find(int array[]) {
	  int maxSize = -1;
	  int endIndex = 0;
	  int startIndex = 0;
	  ArrayList<Integer> list = new ArrayList<Integer>();
	  for(int i =0 ; i< array.length; i++) {
		  list.add(array[i]);
	  }
	  
	  for(int i = 0 ; i < array.length ; i++) {
		  int sum = 0;
		  if(array[i] == 0) {
			  sum = -1;
		  }
		  if(array[i]==1) {
			  sum = 1;
		  }
		  for(int j = i + 1 ; j < array.length - 1 ; j++) {
			  if(array[j] == 0) {
				  sum = sum - 1;
			  }
			  if(array[j] == 1) {
				  sum = sum +1;
			  }
			  if(sum == 0 && (j-i +1)> maxSize) {
				  maxSize = j - i + 1;
				  startIndex = i;
			  }
		  }
	  }
	endIndex  = maxSize + startIndex - 1;
	print(list, startIndex, endIndex);
  }
  
  public static void Hashing(int A[]) {
        	ArrayList<Integer> list = new ArrayList<Integer>();
	        for(int i =0 ; i < A.length ; i++) {
	        	list.add(A[i]);
	        }        
	        HashMap<Integer, Integer> map = new HashMap<>();
			map.put(0, -1);
			int len = 0;
			int ending_index = -1;
			int sum = 0;
			for (int i = 0; i < A.length; i++)
			{
				sum = sum + ((A[i] == 0)? -1: 1);
				if (map.containsKey(sum))
				{
					System.out.println((len < i - map.get(sum)) +" index " + i + " conditin " + (i - map.get(sum)) + " sum " + sum + " check i " + map.get(sum));
					if (len < i - map.get(sum))
					{
						len = i - map.get(sum);
						System.out.println("length " + len);
						ending_index = i;
					}
				}
				else {
					map.put(sum, i);
				    System.out.println(sum + " " + i + "  " + A[i]);
				}
			}
			if (ending_index != -1) {
			print(list, ending_index-len+1, ending_index);
			}
			else {
				System.out.println("No sub-array exists");
			}  
     }
  
  public static void print(ArrayList<Integer> list, int start , int end) {
	  for(int i = start ; i <= end ; i++) {
		  System.out.print(" "+list.get(i));
	  }
  }
}