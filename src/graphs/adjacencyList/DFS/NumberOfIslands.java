package graphs.adjacencyList.DFS;

import java.util.ArrayList;

public class NumberOfIslands {

    public static void main(String[] args) {
        int V = 6;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(V);

        for(int i=0; i<V; i++){
            adj.add(new ArrayList<>());
        }

        addAnEdge(adj, 0, 1);
        addAnEdge(adj, 0, 2);

        addAnEdge(adj, 3, 4);

        boolean [] visited = new boolean[V];
        int count = 0;

        for(int i=0; i<V; i++){
            if(!visited[i]){
                DFSOfDisconnectedGraph(adj, i, visited);
                ++count;
            }
        }
        System.out.println("Number of islands are : "+count);
    }

    public static void DFSOfDisconnectedGraph(ArrayList<ArrayList<Integer>>adj, int s, boolean [] visited){
        visited[s] = true;

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
