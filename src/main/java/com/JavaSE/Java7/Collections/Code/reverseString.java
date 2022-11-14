package com.JavaSE.Java7.Collections.Code;
import java.util.ArrayList;
import java.util.Scanner;
public class reverseString {
private static Scanner kb;
public static void main(String srgs[]) {
	  kb = new Scanner(System.in);
	  System.out.println("enter string to reverse");
	  String string = kb.nextLine();
	  char[] array = string.toCharArray();
	  ArrayList<Object> list = new ArrayList<Object>();
      String str = "";
	  for(int i =0 ; i<array.length ; i++) {
		         if(i!=array.length-1) {
		         if(array[i] != '.') { 
	        	       str += array[i];
	        	  }else  {
	        		   list.add(str);
	            	   str ="";
	        	 }
		         }else {
		             str += array[i];
			         list.add(str);
		         }
	  }
	  for(int i=list.size()-1;i>=0;i--)
	  {
		  if(i==0) System.out.print(list.get(i));
		  else
		  System.out.print(list.get(i)+".");
	  }
   }
}