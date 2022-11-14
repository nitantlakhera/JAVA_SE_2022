package com.Algorithm.DsaImplementation.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Separate0And1InArray {
  public static void main(String args []) {
	  int array[] = {0,1,0,1,0,0,0,1,1,1,1};
	  separate(array);
	  print(sp(array));
	  System.out.println();
	  print(sp2(array));
	  System.out.println();
	  System.out.println("partation");
	  print(partitionAlgorithm(array));
  }
  
  public static void separate(int array[]) {
	  ArrayList<Integer> list_0 = new ArrayList<Integer>();
	  ArrayList<Integer> list_1 = new ArrayList<Integer>();
	  for(int i = 0  ; i< array.length ; i++) {
		  if(array[i] == 0) {
			  list_0.add(array[i]);
		  }else {
			  list_1.add(array[i]);
		  }
	  }
	  list_0.addAll(list_1);
	  System.out.println(list_0);
  }
  
  public static int[] sp(int array[]) {
	  int count = 0;
	  int arr[] = new int[array.length];
	  for(int i =0 ; i< array.length ; i++) {
		  if(array[i] == 0) {
			  arr[i] = 0;
			  count++;
		  }
	  }
	  for(int i = count ; i< array.length ; i++) {
		   arr[i] = 1;
	  }
	  return arr;
  }
  
  public static void print(int array[]) {
	  for(int i =0 ; i < array.length ; i++) {
		  System.out.print(array[i]+" ");
	  }
  }
  
  public static int[] sp2(int array[]) {
	  Arrays.sort(array);
	  return array;
  }

  public static int[] partitionAlgorithm(int array[]) {
	 int left = 0;
	 int right  = array.length - 1;
	  while(right > left) {
		  while((array[left]==0) && left < right) {
			  left ++;
		  }
		  while((array[right]==1) && right > left) {
			  right --;
		  }
		  if(left < right) {
			  array[left++] = 0;
			  array[right--] = 1;
		  }
	  }
	  return array;
  }
}