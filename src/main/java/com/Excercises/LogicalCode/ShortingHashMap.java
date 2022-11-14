package com.Excercises.LogicalCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


import java.util.TreeMap;

public class ShortingHashMap {
   public static void main(String args []) {
	   HashMap<Integer, String> hmap = new HashMap<Integer, String>();
	   hmap.put(5, "A");
       hmap.put(11, "C");
       hmap.put(4, "Z");
       hmap.put(77, "Y");
       hmap.put(9, "P");
       hmap.put(66, "Q");
       hmap.put(0, "R");
       
       HashMap<String , Integer > keyAsString = new HashMap<String, Integer>();
       keyAsString.put("neha", 10);
       keyAsString.put("nitin", 12);
       keyAsString.put("sonu", 4);
       keyAsString.put("kumhari", 7);
       keyAsString.put("lakhera", 13);
       keyAsString.put("deewar", 15);
       keyAsString.put("rakesh", 19);
       usingTreeMap(keyAsString);
       System.out.println();
       usingArrayList(keyAsString);
   }
   
   public static void usingTreeMap (HashMap<String , Integer > keyAsString) {
	   TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>();
	   treeMap.putAll(keyAsString);
	   for (Map.Entry<String, Integer> i : treeMap.entrySet()) {
		   System.out.println(i.getKey() + " <--> " + i.getValue());
	   }
   }

   public static void usingArrayList(HashMap<String , Integer > keyAsString) {
      ArrayList<String> list = new ArrayList<String>(keyAsString.keySet());
      Collections.sort(list);
      for (String s : list) {
    	  System.out.println(s + " <--> " + keyAsString.get(s));
      } 
   }

   public static void print (HashMap<Integer, String> hmap) {
	  for (Entry<Integer, String> i : hmap.entrySet()) 
	  {
		  System.out.println(i.getValue() + " " + i.getKey());
	  }
   }
}