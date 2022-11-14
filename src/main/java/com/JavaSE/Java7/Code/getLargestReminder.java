package com.JavaSE.Java7.Code;

import java.util.ArrayList;

public class getLargestReminder {
     public static  void main(String args[]) {
    	 int n = 6;
    	 ArrayList<Integer> list = new ArrayList<Integer>();
    	 for(int i =0 ; i< n ; i++) {
    		 list.add((i*i)%2);
    	 }
    	 System.out.println(list);
    	 
     }
}
