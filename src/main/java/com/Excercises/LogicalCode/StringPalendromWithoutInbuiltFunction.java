package com.Excercises.LogicalCode;

public class StringPalendromWithoutInbuiltFunction {
	public static void main(String args []) {
		System.out.println(isPalendrom("madam"));
		System.out.println(check("madam"));
	}
	
	public static boolean isPalendrom(String str) {
		int left = 0;
		int right = str.length()-1;
		boolean flag = false;
		while (left < right) {
			if (str.charAt(left) == str.charAt(right)) {
				flag = true;
				left++;
			    right--;	
			} else {
				flag = false;
				break;
			}
		}
		return flag;
	}
	public static boolean check(String str) {
		boolean flag = false;
		for (int i =0; i < str.length() / 2 ; i++) {
			if (str.charAt(i) == str.charAt(str.length() - i - 1)) {
				flag = true;
			} else {
				flag = false;
			}
		}
		return flag;
	}
}