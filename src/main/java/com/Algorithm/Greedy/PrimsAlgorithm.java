package com.Algorithm.Greedy;

/*
PRIM(G)
for i in G.V
  i.key = infinite

Select a node n and make its key 0 n.key=0

min_queue = G.V
q = NULL // queue to return

while !min_queue.is_empty
  u = min_queue.dequeue()
  for i in G.Adj[u]
    if i in min_queue and weight(u, i) < i.key
      i.key = weight(u, i)
      q.enqueue(i)
return q
*/

public class PrimsAlgorithm {

}
