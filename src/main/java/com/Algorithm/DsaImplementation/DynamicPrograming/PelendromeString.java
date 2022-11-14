package com.Algorithm.DsaImplementation.DynamicPrograming;

public class PelendromeString {
	public static void main (String args[]) {
		String s = "amam";
		//boolean check = isPelendrome(s, 0, s.length() - 1, true);
		//System.out.println(check);
		System.out.println(checkPelendrome(s, 0));
	}
	
	public static boolean isPelendrome(String str,int i, int j, boolean check) 
	{
		if (j <= i) {
			return check;
		}
		if (str.charAt(i) != str.charAt(j)) {
			check = false;
		}
		return isPelendrome(str, i + 1, j - 1, check);
	}
	
	public static boolean checkPelendrome(String s, int index) 
	{
		if (index >= s.length() / 2) {
			return true;
		}
		if (s.charAt(index) != s.charAt(s.length() - index - 1)) {
			return false;
		} else {
			return checkPelendrome(s, index + 1);
		}
	}
}
