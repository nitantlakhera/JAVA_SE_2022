package com.JavaSE.Java7.String;

import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class string_tokenizer {
  public static void main(String args []) {
	  String str ="i.love.java.codeing.very.much";
	  ArrayList<String> list = new ArrayList<String>();
	  StringTokenizer s = new StringTokenizer(str, ".");
	  while(s.hasMoreTokens()) {
		  list.add((String) s.nextElement());
	  }
	  Collections.reverse(list);
      for(int i =0 ; i < list.size() ; i++) {
    	  if(i == list.size()-1) {
    		  System.out.print(list.get(i));
    	  }else {
    		  System.out.print(list.get(i)+".");
    	  }
      }
   }
}
