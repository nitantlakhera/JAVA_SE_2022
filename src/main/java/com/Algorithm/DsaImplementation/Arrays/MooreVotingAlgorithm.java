package com.Algorithm.DsaImplementation.Arrays;

public class MooreVotingAlgorithm {
  public static void main(String args[]) {
    int array[] = {2,2,2,2,3,4};
    int element = getMejorityElement(array);
    if(isMejority(array, element)) {
    	System.out.println("Yes " +element);
    }else{
    	System.out.println("No");
    }
  }

  private static int getMejorityElement(int array[]) {
	  int voter = 0;
	  int vote = 1;
	  for(int i = 1; i< array.length ; i++) {
		  if(array[voter] == array[i]) {
			  vote++;
		  }else {
			  vote--;
		  }
		  if(vote == 0) {
			  voter = i;
			  vote = 1;
		  }
	  }
	  return array[voter];
  }
  private static boolean isMejority(int array[], int number) {
	 int count = 0;
	 for(int i =0 ; i< array.length ; i++) {
		 if(array[i] == array[number]) {
	       count ++;		 
		 }
	 }
	  if(count> array.length /2 ) {
		  return true;
	  }else {
		  return false;
	  }
  }
}
