package com.JavaSE.Java7.Collections.Code;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {
   public static void main(String args []) {
	   Set<String> hash_Set = new HashSet<String>(); 
	   hash_Set.add("hello");
	   hash_Set.add("neha");
	   hash_Set.add("meena");
	   hash_Set.add("kunal");
	   hash_Set.add("sharma");
	   hash_Set.add("akshay");
	   hash_Set.add("hello");
	   hash_Set.add("neha");
	   
	   System.out.println(hash_Set);
       Set<String> tree_set = new TreeSet<String >(hash_Set);
       System.out.println(tree_set);
   }
	
}
