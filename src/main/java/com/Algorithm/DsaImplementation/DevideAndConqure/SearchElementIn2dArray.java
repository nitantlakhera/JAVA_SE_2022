package com.Algorithm.DsaImplementation.DevideAndConqure;

public class SearchElementIn2dArray {
  public static void main(String args[]) {
	  int  mat[][] = { {10, 20, 30, 40},
              {15, 25, 35, 45},
              {27, 29, 37, 48},
              {32, 33, 39, 50},
            };
	  System.out.println(" "+search(mat,mat.length-1, 15));
  }
  public static int search(int mat[][] , int n, int x) {
	  int i = 0, j = n-1;
	   while ( i < n && j >= 0 )
	   {
	      if ( mat[i][j] == x )
	      {
	         System.out.print(i+"  "+ j);
	         return 1;
	      }
	      if ( mat[i][j] > x )
	        j--;
	      else 
	        i++;
	   }
     return 0;
  }
}