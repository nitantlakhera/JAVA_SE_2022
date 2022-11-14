package com.Excercises.LogicalCode;

public class StringReverse {
   public static void main(String args[]) {
	   String str = "Automation";
	   System.out.println(reverse(str));
   }

   public static String reverse(String str) {
	   char ch [] = str.toCharArray();
	   String new_str ="";
	   for(int i = ch.length - 1 ; i >= 0 ; i--) {
	        new_str = new_str + ch[i];
	   }
	   return new_str;
   }
}
