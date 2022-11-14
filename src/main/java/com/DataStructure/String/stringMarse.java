package com.DataStructure.String;

public class stringMarse {
  public static void main(String args[]) {
	  String send="SOSOOSOSOSOSOSSOSOSOSOSOSOS";
	  String sos ="SOS";
	  int count=0;
	  StringBuilder bd = new StringBuilder();
	  for(int i =0 ; i< send.length() ; i++) {
          if(send.charAt(i)!=sos.charAt(i%3)) {		  
        	  count++;
          }
          System.out.println(send.toString().compareTo(send));
	  }
	  System.out.println(count);
  }
  
}
