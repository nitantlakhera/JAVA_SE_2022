package com.DataStructure.Graph.Excercise;
public class chapter {
    public static void main(String args []) {
    	int array [] = {4,2,6,1,10};
    	int k=3;
    	int  res = 0 , pageIndex = 0;
    	for(int i =0 ; i<array.length ; i++) {
    		pageIndex = pageIndex + 1;
    		int temp = 0;
    		for(int j = 1 ; j <= array[i] ; j++) {
    			if(temp == k) {
    			   pageIndex ++;
    			   temp = 0;
    		    }
    			if(j == pageIndex) {
    			   res++;
    	        }
    			temp++;
           }
    	 }
    	System.out.println(res);
      }
}