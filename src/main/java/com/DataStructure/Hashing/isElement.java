package com.DataStructure.Hashing;

import java.util.HashSet;
import java.util.Scanner;

public class isElement {
   public static void main(String args[]) {
	   HashSet<Integer> set = new HashSet<Integer>();
	   Scanner kb = new Scanner(System.in);
	   for(int j =0 ; j<5 ; j++) {
		   int i = kb.nextInt();
		   if(!set.contains(i)) {
			   set.add(i);
		   }else {
			   System.out.println("Yes");
		   }   
	   }
   }
}