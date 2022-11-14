package com.DataStructure.Recursion;

public class AllSubStringOfString {
	
	public static void main (String args []) {
		//printSub("ABC"," _ ", 0);
		//System.out.println();
		generate("ABC");
		//get("ABC", "_", 0);
		
	}
	
//	static void RecCombine(String prefix,String rest){
//		if(rest.length() == 0)
//			System.out.print(prefix + " ");
//		else{
//			RecCombine(prefix + rest.charAt(0),rest.substring(1));
//			RecCombine(prefix,rest.substring(1));
//			
//		}
//	}
	
	public static void get(String str, String curr, int index) 
	{
		System.out.println(" str " + str + " curr " + curr + " index  " + index);
		if(index == str.length())
		{
			System.out.println("Print "+ curr);
			return;
		}
		get(str, curr+str.charAt(index), index + 1);
	}
	
	public static void printSub(String str, String curr, int index) {
		if(index == str.length())
		{
			System.out.println("Print "+ curr);
			return;
		}

		printSub(str, curr, index + 1);
		printSub(str, curr+str.charAt(index), index + 1);
	}
	
	 public static void generate(String word) {
	        if (word.length() == 1) {
	            System.out.println(word);
	            return;
	        }else{
	            System.out.println(word);
	            generate(word.substring(0, word.length()-1)); 
	            generate(word.substring(1, word.length())); 
	        }
	 }
	 
	 public static void printSubString(String str) {
		 
	 }
}
