package com.Excercises.LogicalCode;

public class withoutSqrt {
   public static void main(String args []) {
	   //System.out.println(Math.pow(3, 0.5));
	   //System.out.println(floorSqrt(256));
	   //System.out.println(sqrtWithoutSqrt(3));
	   //System.out.println(simplestMethod(256));
	   //System.out.println(floorSqrt(61));
	   System.out.println(sqrtWithoutSqrt(6));
	   System.out.println(simplestMethod(6));
	   System.out.println(sqrtWithoutSqrt1(6));
   }
   
   public static int floorSqrt(int x) 
   { 
       if (x == 0 || x == 1) 
       return x; 
       int i = 1, result = 1; 
       while (result <= x) 
       { 
         i++; 
         result = i * i; 
       } 
       return i - 1; 
   }
   
   public static double sqrtWithoutSqrt(int number) {
	   double t;
	   double squareRoot = number / 2;
	   do {
		   t = squareRoot;
		   squareRoot = (squareRoot + (number / squareRoot))/2;
	   } while ((t - squareRoot) != 0);
	   return squareRoot;
   }
   
   public static double sqrtWithoutSqrt1(int number) {
	   double t;
	   double squareRoot = number / 2;
	   do {
		   t = squareRoot;
		   squareRoot = (squareRoot + (number / squareRoot))/2;
	   } while (t != squareRoot);
	   return squareRoot;
   }
   
   static double sqrt(int x) 
   { 
           double sqareRoot; 
           int kmax = 1000; 
           double s = x / 2;
           
           for(int k=0;k<kmax;k++) 
           { 
        	       sqareRoot =  s; 
                   s = (s + x/s)/2; 
                   if(sqareRoot == s) 
                   { 
                           break; 
                   } 
           } 
           return s; 
   }
   
   static long usingBS(long  n) 
   { 
        long low = 0; 
        long high = n+1; 
        while (high - low > 1) 
        { 
              long mid = (low+high)/2; 
              if (mid*mid <= n) 
                    low = mid; 
              else 
                    high = mid; 
        } 
         
        return low; 
   }
   
   static float simplestMethod (int number) {
	   float temp, sqrt;
	   sqrt = number /2;
	   temp = 0;
	   while (temp != sqrt) {
		   temp = sqrt;
		   sqrt = (sqrt + (number/sqrt))/2;
	   }
	   return sqrt;
   }
}