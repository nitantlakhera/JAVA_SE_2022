package com.Excercises.LogicalCode;

public class countNumberOfOneInArray {
public static void main(String args []) {
  	int array [] = {0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1};
  	countNumberOfOnes(array);
  	System.out.println(binarySearch(array, 0 , array.length -1));
  	System.out.println(find(array, 0, array.length-1));
}
public static void countNumberOfOnes(int array[]) {
	int i =0;
	int index = 0;
	while(true) {
		if(array[i]==1) {
			index = i;
			break;
		}
		i++;
	}
	System.out.println(array.length - index);
}

public static int binarySearch(int array[], int left , int right){
      if(right >= left) {
		  int mid = (right + left) /2;
		  if(array[mid]==0 || array[mid-1]==0 && array[mid+1] == 1) {
		    return mid;
		  }
		  if(array[mid]==0) {
		     binarySearch(array, mid+1, right);
		  }else {
		     binarySearch(array, left, mid-1);
		  }
	   }
       return -1;
}

public static int find(int array[], int left , int right) {
	if(right >= left ) 
	{
	  int middle = (right + left)/2;
	  if(array[middle] == 0 || array[middle-1] == 0 && array[middle] ==1) {
		  return middle;
	  }
	  if(array[middle] == 0) {
		  return find(array, middle+1, right);
	  }else {
		  return find(array, left, middle-1);
	  }
	}
	return -1;
 }
}