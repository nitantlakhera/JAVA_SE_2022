package com.DataStructure.String;

public class chockletFest {
    public static void main(String args []) {
    	int n =15;
    	int c =3;
    	int m = 2;
        int totalChoc = n / c;
        int totalWrappers = totalChoc;
        int freeChocs = 0;
        while (m <= totalWrappers) {
            int wrapperTogive=totalWrappers-(totalWrappers%m) ;
            System.out.println(wrapperTogive  + "  " + totalWrappers);
            freeChocs = totalWrappers / m;
            System.out.println(freeChocs);
            totalWrappers = (totalWrappers - wrapperTogive) + freeChocs;
            System.out.println(totalWrappers);
            totalChoc=totalChoc + freeChocs;
            System.out.println(totalChoc);
         break;
        }

        System.out.println(totalChoc);

    }
}
