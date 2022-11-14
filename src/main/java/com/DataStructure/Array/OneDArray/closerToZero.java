package com.DataStructure.Array.OneDArray;

import java.util.Arrays;

public class closerToZero {
    static int m_lindex;
    static int m_Rindex;
	public static void main(String args []) {
	   int array [] = {1, 60, -10, 70, -80, 85};
		search(array);
   }
   
   public static void search(int array[]) {
	   Arrays.sort(array);
	   int closest_sum = 999999 , current_sum =0 ;
	   int  left_index =0 , right_index = array.length-1;
	   while(left_index < right_index) {
		  if(Math.abs(current_sum) < Math.abs(closest_sum)) { 
			  closest_sum = current_sum;
			  m_lindex = left_index;
			  m_Rindex = right_index;
		  }
		  if(current_sum < 0) {
			  left_index ++;
		  }
		  else {
			  right_index--;
		  }
	   }
	   System.out.println(array[m_lindex]+" " + array[m_Rindex]);
   }
} 