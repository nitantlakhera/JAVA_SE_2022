package com.Algorithm.DsaImplementation.DynamicPrograming.TopDown;

public class top_down {
   public static void main(String args[]) {
	   int n  = 10;
	   int table [] = new int[n+1];   
       System.out.print(" "+fseries(n, table));
   }
   
   public static void print(int array[]) {
	   for(int i =0 ; i < array.length ; i++) {
		   System.out.println(" "+array[i]);
	   }
   }
   
   public static int fseries(int n, int table[]) {
	   if(n == 0) {
		   return 0;
	   }
	   if(n == 1) {
		   return 1;
	   }
	   if(table[n] != 0) {
		   return table[n];
	   }else {
		   table[n] =  fseries(n-1, table) + fseries(n-2, table);
		   return table[n];
	   }
   }
}
