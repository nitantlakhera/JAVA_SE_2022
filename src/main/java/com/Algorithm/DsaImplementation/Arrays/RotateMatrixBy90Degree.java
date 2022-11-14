package com.Algorithm.DsaImplementation.Arrays;

public class RotateMatrixBy90Degree {
  public static void main(String args[]) {
	  int arr[][] = { { 1, 2, 3, 4 }, 
                      { 5, 6, 7, 8 }, 
                      { 9, 10, 11, 12 }, 
                      { 13, 14, 15, 16 }
                    };
	  
	  transpose(arr);
	  reverse(arr);
	  printMatrix(arr);
  }
  
  public static void reverse(int arr[][]) {
	  for(int i =0 ; i < arr[0].length; i ++) {
		  for(int j = 0 , k =arr[0].length-1 ; j < k ; j++, k--) {
			  int temp = arr[j][i]; 
              arr[j][i] = arr[k][i]; 
              arr[k][i] = temp;
		  }
	  }
  }
  public static void transpose(int arr[][]) {
	  for(int i =0 ; i < arr.length ; i ++) {
		   for(int  j = i ; j < arr[0].length ; j ++) {
			   int temp = arr[j][i]; 
               arr[j][i] = arr[i][j]; 
               arr[i][j] = temp;    
		   }
	  }
  }
  
  static void printMatrix(int arr[][]) 
  { 
      for (int i = 0; i < arr.length; i++) { 
          for (int j = 0; j < arr[0].length; j++) 
              System.out.print(arr[i][j] + " "); 
          System.out.println(""); 
      } 
  } 
}

