package com.DataStructure.Graph.AdjcentList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class DFS_WITHOUT_RECURSION {
   private int vertices;
   LinkedList<Integer> adjList[];

   public DFS_WITHOUT_RECURSION(int vertices) {
       this.vertices = vertices;
       adjList = new LinkedList[vertices];
      for(int i =0; i<vertices ; i++) {
    	  adjList[i] = new LinkedList<Integer>();
      }
   }

   public void addEdge(int v , int w) {
	   adjList[v].add(w);
   }

   public void DFS(int s) {
	   Vector<Boolean> visited = new Vector<Boolean>(vertices); 
       for (int i = 0; i < vertices; i++) 
           visited.add(false); 
       Stack<Integer> stack = new Stack<>(); 
       stack.push(s); 
       while(stack.empty() == false) 
       { 
           s = stack.peek(); 
           stack.pop();   
           if(visited.get(s) == false) 
           { 
               System.out.print(s + " "); 
               visited.set(s, true); 
           } 
           Iterator<Integer> itr = adjList[s].iterator(); 
           while (itr.hasNext())  
           { 
               int v = itr.next(); 
               if(!visited.get(v)) 
                   stack.push(v); 
           } 
       } 
   }  

   public static void main(String args[]) {
		DFS_WITHOUT_RECURSION g = new DFS_WITHOUT_RECURSION(5);
		g.addEdge(1, 0); 
        g.addEdge(0, 2); 
        g.addEdge(2, 1); 
        g.addEdge(0, 3); 
        g.addEdge(1, 4);
        g.DFS(0);
	}
}
