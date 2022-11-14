package com.Algorithm.DsaImplementation.Arrays;

import java.util.ArrayList;

public class EqulibriumIndexInArray {

	public static void main(String args []) {
		int array[] = { -7, 1, 5, 2, -4, 3, 0 }; 
	    System.out.println(EquilibriumIndex(array));
	}
	
	public static int index(int array []) {
		for(int i =0 ; i< array.length ; i++) {		
    	   int sum_a=0;
    	   int sum = 0;
           
    	   for(int k =0 ; k < i ; k++) {
    		   sum = sum + array[k];
    	   }
    	   
    	   for(int j = i + 1 ; j < array.length ; j++) {
    		   sum_a = sum_a + array[j];
    	   }
    	   
    	   if(sum ==  sum_a) {
				return i;
		   }
       }
	   return -1;
	}
	
	public static int returnIndex(int array[]) {
		ArrayList<Integer> leftSum =new  ArrayList<Integer>();
		ArrayList<Integer> rightSum =new  ArrayList<Integer>();
		int l_sum = 0;
		int r_sum = 0;
		for(int i =0 ; i < array.length ; i++) {
			l_sum =  l_sum + array[i];
			leftSum.add(l_sum);
		}
		for(int i = array.length-1 ; i >= 0 ; i--) {
			r_sum =  r_sum + array[i];
			rightSum.add(r_sum);
		}
		for(int i = 0 ; i< leftSum.size() ; i++) {
			if(leftSum.get(i) == rightSum.get(i+1)) {
				return i;
			}
		}
		return -1;
   	 }
	
	public static int EquilibriumIndex(int arr[])
	{
	  int size = arr.length;
	  int index, leftSum = 0, sum = 0;
	  for(index = 0 ; index < size; index++) {
		   sum = sum + arr[index];
		   
	  }
	  System.out.println("whole Sum " + sum);
	  for(index = 0; index < size; index++)
	     {
	       sum = sum - arr[index];
	       System.out.println("Right Sum " + sum);
	       if( leftSum == sum)
	         return index;
	       leftSum += arr[index];
	     }
	    return -1;
       }
	}