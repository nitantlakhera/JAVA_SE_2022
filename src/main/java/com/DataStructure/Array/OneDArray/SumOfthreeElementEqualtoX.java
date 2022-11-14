package com.DataStructure.Array.OneDArray;
import java.util.Arrays;
public class SumOfthreeElementEqualtoX {
   public static void main(String args []) {
	   int array [] = {1, 4, 45, 6, 10, 8};
	   search(array, 22);
       search2(array, 22);
   }
   
   public  static void search(int array [] , int sum ) {
	   for(int i =0 ; i< array.length-2 ; i++) {
		   for(int j =i+1 ; j< array.length-1 ; j ++) {
			   for(int k =j+1 ; k< array.length ; k++) {
				   if(array[i] + array[j] + array[k] == sum ) {
					   System.out.println( "[ " + array[i] + " , " + array[j] + " , "+ array[k ]+ " ]");
				   }
			   }
		   }
	   }
   }
   public static boolean search2(int array[] , int sum) {
	  int calculated_sum = 0;
	  Arrays.sort(array);
	  int left , right;
	  for( int i =0 ; i<array.length -1 ; i++) {
		  
		  left = i+1 ;
		  right = array.length -1;
		  
		  while(left < right) {   
			   calculated_sum = array[i] + array[left] + array[right];  
			   if(calculated_sum == sum) {
				   System.out.println("[ "+array[i] +" , "+ array[left] +" , " + array[right] + " ] ");
				   return true;
			   }
			   if(calculated_sum < sum) {
				   left ++;
			   }else {
				   right--;
			   }
		   }
      } 
	  return false;
   }
}