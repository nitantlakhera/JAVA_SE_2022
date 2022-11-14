package com.DataStructure.Array.OneDArray;

import java.util.ArrayList;

public class video_game {
  public static void main(String args []) {
	  int p = 16;
	  int d = 2;
	  int m = 1;
	  ArrayList<Integer> list = new ArrayList<Integer>();
	  list.add(p);
	  for(int i =0 ; i<m ; i++) {
		  int temp = p-d;
		  p = temp;
         if(p<=m) {
        	 list.add(m);
         }else {
        	 list.add(p);
         }
	  }
	  int sum = 0;
	  int count =0;
	  int s =9981;
	  for(int i =0 ; i<list.size() ; i++) {
    	  sum = sum + list.get(i);
		  if(sum > s) {
			  break;
		  }
		  System.out.println(sum);
		  count++;
      }
	  System.out.println(count);
  }
}
