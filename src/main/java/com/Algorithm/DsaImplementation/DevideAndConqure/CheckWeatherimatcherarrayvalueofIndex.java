package com.Algorithm.DsaImplementation.DevideAndConqure;

public class CheckWeatherimatcherarrayvalueofIndex {
   public static void main(String args []) {
	   int[] A = { -1, 0, 1, 2, 4, 10 };
	   System.out.println(find(A, 0, A.length-1));	
   }
   
   public static int  find(int array[] , int left , int right) {
	   int mid = (left + right)/2;
	   if(left <= right) {
		   if(array[mid] == mid) {
		   	  return mid; 
		   }
		   if(mid > array[mid]) {
			   return find(array, mid+1, right);
		   }else {
		      return find(array, left, mid-1);
		   }
	   }
	   return -1;
   }
}
