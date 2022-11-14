package com.Excercises.LogicalCode;

import java.util.Arrays;
import java.util.HashSet;

public class FindThePairOfSum {
    public static void main(String args[]) {
    	int array[] = {8,7,2,5,3,2,1};
    	int sum = 10;
    	//getValue(array, sum);
    	usingSorting(array, sum);
    }

    public static void getValue (int array[], int sum) { 
    	HashSet<Integer> value = new HashSet<Integer>();
    	for (int i =0; i < array.length; i++) {
    		if (value.contains(sum - array[i])) {
    		    System.out.println(array[i] + " " + (sum - array[i]));	
    		} else {
    			value.add(array[i]);
    		}
    	}
    }

    public static void usingSorting(int array[], int sum) {
    	Arrays.sort(array);
    	int start = 0;
    	int end = array.length - 1;
    	while(start < end) {
    		if (array[start] + array[end] < sum) {
    			++start;
    		} else {
    			--end;
    		}
    		if (array[start] + array[end] == sum) {
    			System.out.println(array[start] + " <--> " + array[end]);
    		}
    	}
    }
}
