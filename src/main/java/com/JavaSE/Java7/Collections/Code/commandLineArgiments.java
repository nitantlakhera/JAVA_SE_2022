package com.JavaSE.Java7.Collections.Code;
import java.io.*;
public class commandLineArgiments {
public static void main(String args []) throws IOException {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      String input[] = reader.readLine().split(" ");
      int array[] = new int[input.length];
      
      for(int i =0; i<input.length ; i++) {
    	  array[i] = Integer.parseInt(input[i]);
      }
      
      for(int i =0 ; i<array.length ; i++) {
    	  System.out.println("  array "+array[i]);
      }   
}}