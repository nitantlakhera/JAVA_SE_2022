package com.DataStructure.Array.OneDArray;
public class test {
   public static void main(String args []) {
	   String s1 ="ddcf";
	   String s2 = "cedk";
	   int array1[] = new int [26];
       int array2[] = new int [26];
       for(int i =0 ; i<s1.length(); i++) {
    	   System.out.println(s1.charAt(i)+"   "+array1[s1.charAt(i)-'a']++);
       }
       System.out.println();
       for(int i =0 ; i<s2.length(); i++) {
    	   System.out.println(s2.charAt(i)+"   "+array2[s2.charAt(i)-'a']++);
       }
       
       System.out.println();
       
       for(int i =0 ; i<array1.length ; i++) {
    	   System.out.print(array1[i] +" ");
       }
   }  
}