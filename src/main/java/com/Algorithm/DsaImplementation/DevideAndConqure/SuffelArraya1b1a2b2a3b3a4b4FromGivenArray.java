package com.Algorithm.DsaImplementation.DevideAndConqure;

public class SuffelArraya1b1a2b2a3b3a4b4FromGivenArray {
  
  public static void main(String args[]) {
	  int array[] =  {1,2,3,4,5,6,7,8};
	  suffel(array, 0, array.length-1);
	  for(int i =0 ; i < array.length ; i++) {
		  System.out.print(array[i]);
	  }
  }

  public static void suffel(int array[] , int left , int right) {
     if(right - left == 1) {
    	 return;
     }
	 int middle = (left + right)/2;
	 int leftMid = (left + middle)/2;
     int temp = middle + 1;
      for(int i = leftMid+1 ; i <= middle ; i ++) {
    	 int t =  array[i];
    	 array[i] = array[temp];
         array[temp++] = t;
     }
      suffel(array, left, middle);
      suffel(array, middle+1, right);
   }
}
