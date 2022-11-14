package com.DataStructure.String;

import java.util.ArrayList;
import java.util.HashSet;
public class ceaserCipher {
   public static void main(String args []) {
	   String string ="middle-Outz";
       int k = 2;
       String newStr="";
       String str="abcdefghijklmnopqrstuvwxyz";
       HashSet<Integer> set = new HashSet<Integer>();
       ArrayList<Object> list = new ArrayList<Object>();
       for(int i = 0 ; i < string.length(); i++ ) {
    	    if(Character.isUpperCase(string.charAt(i))) {
    	    	set.add(i);
    	    	list.add(str.indexOf(Character.toLowerCase(string.charAt(i))));
    	    }else if(!Character.isLetterOrDigit(string.charAt(i))) {
    	    	list.add(string .charAt(i));
    	    }else {
    	    	list.add(str.indexOf(string .charAt(i)));
            }
       }
       for(int i =0 ; i< string.length() ; i++) {   
    	   if(!Character.isLetterOrDigit(string.charAt(i))) {
        	    newStr =  newStr + list.get(i);
            }else {
    	    	   int number =  (int) list.get(i);
    	           number = (number+k);
    	           newStr = newStr+ str.charAt(number%str.length());
            }
       }
       StringBuffer sb =new StringBuffer();
       for(int i =0 ; i< newStr.length() ; i++){
        if(set.contains(i)) {   
		    sb.append(Character.toUpperCase(newStr.charAt(i)));
		}else {
			sb.append(newStr.charAt(i));
		}
       }
       System.out.println(sb.toString());
}
}