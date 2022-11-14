package com.JavaSE.Java7.Collections.Code;
import java.util.*;
public class ArraysOperations {
  private static Scanner kb;

public static void main(String args []) {
	  kb = new Scanner(System.in);
	  float array[] = new float[10];
	  System.out.println("enter value in float array");
	  interTheValue(array);
	  CommandLineArguments(array);
}

public static void interTheValue(float array[]) {
    for(int i =0 ; i< array.length ; i++) {
    	array[i] = kb.nextFloat();
    }
}

public static void CommandLineArguments(float array[]) {
	   for(int  i =0 ; i<array.length ; i++) {
		   System.out.print(array[i]+ " , ");
	   }
}
}
