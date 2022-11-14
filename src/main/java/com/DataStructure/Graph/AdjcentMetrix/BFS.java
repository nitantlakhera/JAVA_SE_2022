package com.DataStructure.Graph.AdjcentMetrix;

import java.util.LinkedList;

public class BFS {
    int matrix[][] =  new int[5][5];
	public void bfs_algo(int s) {
		boolean visited[] = new boolean[matrix.length];
	    LinkedList<Integer> queue = new LinkedList<Integer>();
	    visited[s] = true;
	    queue.add(s);
	    while(queue.size()!=0) {
	    	s =  queue.poll();
	    	System.out.println(s);
	    	for(int i =1 ; i<matrix.length ; i++) {
	    		if((matrix[s][i] == 1) && (! visited[i]))  {
	    			queue.add(i);
	    			visited[i] = true;
	    		}
	    	}
	    }
	}
	private boolean bfs(int[][] adjacencyMatrix, int source) {
        int numberOfNodes = adjacencyMatrix.length-1;
        int visited[] = new int[numberOfNodes+1];
        int top =   source;
        visited[source] =1;
        LinkedList<Integer> queue = new LinkedList<Integer>();
	    queue.add(source);
        boolean connected = true;
        while(!queue.isEmpty()){
            top = queue.remove();
            if(visited[top] == 0){
                visited[top] = 1;
            }
            for(int i=1; i<numberOfNodes+1;i++){
                if(adjacencyMatrix[top][i] == 1 && visited[i] == 0){
                    queue.add(i);
                    visited[i] =1;
                }
            }
        }
         
        for(int i=1; i<visited.length;i++){
            if(visited[i] == 0){
                connected = false;
            }
        }
        return connected;
    }
	public static void main(String args[]) {
		
	}
}
