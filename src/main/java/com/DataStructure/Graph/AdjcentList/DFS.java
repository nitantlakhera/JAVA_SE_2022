package com.DataStructure.Graph.AdjcentList;

import java.util.Iterator;
import java.util.LinkedList;
public class DFS {
    LinkedList<Integer> adjList[];
    private boolean visited[];
    public DFS(int vertices) {
	    adjList = new LinkedList[vertices];
	    visited = new  boolean[vertices];
	    for(int i =0 ; i<vertices ; i++) {
	    	adjList[i] = new LinkedList<Integer>();
	    }
    }
    public void addEdge(int vertex, int w) {
    	adjList[vertex].add(w);
    }
    
    private void algorithm(int s) {
          visited[s] = true;
          System.out.print(s+" ");
          Iterator<Integer> i = adjList[s].listIterator();
          while(i.hasNext()) {
        	  int n = i.next();
        	  if(!visited[n]) {
        		  algorithm(n);
        	  }
          }
    }
    
    public static void main(String args[]) {
    	DFS g = new DFS(5);
    	System.out.println("DFS Adjacency algorithm");
    	g.addEdge( 0, 1); 
        g.addEdge( 0, 4); 
        g.addEdge( 1, 2); 
        g.addEdge( 1, 3); 
        g.addEdge( 1, 4); 
        g.addEdge( 2, 3); 
        g.addEdge( 3, 4);
    	g.algorithm(2);
    }
}