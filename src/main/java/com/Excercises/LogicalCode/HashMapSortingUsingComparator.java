package com.Excercises.LogicalCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class HashMapSortingUsingComparator {
   public static void main(String args[]) {
	   HashMap<String , Integer > keyAsString = new HashMap<String, Integer>();
       keyAsString.put("neha", 10);
       keyAsString.put("nitin", 12);
       keyAsString.put("sonu", 4);
       keyAsString.put("kumhari", 7);
       keyAsString.put("lakhera", 13);
       keyAsString.put("deewar", 15);
       keyAsString.put("rakesh", 19);
       //sortByValue(keyAsString);
       //System.out.println();
       //sortByKey(keyAsString);
       //System.out.println();
       //usingTreeMap(keyAsString);
       //System.out.println();
       //usingArrayList(keyAsString);
       //sortHashMapByValue(keyAsString);
       sortHashMapByValue(keyAsString);
   }
   
   public static void sortByValue(HashMap<String , Integer > keyAsString) {
	    ArrayList<Entry<String, Integer>> list = new ArrayList<Entry<String,Integer>>(keyAsString.entrySet());
	    Collections.sort(list, new Comparator<Entry<String, Integer>>() {
		@Override
		public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
			return o1.getValue().compareTo(o2.getValue());
		}});
	    HashMap<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
	    for (Entry<String, Integer> i : list) {
	    	sortedMap.put(i.getKey(), i.getValue());
	    }
	    for (Entry<String, Integer> i : sortedMap.entrySet()) {
	    	System.out.println(i.getKey() + " " + i.getValue());
	    }
   }
   public static void sortHashMapByValue(HashMap<String , Integer > keyAsString) 
   {
	    ArrayList<Entry<String, Integer>> list = new ArrayList<Map.Entry<String,Integer>>(keyAsString.entrySet());
	    Collections.sort(list, new Comparator<Entry<String, Integer>>() {
		@Override
		public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
			return o1.getValue().compareTo(o2.getValue());
		}});
	    HashMap<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
	    for (Entry<String, Integer> entry : list) {
	    	 sortedMap.put(entry.getKey(), entry.getValue());
	    }
	    for (Entry<String, Integer> entry : sortedMap.entrySet()) { 
	    	System.out.println(entry.getKey() + " " +entry.getValue());
	    }
   }
   public static void sortByKey(HashMap<String , Integer > keyAsString) {
	    ArrayList<Entry<String, Integer>> list = new ArrayList<Entry<String,Integer>>(keyAsString.entrySet());
	    Collections.sort(list, new Comparator<Entry<String, Integer>>() {
		@Override
		public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
			return o1.getKey().compareTo(o2.getKey());
		}});
	    HashMap<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
	    for (Entry<String, Integer> i : list) {
	    	sortedMap.put(i.getKey(), i.getValue());
	    }
	    for (Entry<String, Integer> i : sortedMap.entrySet()) {
	    	System.out.println(i.getKey() + " " + i.getValue());
	    }
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
   
   public static void hashMapSortByValue (HashMap<String, Integer> map) {
	   List<Entry<String, Integer>> list = new ArrayList<Map.Entry<String,Integer>>(map.entrySet());
       Collections.sort(list, new Comparator<Entry<String, Integer>>() {
         public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {	
        	 return o1.getValue() - o2.getValue();
         }
       });
       HashMap<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
       for (Entry<String, Integer> entry : list) {
    	    sortedMap.put(entry.getKey(), entry.getValue());
       }
       System.out.println(sortedMap);
   }
}