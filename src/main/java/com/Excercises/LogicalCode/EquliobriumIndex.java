package com.Excercises.LogicalCode;

import java.util.ArrayList;

public class EquliobriumIndex {
   public static void main(String args []) {
	   int arr[] = {-7,1,5,2,-4,3,0};
       System.out.println(EquilibriumIndex(arr));
       //System.out.println(returnIndex(arr));
   }
   public static int EquilibriumIndex(int arr[])
	{
	  int size = arr.length;
	  int index, leftSum = 0, sum = 0;
	  for(index = 0 ; index < size; index++) {
		  sum += arr[index];
	  }
	  for(index = 0; index < size; index++)
	     {
	       sum -= arr[index];
	       if( leftSum == sum)
	         return index;
	       leftSum += arr[index];
	     }
	    return -1;
     }
   public static int returnIndex(int array[]) {
		ArrayList<Integer> leftSum =new  ArrayList<Integer>();
		ArrayList<Integer> rightSum =new  ArrayList<Integer>();
		int l_sum = 0;
		int r_sum = 0;
		for(int i =0 ; i < array.length ; i++) {
			l_sum =  l_sum + array[i];
			leftSum.add(l_sum);
		}
		for(int i = array.length-1 ; i >= 0 ; i--) {
			r_sum =  r_sum + array[i];
			rightSum.add(r_sum);
		}
		System.out.println("L sum " +leftSum);
		System.out.println("R sum " + rightSum);
		for(int i = 0 ; i< leftSum.size() ; i++) {
			if(leftSum.get(i) == rightSum.get(i+1)) {
				return i;
			}
		}
		return -1;
  	 }
   
	static int equilibrium(int arr[], int n) 
    { 
        int i, j; 
        int leftsum, rightsum; 
        for (i = 0; i < n; ++i) { 
            leftsum = 0;   
            for (j = 0; j < i; j++) {
                leftsum += arr[j];
                System.out.println("hello "+"le " + leftsum);
            }
                
            rightsum = 0; 
            for (j = i + 1; j < n; j++) {
                rightsum += arr[j]; 
                System.out.println("ri " + rightsum );
            }
            if (leftsum == rightsum) 
                return i; 
        }
		return -1; 
    }
}