package com.DataStructure.Graph.AdjcentList;

import java.util.LinkedList;

public class LinkedListGraph {
	int V; 
    LinkedList<Integer> adjListArray[]; 
    LinkedListGraph(int V) 
    { 
        this.V = V; 
        adjListArray = new LinkedList[V]; 
        for(int i = 0; i < V ; i++){ 
            adjListArray[i] = new LinkedList<>(); 
        } 
    }
    
    public void addEdge(int src, int dest) 
    { 
        adjListArray[src].add(dest); 
        adjListArray[dest].add(src); 
    } 
	
    public void printGraph(){
        for (int i = 0; i <V ; i++) {
            if(adjListArray[i].size()>0) {
                System.out.print("Vertex " + i + " is connected to: ");
                for (int j = 0; j < adjListArray[i].size(); j++) {
                    System.out.print(adjListArray[i].get(j) + " ");
                }
                System.out.println();
            }
        }
    }
        
    void printAdjacencyList() 
    
    { 
        for (int i = 0; i < adjListArray.length; i++) { 
            System.out.print("Vertix " + i +" connected to: " ); 
            for (int j = 0; j < adjListArray[i].size(); j++) { 
                System.out.print(adjListArray[i].get(j) + " "); 
            } 
            System.out.println(); 
        }
    }
    
    public static void main(String args[]) {
    	LinkedListGraph graph = new LinkedListGraph(5);
    	graph.addEdge(0,1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.printAdjacencyList();
    }
}