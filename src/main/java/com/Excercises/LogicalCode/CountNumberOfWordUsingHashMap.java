package com.Excercises.LogicalCode;

import java.util.HashMap;
import java.util.Map;

public class CountNumberOfWordUsingHashMap {
  public static void main(String args[]) {
	  String str = "automationaccess";
	  String string = "This this is is done by Saket Saket";
	  iterationMap(getWordCount(string));
	  //count(str);
  }

  public static HashMap<Character, Integer> count(String str) {
	  HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	  for(int i = 0 ; i <  str.length() ; i ++) {
		  if(map.containsKey(str.charAt(i))) {
			  char word = str.charAt(i);
			  map.put(word, map.get(word) + 1);
		  }else {
			  map.put(str.charAt(i), 1);
		  }
	  }
	  return map;
  }
  
  public static HashMap<String, Integer> getWordCount(String str) {
	  HashMap<String, Integer> map = new HashMap<String, Integer>();
	  String [] array=  str.split(" ");
	  for(int i = 0 ; i < array.length ; i ++) {
	      if(map.containsKey(array[i])) {
	    	  int count = map.get(array[i]);
		      map.put(array[i], count + 1);  	  
	      }
	      else {
	    	  map.put(array[i], 1);
	      }
	  }
	  return map;
  }

  public static void iterationMap (HashMap<String, Integer> map) {
      System.out.println(map.entrySet());
      for(Map.Entry<String, Integer> m : map.entrySet()) {
        if(m.getValue() > 1) {
        	System.out.println(m.getKey());
        }
      }
  }
}