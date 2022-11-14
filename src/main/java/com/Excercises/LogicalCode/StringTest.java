package com.Excercises.LogicalCode;

public class StringTest {
   public static void main(String args[]) {
	   String s = new String("hello");
	   String s1 = new String("hello");
	   System.out.println(s == s1);
	   System.out.println(s.equals(s1));
	   
	   
	   String s2 = "hello";
	   String s3 = "hello";
	   System.out.println(s2 == s3);
   }
}
