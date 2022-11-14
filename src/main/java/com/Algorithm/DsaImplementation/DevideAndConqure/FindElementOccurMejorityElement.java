package com.Algorithm.DsaImplementation.DevideAndConqure;

public class FindElementOccurMejorityElement {
   public static void main(String args[]) {
	   int array[] = {1, 1, 1, 1,5, 5, 5, 5}; 
       System.out.println(find(array,array.length));	   
	   int arr[] = {1, 2, 3, 3, 3, 3, 10}; 
       System.out.println(isMajority(arr, arr.length, 3));
   }
   
   public static boolean find(int array[], int n) {
	   int last_index = 0; 
	   last_index = (n%2==0)? n/2: n/2+1; 
       for (int i = 0; i < last_index; i++) 
       { 
           System.out.println(array[i]+" " +i+" "+array[i+n/2]);
    	   if (array[i] ==  array[i+n/2]) 
        	   return true; 
       } 
       return false;
   }
   
 static int  _binarySearch(int arr[], int low, int high, int x) 
{ 
   if (high >= low) 
   { 
       int mid = (low + high)/2;
       if ( (mid == 0 || x > arr[mid-1]) && (arr[mid] == x) ) 
           return mid; 
       else if (x > arr[mid]) 
           return _binarySearch(arr, (mid + 1), high, x); 
       else
           return _binarySearch(arr, low, (mid -1), x); 
   } 
   return -1; 
} 

static boolean isMajority(int arr[], int n, int x) 
{ 
   int i = _binarySearch(arr, 0, n-1, x); 
   if (i == -1) 
       return false; 
   if (((i + n/2) <= (n -1)) && arr[i + n/2] == x) 
       return true; 
   else
       return false; 
}
}