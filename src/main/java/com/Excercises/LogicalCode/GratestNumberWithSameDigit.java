package com.Excercises.LogicalCode;

import java.util.Arrays;


public class GratestNumberWithSameDigit {
  public static void main(String args[]) {
	  int array[] =  {2,1,8,7,6,5};
	  findTheGratestNumber(array);
  }
  
  public static int [] findTheGratestNumber(int array[]) {
	     int  i  =0;
		   for (i = array.length-1; i > 0; i--) {
	           if (array[i] > array[i-1]) {
	               break;
	           }
           }

	       if (i==0)
	       {
	           System.out.println("Next number is not possible");
	       }
	       
	       int x = array[i-1], smallest = i;
	       for (int j = i+1; j < array.length; j++) {
	           if (array[j] > x && array[j] < array[smallest])
	           {    
	        	   smallest = j;
	           }
	       }
	       swap( array, i -1 , smallest);
		   Arrays.sort(array, i-1 , array.length -1);
		   return array;
	   }
  public static void swap(int array[] , int a,  int b) {
	   int temp = 0;
	   temp = array[a];
	   array[a] = array[b];
	   array[b] = temp;
  }
}