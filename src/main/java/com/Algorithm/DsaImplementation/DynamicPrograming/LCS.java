package com.Algorithm.DsaImplementation.DynamicPrograming;

public class LCS {
	
	static int max(int a, int b)
	{
		return a > b? a: b;
	}
	  
	static int  LongestCommonSubSequence(char []str1, char []str2, int len1, int len2)
	{
		int lcs[][] = new int[len1+1][len2+1];
		int i, j;
	    for (i = 0; i <= len1; i++)
	    {
	    	for (j = 0; j <= len2; j++)
	    	{
	    		if (i == 0 || j == 0)
	    			lcs[i][j] = 0;
	    		else if((str1[i-1] == str2[j-1]))
	    			lcs[i][j] = lcs[i-1][j-1] + 1;
	    		else
	    			lcs[i][j] = max(lcs[i-1][j], lcs[i][j-1]);
	    	}
	    }
	    return lcs[len1][len2];
	}  
   public static void main(String args[]) {
	   char str1[] = {'A','A','A','C','C','G','T','G','A','G','T','T','A','T','T','C','G','T','T','C','T','A','G','A','A'};
	   char str2[] = {'C','A','C','C','C','C','T','A','A','G','G','T','A','C','C','T','T','T','G','G','T','T','C'};
	   int len1 = str1.length;
	   int len2 = str2.length;
	   System.out.println(LongestCommonSubSequence(str1, str2, len1, len2));
   }
}
