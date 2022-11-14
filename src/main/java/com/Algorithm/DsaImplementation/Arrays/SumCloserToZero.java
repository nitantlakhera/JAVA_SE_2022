package com.Algorithm.DsaImplementation.Arrays;

import java.util.Arrays;

public class SumCloserToZero {

	public static void main(String args []) {
		int arr[] = {1, 60, -10, 70, -80, 85}; 
        closerToZero(arr);
	}
	public static void closerToZero(int arr[]) {
		  int sum, min_sum = 999999; 
	      int l = 0, r = arr.length-1; 
	      int min_l = l, min_r = arr.length-1; 
	      Arrays.sort(arr);
	      while(l < r) 
	      { 
	        sum = arr[l] + arr[r]; 
	        if(Math.abs(sum) < Math.abs(min_sum)) 
	        { 
	          min_sum = sum; 
	          min_l = l; 
	          min_r = r; 
	        } 
	        if(sum < 0) 
	          l++; 
	        else
	          r--; 
	      } 
	      System.out.println(min_l +" - " + min_r);
	}
}
