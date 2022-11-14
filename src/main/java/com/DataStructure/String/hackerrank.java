package com.DataStructure.String;

public class hackerrank {
   public static void main(String args[]) {
	  String s ="hereiamstackerrank";
	   String hc = "hackerrank";
	     StringBuilder sb = new StringBuilder();
	     for(int i =0 ; i< s.length(); i++){
	        if(i<hc.length()){
	        	if(hc.charAt(i)==s.charAt(i)){
	        		System.out.println("h " +s.charAt(i));
	 	           
	        		sb.append(s.charAt(i));
	            }
	        }
	     }
	     System.out.println(sb);
	     if(sb.toString().compareTo(hc)==0){
	       System.out.println("Yes");
	     }
	     System.out.println("No");
	    }
   
}
