package com.DataStructure.Recursion;

public class GenerateSubsetodSubString {
  public static void main(String args []) {
	  print("ABCD", " ", 0);
  }

public static void print(String str, String current, int index) {
  if(str.length() == index) {
	  System.out.print(current);
	  return;
  }
  print(str, current, index+1);
  print(str, current+str.charAt(index), index+1);
}
}
