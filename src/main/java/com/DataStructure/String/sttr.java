package com.DataStructure.String;

public class sttr {
   public static void main(String args[]) {
	String s=" hello " ;
	   String newString ="";
    for(int i =0; i<s.length(); i++){
            if(s.charAt(i)!=' '){
            newString = newString+s.charAt(i);
        }
    }
    int length = newString.length();
    double number =  Math.sqrt(length);
    String ss = Double.toString(number);
    String h = ss.substring(0,3);
    String[] hh = h.split("\\.");
    int number1 = Integer.parseInt(hh[0]);
    int number2 = Integer.parseInt(hh[1]);
    char array[][] = new char[number1][number2];
    int k =0;
    for(int row =0 ; row< number1 ; row++){
        for(int col = 0 ; col< number2 ; col++){
            if(k<newString.length()){
              array[row][col] =  newString.charAt(k);
            }
           k++;
        }
    }
    String string = "";
    for(int i=0;i < array.length;i++){
       for(int j=0; j < array[i].length;j++){
          string = string + array[i][j];
     }
   }
   }
}
