package com.DataStructure.String;

import java.util.ArrayList;

public class reverseWithoutSplit {
 public static void main(String args[]) {
	 String s= "i.love.java.codeing.very.much";
     ArrayList<String> list = new ArrayList<String>();
	 char array[] = s.toCharArray();
	 String string = "";
	 for(int i =0 ;i <array.length ; i++) {
		 if(array[i]!='.') {
			 string = string+ array[i];
		 }else {
			 list.add(string);
			 string = "";
		 }
	 }
	 list.add(string);
     for(int i = list.size()-1 ; i >= 0 ;i --) {
         if(i==0) {
        	 System.out.print(list.get(i));
         }else {
        	 System.out.print(list.get(i)+".");
        }
     }
   }
}