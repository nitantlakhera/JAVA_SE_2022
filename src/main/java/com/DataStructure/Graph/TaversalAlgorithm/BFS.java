package com.DataStructure.Graph.TaversalAlgorithm;

import java.util.Iterator;
import java.util.LinkedList;

public class BFS {
	private int vertices;
	LinkedList<Integer> adjList[];
	public BFS(int vertices) {
           this.vertices = vertices;
	       adjList = new LinkedList[vertices];
	       for(int i =0 ; i< vertices ; i++) {
	    	   adjList[i] = new LinkedList<Integer>();
	       }
	}
	
	public void addEdge(int vertex , int w) {
		adjList[vertex].add(w);
	}
	
	public void bfs_algo(int s) {
	  boolean visited[] = new boolean[vertices];
	  LinkedList<Integer> queue =  new LinkedList<Integer>();
	  visited[s] = true;
	  queue.add(s);
	  while(queue.size()!=0) {
		 s = queue.poll();
		 System.out.println(s+" ");
		 Iterator<Integer> iterate =  adjList[s].listIterator();
		 while(iterate.hasNext()) {
			 int n = iterate.next();
			 if(!visited[n]) {
				 visited[n] =  true;
				 queue.add(n);
			 }
		 }
	  }
	}
    public static void main(String args[]) {
    	BFS g = new BFS(5);
    	g.addEdge( 0, 1); 
        g.addEdge( 0, 4); 
        g.addEdge( 1, 2); 
        g.addEdge( 1, 3); 
        g.addEdge( 1, 4); 
        g.addEdge( 2, 3); 
        g.addEdge( 3, 4);
    	g.bfs_algo(2);
    }
}