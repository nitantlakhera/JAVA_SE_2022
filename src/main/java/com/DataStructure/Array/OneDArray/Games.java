package com.DataStructure.Array.OneDArray;

public class Games {
    public static void main(String args[]) {
    	String S = "RBY_YBR";
    	if(!S.contains("_")) {
    		System.out.println("No");
    	}
    	
    	for(int i =0 ; i< S.length() ; i++) {
    		for(int j =0 ; j < S.length(); j ++) {
    			if(S.charAt(i)==S.charAt(j)) { 
    				char temp = S.charAt(j);
    			}
    			
    		}
    	}
    }
}
