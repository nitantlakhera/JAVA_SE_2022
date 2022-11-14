package com.DataStructure.Array.OneDArray;

import java.util.ArrayList;

public class rotateArray {
    public static void main(String args[]) {
    	  int array []= {3,4,5};
    	  int k = 6;
    	   new rotateArray().rotate(array ,k);
    }
    public int [] rotate(int[] array, int k) {
        int rotate = k%array.length;
    	int length =  array.length - rotate;
       int returnarray[] = new int [array.length];
       ArrayList<Integer> list = new ArrayList<Integer>();
       for(int i =length ; i<array.length ; i++) {      
    	  list.add( array[i]);
       }
       for(int i =0 ; i<length ; i++) {
    	   list.add(array[i]);
       }
       for(int i =0 ; i<list.size() ; i++) {
    	   returnarray[i] = list.get(i);
       }
       int qq[] = {0,1,2};
       for(int i =0 ; i<qq.length ; i++) {
    	   System.out.println("list" +list.get(qq[i]));
       }
       return returnarray;
    }
}
