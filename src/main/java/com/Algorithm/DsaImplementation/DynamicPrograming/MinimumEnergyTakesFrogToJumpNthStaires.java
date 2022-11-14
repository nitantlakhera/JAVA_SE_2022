package com.Algorithm.DsaImplementation.DynamicPrograming;

public class MinimumEnergyTakesFrogToJumpNthStaires {
	public static void main (String args[]) {
		int array[] = {30, 10 , 60 , 10, 60 , 50};
		System.out.println(jumpWithDPTabulation(5, array));
	}
	
	
	public static int jump(int index , int [] height) {
		if (index == 0) {
			return 0;
		}
		int left = jump(index - 1, height) + Math.abs(height[index] - height[index - 1]);
		int right = Integer.MAX_VALUE;
		if (index > 1) {
			right = jump(index -2, height) + Math.abs(height[index] - height[index -2]);
		}
		return Math.min(left, right);
	}
	
	public static int jumpWithDP(int index , int [] height, int DP[]) {
		if (index == 0) {
			return 0;
		}
		if (DP[index] != 0) {
			return DP[index];
		}
		int left = jumpWithDP(index - 1, height, DP) + Math.abs(height[index] - height[index - 1]);
		int right = Integer.MAX_VALUE;
		if (index > 1) {
			right = jumpWithDP(index -2, height, DP) + Math.abs(height[index] - height[index -2]);
		}
		return DP[index] = Math.min(left, right);
	}
	
	public static int jumpWithDPTabulation(int index , int [] height) {
		int DP[] = new int[height.length + 1];
		DP[0] = 0;
		for (int i = 1; i < index; i ++) {
			int left = DP[i -1] + Math.abs(height[i] - height[i - 1]);
			int right = Integer.MAX_VALUE;
			if (index > 1) {
				right = DP[i -2 ] + Math.abs(height[i] - height[i -2]);
			}
			DP[i] = Math.max(left, right);
		}
		return DP[index -1];
	}
}