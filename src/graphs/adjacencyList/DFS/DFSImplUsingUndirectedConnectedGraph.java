package graphs.adjacencyList.DFS;

import java.util.ArrayList;

/*
Approach : Will visit source, then will visit its adjacent
then visit all the reachable point from that adjacent
 */

public class DFSImplUsingUndirectedConnectedGraph {
    public static void main(String[] args) {
        int V=7;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(V);

        for(int i=0; i<V; i++){
            adj.add(new ArrayList<>());
        }

        addAnEdge(adj, 0, 1);
        addAnEdge(adj, 0, 4);

        addAnEdge(adj, 1, 2);

        addAnEdge(adj, 2, 3);

        addAnEdge(adj, 4, 5);
        addAnEdge(adj, 4, 6);

        addAnEdge(adj, 5, 6);

        System.out.println("DFS of given adjacency list is : ");
        boolean [] visited = new boolean[V];
        DFSTraversal(adj, 0, visited);

    }

    public static void DFSTraversal(ArrayList<ArrayList<Integer>>adj, int s, boolean [] visited){
        v

    }

    public static void addAnEdge(ArrayList<ArrayList<Integer>>adj, int u, int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
}
