package graphs.adjacencyList.DFS;

import java.util.ArrayList;

/*
 * TIME COMPLEXITY : O(V+E)
 *
 * Reason for O(E) : we are visiting every edge (Total number of edges : 2E(undirected graph), E(directed graph))
 *
 * Why V : There might be the case when there are no edges all vertices are disconnected. In that case too we still run the outermost loop
 */



public class DFSOfDisconnectedGraph {
    public static void main(String[] args) {
        int V = 6;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(V);

        for(int i=0; i<V; i++){
            adj.add(new ArrayList<>());
        }

        addAnEdge(adj, 0, 1);
        addAnEdge(adj, 0, 2);

        addAnEdge(adj, 3, 4);

        System.out.println("DFS traversal of given adjacency list is : ");

        boolean [] visited = new boolean[V];

        for(int i=0; i<V; i++){
            if(!visited[i]){
                DFSOfDisconnectedGraph(adj, i, visited);
            }
        }
    }

    public static void DFSOfDisconnectedGraph(ArrayList<ArrayList<Integer>>adj, int s, boolean [] visited){

        visited[s] = true;
        System.out.print(s+" ");

        for(int u : adj.get(s)){
            if(!visited[u]){
                DFSOfDisconnectedGraph(adj, u, visited);
            }
        }

    }

    public static void addAnEdge(ArrayList<ArrayList<Integer>>adj, int u, int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
}
