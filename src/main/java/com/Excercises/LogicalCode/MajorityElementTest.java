package com.Excercises.LogicalCode;
public class MajorityElementTest {
   public static void main(String args[]) {
	   int array[] = {1,2,2,2,2,2,1,1,1,2,1,2,2};
	   System.out.println(isMejority(getElement(array), array));
   }

   public static int getElement(int array[]) {
     int vote = 1;
     int voter = array[0];
     for (int i = 1 ; i < array.length; i ++) {
    	 if (voter == array[i]) {
    		 vote++;
    	 } else {
    		 vote--;
    	 }
    	 if (vote == 0) {
    		 vote=1;
    		 voter = array[i];
    	 }
     }
     return voter;
   }

   public static boolean isMejority(int element, int [] array) {
	   int count = 0;
	   for (int i = 0; i < array.length; i ++) {
		   if (element == array[i]) {
			   count++;
		   }
	   }
	   if (count > array.length/2) {
		   return true;
	   }
	   return false;
   }
}
