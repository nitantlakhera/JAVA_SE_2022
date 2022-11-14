package com.Algorithm.DsaImplementation.DynamicPrograming;

public class MaxSumIncreasingSubSequence {
 public static void main(String args[]) {
	 int array[]={20,3,1,15,16,2,12,13};
     System.out.println("MAX: "+maxsum(array, array.length));
 }
 
 static int maxsum( int arr[], int n )
 {
 	
	int i, j, max = 0;
 	
 	int sum[] = new int[n];
 	
 	for ( i = 0; i < n; i++ )
 		sum[i] = arr[i];
 	
 	for ( i = 1; i < n; i++ )
 		for ( j = 0; j < i; j++ )
 			if ( arr[i] > arr[j] && sum[i] < sum[j] + arr[i])
 				sum[i] = sum[j] + arr[i];

 	for ( i = 0; i < n; i++ )
 		if ( max < sum[i] )
 			max = sum[i];
 	return max;
  }
}
