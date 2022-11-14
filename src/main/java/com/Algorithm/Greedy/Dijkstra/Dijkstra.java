package com.Algorithm.Greedy.Dijkstra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Dijkstra {
 
	public static void shortestPath(Graph graph, int source , int N) {
		PriorityQueue<Node> minHeap = new PriorityQueue<Node>((lhs, rhs) -> lhs.weight - rhs.weight);
	    minHeap.add(new Node(source, 0));
	    List<Integer> dist = new ArrayList<Integer>(Collections.nCopies(N, Integer.MAX_VALUE));
	    dist.set(source, 0);
	    boolean[] done = new boolean[N];
		done[0] = true;
		int prev[] = new int[N];
		prev[0] = -1;
	    while(!minHeap.isEmpty()) {
	    	Node node = minHeap.poll();
	    	int u = node.vertex;
	    	for(Edge edge : graph.adjList.get(u)) {
	    		int v = edge.destination;
	    		int weight = edge.weight;
	    		if(!done[v]&&(dist.get(u)+weight) < dist.get(v)) {
	    			dist.set(v, dist.get(u)+ weight);
	    			prev[v] =  u;
	    			minHeap.add(new Node(v, dist.get(v)));
	    		}
	    	}
	    	done[u] = true;
	    }
	    
	    for (int i = 1; i < N; ++i)
		{
			System.out.print("Path from vertex 0 to vertex " + i +
							" has minimum cost of " + dist.get(i) +
							" and the route is [ ");
			printRoute(prev, i);
			System.out.println("]");
		}   
	}
	
	private static void printRoute(int prev[], int i)
	{
		if (i < 0)
			return;

		printRoute(prev, prev[i]);
		System.out.print(i + " ");
	}
}
