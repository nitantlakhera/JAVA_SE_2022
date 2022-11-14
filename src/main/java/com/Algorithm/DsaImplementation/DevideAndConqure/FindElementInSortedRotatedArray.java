package com.Algorithm.DsaImplementation.DevideAndConqure;

public class FindElementInSortedRotatedArray {
  public static void main(String args[]) {
	  int array[] = {7,8,9,10,1,2,3,4,5,6};
	  //System.out.println(findElement(array, 8, 0, array.length-1));
  System.out.println(withoutPivotWithBinarySearch(array, 0, array.length-1, 10));
  System.out.println(withoutPivotWithBinarySearchThroughRecursion(array, 0, array.length-1, 10));
  }
  public static int findElement(int array[], int data, int l , int r) {
	  int i = findPivot(array, data, l, r);
	  if (i == -1) {
		  return binarySearch(array, data, l, r);
	  }
	  if(array[i] == data ) {
		  return i;
	  }
	  if(array[0] <= data) {
		  return binarySearch(array, data, l, i-1);
	  }
	  return binarySearch(array, data, i+1, r);
  }
  
  public static int findPivot(int array[] , int data , int l , int r) {
	  if(r < l) {
		  return -1;
	  }
	  if(r == l) {
		  return l;
	  }
	  int mid = (r + l)/2;
	  if(mid < r && array[mid] > array[mid + 1]) {
		  return mid;
	  }
	  if(mid > l && array[mid] < array[mid-1]) {
		  return mid-1;
	  }
	  if(array[l] >= array[mid]) {
		return  findPivot(array, data, l, mid-1);
	  }
	  return findPivot(array, data, mid+1, r);
  }

  public static int withoutPivotWithBinarySearch (int arr[] , int low , int high , int number) {
	  int mid;
		while(low<=high)
		{
			mid=low + ((high - low) / 2);;

			if(arr[mid]==number)
			{
				return mid;
			}
			if(arr[mid]<=arr[high])
			{
				// Right part is sorted
				if(number > arr[mid] && number <=arr[high])
				{
					low=mid+1;
				}
				else
				{
					high=mid-1;
				}
			}
			else
			{
				// Left part is sorted
				if(arr[low]<=number && number < arr[mid])
				{
					high=mid-1;
				}
				else
				{
					low=mid+1;
				}
			}
		}
		return -1;
  }
  public static int binarySearch(int array[], int data , int l , int r) {
	  if(r >= l) {
		  int middle = (l + r)/2;
		  if(array[middle] == data) {
			  return middle;
		  }else if(array[middle] < l) {
			  return binarySearch(array, data, middle-1, r);
		  }else {
			  return binarySearch(array, data, l, middle+1);
		  }
	  }
	  return -1;
  }
  public static int withoutPivotWithBinarySearchThroughRecursion(int array[] , int low, int high , int data) {
	  if(low > high) {
		  return -1;
	  }
	  int mid = (low + high)/2;
	  if(array[mid] == data) {
		  return mid;
	  }
	  if(array[low] <=  array[mid] ) {
		  if(data >= array[low] && data <=array[mid]) {
			  return withoutPivotWithBinarySearchThroughRecursion(array, low, mid-1, data);
		  }
		return withoutPivotWithBinarySearchThroughRecursion(array, mid+1, high, data);
	  }
	  if(data >= array[mid] && data <= array[high]) {
		  return withoutPivotWithBinarySearchThroughRecursion(array, mid+1, high, data);
	  }
	  return withoutPivotWithBinarySearchThroughRecursion(array, low, mid-1, data);
   }
}