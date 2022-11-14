package com.DataStructure.Array.OneDArray;

import java.util.ArrayList;
import java.util.HashSet;

public class beautifulTriplet {
   public static void main(String args[]) {
	    int array[] = {1,2,4,5,7,8,10};
	    HashSet<Integer> set = new HashSet<Integer>();
	    int d = 3;
	    for(int i =0; i<array.length; i++ ) {
	    	for(int j = 1 ; j<array.length ; j++) {
    			if(array[j]-array[i] == d) {
    				System.out.println(array[i]+" - "+array[j]);
    			}
    		}
	    	System.out.println("array-> " +array[i]);
	    }
   }
}
