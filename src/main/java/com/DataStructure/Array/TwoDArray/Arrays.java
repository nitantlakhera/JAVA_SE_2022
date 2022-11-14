package com.DataStructure.Array.TwoDArray;

import java.util.Scanner;

public class Arrays {
    private static Scanner sc;

	public static void main(String args[]) {
    	sc= new Scanner(System.in);
    	System.out.println("enter the row and column");
    	int row = sc.nextInt();
    	int col = sc.nextInt();
    	int array[][] =  new int [row][col]; 
    	System.out.println("Enter the element in the Array");
    	for (int i =0;i<row;i++)  
    	    {  
    	        for(int j=0;j<col;j++)  
    	        {  
    	            array[i][j]=sc.nextInt();  
    	        }  
    	    }
        System.out.println("Printing the Matrix");
    	for(int i =0 ; i< row ; i++) {
		    System.out.println();
		    for(int j =0 ; j< col; j++) {
			    System.out.print(array[i][j]+"\t");
		    }
	     }
	}
}
