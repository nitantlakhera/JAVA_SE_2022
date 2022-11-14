package com.DataStructure.String;

import java.util.HashSet;

public class cookies {
  public static void main(String args []) {
    String s1 = "elephant";
    String s2 = "some"; 
    char array1[] = s1.toCharArray();
	 char array2[] = s2.toCharArray();
	 
    if(new cookies().compare(array1, array2)) {
    	System.out.println("Yes");
    }
    else {
    	System.out.println("No");
    }
  }
  public boolean compare(char [] a , char [] b) {
	 HashSet< Character> hash = new HashSet<Character>();
   	 for(int i =0 ; i<a.length ; i++){
		 hash.add(a[i]);
	  }
      for(int i = 0 ; i<b.length ; i++) {
    	if(hash.contains(b[i])) {
     	  return true;
        }
     }
     return false;
  } 
}