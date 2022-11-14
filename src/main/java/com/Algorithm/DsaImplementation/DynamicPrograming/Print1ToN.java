package com.Algorithm.DsaImplementation.DynamicPrograming;

public class Print1ToN {
	public static void main (String args[]) {
		Print1ToN.print(10, 0);
	}
	
	public static void print(int N, int index) {
		if (index == N) {
			return;
		}
		index = index + 1;
		System.out.println(index);
		print(N, index);
	}
}
