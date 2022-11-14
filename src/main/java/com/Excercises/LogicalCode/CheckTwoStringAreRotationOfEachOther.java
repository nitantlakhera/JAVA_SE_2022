package com.Excercises.LogicalCode;

public class CheckTwoStringAreRotationOfEachOther {
	public static void main(String args []) {
		System.out.println(check("ABACD", "CDABA"));
	}	
	public static boolean check(String s1, String s2) {
		if (s1.length() == s2.length() && (s1 + s2).indexOf(s2)!= -1) {
			return true ;
		}
		return false;
	}
}