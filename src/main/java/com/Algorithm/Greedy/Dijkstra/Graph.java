package com.Algorithm.Greedy.Dijkstra;

import java.util.ArrayList;
import java.util.List;

public class Graph {
		List<List<Edge>> adjList = null;
		Graph(List<Edge> edges, int N)
		{
			adjList = new ArrayList<>(N);
			for (int i = 0; i < N; i++) {
				adjList.add(i, new ArrayList<>());
			}
			for (Edge edge: edges) {
				adjList.get(edge.source).add(edge);
			}
	    }	
}