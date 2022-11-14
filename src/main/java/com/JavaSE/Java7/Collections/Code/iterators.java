package com.JavaSE.Java7.Collections.Code;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class iterators {

	public static void main(String args[]) {
		List<Object> list = new ArrayList<Object>();
		Vector<Object> vector = new Vector<Object>();
		//createList(list);
		createVector(vector);
		enumerationsExp(vector);
		System.out.println();
		//iteratorExp(list);
		createList(list);
		listIterator(list);
	}
	
	public  static void enumerationsExp(Vector<Object> vector){
		Enumeration<Object> e = vector.elements();
		System.out.println("using enumeration interface");
		while(e.hasMoreElements()) {
			System.out.print(e.nextElement()+" ");
		}
	}
	
	public static void iteratorExp(List<Object> vector) {
		Iterator<Object> itr = vector.iterator();
	    System.out.println("using iterator interface");
		while(itr.hasNext()) {
			if((Integer)itr.next() %2 == 0) {
				itr.remove();
			}
			System.out.print(itr.next()+" ");
	    }
	}
	
	public static List<Object> createList(List<Object> list) {
		for(int i =0 ; i<10 ; i++) {
			list.add(i);
		}
		return list;
	}
	
	public static Vector<Object> createVector(Vector<Object > vector) {
	    for(int i =0 ; i<10 ; i++) {	
	    	vector.addElement(i);
	     }
		return vector;
	}
	
	public static List<Object> listIterator(List<Object> list){
		ListIterator<Object > iterator = list.listIterator();
		System.out.println("using list iterator");
		while (iterator.hasPrevious()) 
            System.out.print(iterator.previous() + " ");
		return list;
	}
}