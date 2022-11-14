package com.JavaSE.Java7.Multithreading.Synchronization;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SynchronizedHashMap {
   public static void main(String args []) {
	   HashMap<String, Integer> map = new HashMap<String, Integer>();
	   Map<String, Integer> synchronizedHashMap = Collections.synchronizedMap(map);
	   System.out.println(synchronizedHashMap);
	   
	   ConcurrentHashMap<String, Integer> concurentHashMap = new ConcurrentHashMap<String, Integer>();
	   System.out.println(concurentHashMap);
	   
	   synchronized (map) {}
	   
   }
}
