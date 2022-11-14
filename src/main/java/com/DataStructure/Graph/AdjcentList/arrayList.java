package com.DataStructure.Graph.AdjcentList;

import java.util.LinkedList;

public class arrayList {
   public static void main(String args[]) {
	   LinkedList<Integer> list[] = new LinkedList[5];
        LinkedList<Integer> l = new LinkedList<Integer>();
        list[0] = new LinkedList<Integer>();
        list[0].add(1);
        list[0].add(2);
        list[0].add(3);
        list[0].add(4);
        list[0].add(5);
        list[1] = new LinkedList<Integer>();
        list[1].add(3);
        list[1].add(4);
        list[1].add(5);
        System.out.println(list[0]);
        System.out.println(list[1]);
   }
}
