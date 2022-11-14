package com.DataStructure.Array.OneDArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeSet;
public class arrangeUsingoccurance {
  public static void main(String args []) {
	  int array[] = {1,1,1,1,3,3,3,3,3,3,2,2,5,5,5,5,5,0,0,0,0,0,0,0,0};
	  putInMap2(array);
//	  arrange(array);
//	  rearrange(array);
  }
       
  public static void arrange(int array[]) {
	 StringBuilder string = null;
	 Comparator<String> com = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o2.length() - o1.length();
			}   
	 };
     TreeSet<String> list = new TreeSet<String>(com);
	 for(int i = 0 ; i<array.length ; i++) {
    	 string = new StringBuilder();
         for(int j = 0 ; j<array.length ; j ++) {
        	 if(array[j] == array[i]) {
        		 string =  string.append(array[i]);
        	 }
         }
         list.add(string.toString());
     }
	 System.out.println(list); 
   }
  public static void rearrange (int array[]) {
	  HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();
	     for (int i = 0; i < array.length; i++) {
	        if (data.containsKey(array[i])) {
	            Integer count = data.get(array[i]) + 1;
	            data.put(array[i], count);
	        } else {
	            data.put(array[i], 1);	            
	        }
	    }
	    ArrayList<Entry<Integer, Integer>> list = new ArrayList<Entry<Integer, Integer>>(data.entrySet());
	    Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
	        public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
	            return (o2.getValue()).compareTo(o1.getValue());
	        }
	    });
	    for (Entry<Integer, Integer> entry : list) {
	        System.out.println(entry.getKey() + " <-> " + entry.getValue());
	    }
    }
  
  public static void putInMap2(int array[]) {
	  Map<Integer, Integer> map = new HashMap<>();
	  for (int i = 0; i < array.length; i++) {
		  if (map.containsKey(array[i])) {
			  Integer value =  map.get(array[i]) + 1;
			  map.put(array[i], value); 
		  } else {
			  map.put(array[i], 1);
		  }
	  }
	  System.out.println(map);
  }
  
  public static void putInMap (int array[]) 
  {
	  Map<Integer, Integer> map = new HashMap<>();
	  int count = 1;
	  for (int i = 0; i < array.length; i ++) {
		  if (map.containsKey(array[i])) 
		  {
			  count ++;
			  map.put(array[i], count);
		  } 
		  else {
			  count = 1;
			  map.put(array[i], 1);
		  }
	  }
	  System.out.println(map.toString());
  }
}