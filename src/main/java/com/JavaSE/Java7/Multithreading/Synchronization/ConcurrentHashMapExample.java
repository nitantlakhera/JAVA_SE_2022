package com.JavaSE.Java7.Multithreading.Synchronization;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public static void main(String args []) 
    {
    	Map<String, Integer> map = new ConcurrentHashMap<String, Integer>();
    	map.put("Neha", 25);
    	map.put("Nitin", 31);
    	map.put("Rakes", 34);
    	map.put("Nitant", 25);
    	map.put("Aman", 10);
    	
    	for (Entry<String, Integer> entry : map.entrySet()) {
    		System.out.println(entry.getKey() + "  " + entry.getValue());
    	}
    }
}