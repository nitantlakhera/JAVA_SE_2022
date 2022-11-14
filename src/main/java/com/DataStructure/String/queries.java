package com.DataStructure.String;

import java.util.HashMap;

public class queries {
  public static void main(String args[]) {
	  String []s = {"aba","baba" , "aba" ,"xzxb" };
	  String queries [] = {"aba","xzxb","ab"};
	  HashMap<String, Integer> map = new HashMap<String, Integer>();
	  Integer count;
	  for(int i =0 ; i<1 ; i++) {
		  System.out.println(map);
		  count = map.get(s[i]);
		  System.out.println(count);
		  if(count == null) {
			 System.out.println("h");
			  count = 0;
		  }
		  map.put(s[i], count+1);
	  }
	   System.out.println(map);
	  System.out.println();
	  int array []=new int[queries.length];
	  for(int i =0 ; i<queries.length ; i++) {
		  Integer counter =  map.get(queries[i]);
	     if(counter == null) {
	    	 array[i]=0;
	     }else {
	    	 array[i]= counter;
	     }
	  }
	}
}