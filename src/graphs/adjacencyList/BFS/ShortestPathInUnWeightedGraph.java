package graphs.adjacencyList.BFS;

import java.util.ArrayList;
import java.util.Arrays;

public class ShortestPathInUnWeightedGraph {

    public static void main(String[] args) {
        int V=4;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i=0; i<V; i++){
            adj.add(new ArrayList<>());
        }

        addAnEdge(adj, 0, 1);
        addAnEdge(adj, 0, 2);

        addAnEdge(adj, 1, 2);
        addAnEdge(adj, 1, 3);

        addAnEdge(adj, 2, 3);

        System.out.println("Shortest path for unweighted graph for each vertex is : ");

        boolean [] visited = new boolean[V];
        int dist[] = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        System.out.println();
//        printShortestPath(adj, visited, dist);

    }

    public static void addAnEdge(ArrayList<ArrayList<Integer>> adj, int u, int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

}
