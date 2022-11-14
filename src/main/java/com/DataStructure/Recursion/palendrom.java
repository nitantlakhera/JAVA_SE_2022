package com.DataStructure.Recursion;

public class palendrom {

public static void main(String args []) {
	String s ="aabaa";
	int i =0;
	int j = s.length()-1;
	System.out.println(palendrom.print(s.toCharArray() ,i, j));
}
public static boolean print(char [] s , int start , int end) {
	if(start == end) {
		return true;
	}
	if(start>end) {
		return true;
	}
	if(s[start]!= s[end]) {
		return false;
	}
	return print(s, start+1, end-1);
}
}
