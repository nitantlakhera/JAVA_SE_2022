package com.DataStructure.Hashing;

import java.util.HashMap;

public class groupElementOccurenceByOrder {
  
  public static void main(String args []) {
	  int array[]= {1,1,1,1,3,3,3,2,2,5,5,5,5,5};
	  groupOccurenceOFElement(array);
  }
  
  public static void groupOccurenceOFElement(int array[]){
	  HashMap<Integer, Integer>  map = new HashMap<Integer, Integer>();
      for(int i =0; i<array.length ; i++) {
    	  Integer prevCount = map.get(array[i]);    
          if(prevCount == null) {    	  
        	  prevCount = 0;
          }
          map.put(array[i], prevCount+1);
      }
      for(int i =0; i<array.length ; i++) {
    	  Integer prevCount = map.get(array[i]);
    	  if(prevCount != null) {
    		  for(int j=0 ; j<prevCount ; j++){
    			  System.out.println(array[i]);
    		  }
    	 	  map.remove(array[i]);
    	  }  
      }
   }
}