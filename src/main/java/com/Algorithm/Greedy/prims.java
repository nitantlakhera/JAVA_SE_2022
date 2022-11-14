package com.Algorithm.Greedy;

public class prims {

	private int vertices;

	public prims(int vertices) {
		this.vertices = vertices;
	}
	public int minKey(int[] key, boolean[] mstSet) {

		int min = Integer.MAX_VALUE;
		int minIndex = -1;
		for(int v = 0; v < vertices; v++) {
			if(!mstSet[v] && key[v] <= min) {
				min = key[v];
				minIndex = v;
			}
		}
		return minIndex;
	}
	public void printMST(int parent[], int n, int[][] graph) {
		System.out.println("Edge   Weight");
		for (int i = 1; i < vertices; i++) {
			System.out.println(parent[i] + " - " + i + "  " + graph[i][parent[i]]);
		}
	}
	
	public void primMST(int[][] graph) {
		
		int parent[] = new int[vertices];
		int key[] = new int [vertices];
		
		boolean mstSet[] = new boolean[vertices];
		
		for(int i = 0; i < vertices; i++) {
			key[i] = Integer.MAX_VALUE;
			mstSet[i] = false;
		}
        
		key[0] = 0;
		
		parent[0] = -1;
		
		for (int count = 0; count < vertices - 1; count++) {

			int u = minKey(key, mstSet);
			mstSet[u] = true;
			for (int v = 0; v < vertices; v++) {
				if (graph[u][v] != 0 && !mstSet[v] && graph[u][v] <  key[v]) {
					parent[v]  = u;
					key[v] = graph[u][v];
				}
			}
		}
		printMST(parent, vertices, graph);
	}
	/*
	Input graph
	        8       7
	    1 ---- 2 ----- 3
	   /|      |\      |\
	4 / |     2| \4  14| \9
	 /  |      |  \    |  \
	0   |11    8   \   |   4
	 \  |    / |    \  |  /
	8 \ |  7/  |6    \ | /10
	   \|  /   |      \|/
	    7 ---- 6 ----- 5
	        1      2
	*/
	public static void main(String[] args) {
        
		int graph[][] = new int[][]{{0, 4, 0, 0, 0, 0, 0, 8, 0},
									{4, 0, 8, 0, 0, 0, 0, 11, 0},
									{0, 8, 0, 7, 0, 4, 0, 0, 2},
									{0, 0, 7, 0, 9, 14, 0, 0, 0},
									{0, 0, 0, 9, 0, 10, 0, 0, 0},
									{0, 0, 4, 14, 10, 0, 2, 0, 0},
									{0, 0, 0, 0, 0, 2, 0, 1, 6},
									{8, 11, 0, 0, 0, 0, 1, 0, 7},
									{0, 0, 2, 0, 0, 0, 6, 7, 0}};

		prims pa = new prims(9);
		pa.primMST(graph);
	}
	/*
	MST
	
	   (4)    (4)     (7)
	    1      2 ----- 3
	   /       |\       \
	  /        | \       \
	 /         |  \       \
	0(0)    (2)8   \       4(9)
	 \              \
	  \              \
	   \              \
	    7 ---- 6 ----- 5
	   (8)    (1)     (2)
	*/
}