package com.Excercises.LogicalCode;

public class PalendromNumberOrstring {
   public static void main(String args []) {
       int number  =  545;
       String str = "abcba";
       Number(number);
       String(str);
   }
   
   public static void Number(int number) {
	   StringBuilder b = new StringBuilder(String.valueOf(number));
	   if(String.valueOf(number).equals(b.reverse().toString())) {
		   System.out.println("yes");
	   }
	   else{
		   System.out.println("No");
	   }
   }

   public static void String(String s) {
	   StringBuilder string = new StringBuilder(s);
       String newS = string.reverse().toString();
       if(newS.equals(s)) {
    	   System.out.println("Yes");
       }
       else {
    	   System.out.println("No");
       }
   }
}