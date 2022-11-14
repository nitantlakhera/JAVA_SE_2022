package com.Algorithm.Greedy.Dijkstra;

import java.util.Arrays;
import java.util.List;

public class Test {
   public static void main(String args[]) {
	   List<Edge> edges = Arrays.asList(
				new Edge(0, 1, 10), new Edge(0, 4, 3),
				new Edge(1, 2, 2), new Edge(1, 4, 4),
				new Edge(2, 3, 9), new Edge(3, 2, 7),
				new Edge(4, 1, 1), new Edge(4, 2, 8),
				new Edge(4, 3, 2)
		);
	   int numberOfVertex = 5;
	   Graph graph = new Graph(edges, numberOfVertex);
       Dijkstra.shortestPath(graph, 0, numberOfVertex);
   }
}
