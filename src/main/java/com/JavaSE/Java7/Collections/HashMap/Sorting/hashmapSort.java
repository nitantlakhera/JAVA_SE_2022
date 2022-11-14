package com.JavaSE.Java7.Collections.HashMap.Sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class hashmapSort {
    public static void main(String args[]) {
    	HashMap<String , Integer> map = new HashMap<String, Integer>();
    	map.put("neha", 24);
    	map.put("meenu", 19);
    	map.put("kavita", 12);
    	map.put("sonal", 34);
    	map.put("meena", 20);
    	map.put("ankita", 24);
    	print("before Sorting",  map);
    	print("after sorting", sortHahsMapByValue(map));
    }
    public static Map<String, Integer> sortHahsMapByKey(HashMap<String, Integer> mmap) {
    	Map<String, Integer> treeMap = new TreeMap<String, Integer>();
    	treeMap.putAll(mmap);
    	return treeMap;
    }
    public static Map<String, Integer> sortHahsMapByValue(Map<String, Integer> map) {
    	List<Entry<String, Integer>> list = new ArrayList<Map.Entry<String,Integer>>(map.entrySet());
    	list.sort((o1, o2) -> {return o1.getValue() - o2.getValue();});
        Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
        for (Entry<String , Integer> entry : list) {
        	sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }
    public static void print(String message, Map<String, Integer> map) {
    	System.out.println(message);
    	System.out.println();
    	for(Entry<String, Integer> entry : map.entrySet()) {
    		System.out.println(entry.getKey() + "   " + entry.getValue());
    	}
    	System.out.println();
    }
}