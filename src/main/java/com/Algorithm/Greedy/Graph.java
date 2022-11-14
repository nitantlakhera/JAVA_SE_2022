package com.Algorithm.Greedy;
import java.util.ArrayList;
class Graph { 
    ArrayList<ArrayList<Integer> > adj; 
    int V; 
    Graph(int v) 
    { 
        V = v; 
        adj = new ArrayList<ArrayList<Integer> >(V); 
        for (int i = 0; i < V; i++) 
            adj.add(new ArrayList<Integer>()); 
    } 

    void addEdge(int u, int v) 
    { 
        adj.get(u).add(v); 
        adj.get(v).add(u); 
    } 
  
    void printAdjacencyList() 
    { 
        for (int i = 0; i < adj.size(); i++) { 
            System.out.println("Adjacency list of " + i); 
            for (int j = 0; j < adj.get(i).size(); j++) { 
                System.out.print(adj.get(i).get(j) + " "); 
            } 
            System.out.println(); 
        } 
    }
}