package com.DataStructure.Graph.TaversalAlgorithm;

import java.util.Iterator;
import java.util.LinkedList;
public class DFS {
    private int vertices;
    LinkedList<Integer> adjList[];
    public DFS(int vertices) {
	    this.vertices = vertices;
	    adjList = new LinkedList[vertices];
	    for(int i =0 ; i<vertices ; i++) {
	    	adjList[i] = new LinkedList<Integer>();
	    }
    }
    public void addEdge(int vertex, int w) {
    	adjList[vertex].add(w);
    }
    
    private void algorithm(int s , boolean[] visited) {
          visited[s] = true;
          System.out.println(s);
          Iterator<Integer> i = adjList[s].listIterator();
          while(i.hasNext()) {
        	  int n = i.next();
        	  if(!visited[n]) {
        		  algorithm(n, visited);
        	  }
          }
    }
    
    public void dfs(int start) {
	  boolean visited[] = new boolean[vertices];
	  algorithm(start, visited);
    }
    
    public static void main(String args[]) {
    	DFS g = new DFS(5);
    	g.addEdge( 0, 1); 
        g.addEdge( 0, 4); 
        g.addEdge( 1, 2); 
        g.addEdge( 1, 3); 
        g.addEdge( 1, 4); 
        g.addEdge( 2, 3); 
        g.addEdge( 3, 4);
    	g.dfs(0);
    }
}