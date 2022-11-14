package com.DataStructure.Graph.AdjcentMetrix;

import java.util.LinkedList;

public class Bfs_Algo {
	int vertex;
    int matrix[][];

    public Bfs_Algo(int vertex) {
        this.vertex = vertex;
        matrix = new int[vertex][vertex];
    }

    public void addEdge(int source, int destination) {
        matrix[source][destination]=1;
        matrix[destination][source]=1;
    }
    
    public void Bfs_Algorithm(int start) {
    	LinkedList<Integer> queue = new LinkedList<Integer>();
    	boolean visited[] = new boolean [matrix.length];
    	visited[start] = true;
    	queue.add(start);
    	while(!queue.isEmpty()){
            start = queue.poll();
                System.out.print(start +" ");
                for (int i = 0; i < matrix.length; i++) { 
                    if (matrix[start][i] == 1 && (!visited[i])) { 
                        queue.add(i); 
                        visited[i] = true; 
                    } 
                } 
    	}
    }
    
    public static void main(String args[]) {
    	System.out.println("Adjacency Metrix");
    	System.out.println();
    	Bfs_Algo graph = new Bfs_Algo(5);
    	graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.Bfs_Algorithm(0);
    }
}