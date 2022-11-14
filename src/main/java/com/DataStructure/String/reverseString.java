package com.DataStructure.String;

public class reverseString {
public static void main(String args[]) {
	String s = "i.love.java";
	String []string = s.split("\\.");
	for(int i = string.length-1 ; i>= 0 ; i--) {
		if(i==0) {
			System.out.println(string[i]);
		}else {
			System.out.print(string[i]+ ".");
		}
	}
}
}
