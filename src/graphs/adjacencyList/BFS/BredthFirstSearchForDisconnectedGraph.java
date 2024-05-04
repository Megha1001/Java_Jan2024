package graphs.adjacencyList.BFS;

import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

/*
 * TIME COMPLEXITY : O(V+E)
 * 
 * Reason for O(E) : we are visiting every edge (Total number of edges : 2E(undirected graph), E(directed graph))
 * 
 * Why V : There might be the case when there are no edges all vertices are disconnected. In that case too we still run the outermost loop
 */


public class BredthFirstSearchForDisconnectedGraph {
    
    public static void main(String args[]){
        int V = 7;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();

        for(int i=0; i<V; i++){
            adj.add(new ArrayList<>());
        }

        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 2, 3);

        addEdge(adj, 4, 5);
        addEdge(adj, 4, 6);
        addEdge(adj, 5, 6);


        /*
         * Approach :- DO BFS for every disconnected graph
         * WIll check for every vertex for the possibility if that is disconnected if that is the case do BFS
         */

        boolean visited[] = new boolean[V];
        for(int i=0; i<V; i++){
            if(!visited[i]){
                BFS(adj, i, visited);
            }
        }
    
    }

    public static void BFS(ArrayList<ArrayList<Integer>> adj, int s, boolean [] visited){
        Queue<Integer> q = new LinkedList<>();
        visited[s] = true;
        q.offer(s);

        while(!q.isEmpty()){
            int x = q.poll();
            System.out.print(x +" ");
            for(int y : adj.get(x)){
                if(!visited[y]){
                    visited[y] = true;
                    q.add(y);
                }
            }
        
        }


    }

    public static void addEdge(ArrayList<ArrayList<Integer>>adj, int u, int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

}
