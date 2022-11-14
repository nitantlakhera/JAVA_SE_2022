package com.Algorithm.DsaImplementation.Arrays;

public class sortArrayInWaveForm {
  public static void main(String args[]) {
	  int array[] =  {1,2,3,4,5,6,7,8};
	  print(sortInWave(array, array.length));
  }
  
  static int[] sortInWave(int arr[], int n) 
  { 
      for (int i = 0; i < n; i+=2) 
      { 
          if (i>0 && arr[i-1] > arr[i] ) 
              swap(arr, i-1, i); 
          if (i<n-1 && arr[i] < arr[i+1] ) 
              swap(arr, i, i + 1); 
      } 
   return arr;
  }
  
  static void swap(int array[], int a , int b) {  
	  int temp = 0;
	  temp = array[a];
	  array[a] =  array[b];
	  array[b] = temp;
  }
  
  static void print(int array[]) {
	  for(int i =0 ; i < array.length ; i++) {
		  System.out.print(" "+array[i]);
	  }
  }
}
