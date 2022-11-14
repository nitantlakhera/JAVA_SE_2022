package com.DataStructure.Array.OneDArray;

public class maxDistanceBwElement {
   public static void main(String args []) {
     int array[] = {4,3,10,2,9,1,6};
     
     System.out.println(MaxDistance(array));
     System.out.println(maxDiff(array, array.length)); 
   }
   
   public static int MaxDistance(int array[]) {
	   int current_max=0;
	   for(int left =0 ; left<array.length ; left++) {
		   for(int right = left + 1 ; right<array.length ; right ++) {
			   if(array[right] -array[left] > current_max) {
				   current_max = array[right] - array[left];
			   }
		   }
	   }
	   return current_max;
   }
   
   static int maxDiff(int arr[], int arr_size)  
   { 
       int max_diff = arr[1] - arr[0]; 
       int min_element = arr[0]; 
       int i; 
       for (i = 1; i < arr_size; i++)  
       { 
           if (arr[i] - min_element > max_diff) 
               max_diff = arr[i] - min_element; 
           if (arr[i] < min_element) 
               min_element = arr[i]; 
       } 
       return max_diff; 
   } 	 
}
