package com.Excercises.LogicalCode;
public class EqulibriumIndex {
     public static void main(String args[]) {
    	int array[] = {-7, 1, 5, 2, -4, 3, 0};
    	System.out.println(findIndex(array));
     }

     public static int findIndex(int array[]) {
    	int sum = 0;
    	for (int i =0 ; i < array.length ; i ++) {
    		sum += array[i];
    	}
    	int leftSum = 0;
    	for (int i = 0; i < array.length ; i ++) {
    		sum -= array[i];
    		if (leftSum == sum) {
    			return i;
    		}
    		leftSum  += array[i];		
    	}
    	return -1;
     }
}
