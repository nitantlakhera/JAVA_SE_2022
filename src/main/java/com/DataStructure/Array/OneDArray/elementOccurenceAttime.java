package com.DataStructure.Array.OneDArray;

// search a element occur at n/2 times. 

public class elementOccurenceAttime {
  public static void main(String args []) {
     int array [] = { 2, 2, 3, 5, 2, 2, 6};
     int data = getMajorityElement(array , array.length);
     isMajorityElement(array, array.length, data);
     System.out.println(data); 
  }
  
  static int getMajorityElement(int arr[], int size)
  {
	  	int majorityIndex=0, count=1;
	  	for(int index = 1; index < size; index++)
	  		{
	  			if(arr[majorityIndex] == arr[index]) {
	  				count++;
	  			}else {
	  				count--;
	  			}	
	            if(count == 0)
                {
                   majorityIndex = index;
                   count = 1;
               }
           }
     return arr[majorityIndex];
  }
  
  static void isMajorityElement(int arr[], int size, int majorityElement)
  {
	  int i, count = 0; 
      for (i = 0; i < size; i++)  
      { 
          if (arr[i] == majorityElement) 
              count++; 
      } 
      if (count > size / 2)  
          System.out.println("Majority element  "  + majorityElement);
      else
          System.out.println("no mejority element");;   
  }
}
