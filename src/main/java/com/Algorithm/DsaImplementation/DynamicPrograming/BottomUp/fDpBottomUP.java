package com.Algorithm.DsaImplementation.DynamicPrograming.BottomUp;

public class fDpBottomUP {
  
  public static void main(String args[]) {
	 System.out.println(fibDP(10)); 
  }
  
  public static int fibDP(int x) {
		int fib[] = new int[x + 1];
		fib[0] = 0;
		fib[1] = 1;
		for (int i = 2; i < x + 1; i++) {
			fib[i] = fib[i - 1] + fib[i - 2];
		}
		return fib[x];
	}
}
