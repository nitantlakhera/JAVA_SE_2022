package com.DataStructure.Array.OneDArray;

public class pair_or_squre_cube {
   public static void main(String args []) {
	    int charcount[] = new int[26];
	    String s1 = "ddcf";
	    for(int i =0 ; i< s1.length() ; i++) {
	    	charcount[s1.charAt(i) - 'a']++;
	    	System.out.println(charcount[s1.charAt(i)-'a']);
	    }
   }	
}
