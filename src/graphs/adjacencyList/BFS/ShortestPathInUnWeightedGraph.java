package graphs.adjacencyList.BFS;

/*
APPROACH :
1. We do BFS in shortest path only. since we first visit vertex that are 1 distance away then 2 distance away and so on

TIME COMPLEXITY : Is same as BFS
what extra we are doing => maintaining distance array --> for that O(V)
TOTAL TC : O(V+E+V) = O(V+E)
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

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
        printShortestPath(adj, visited, dist, 0);

    }

    public static void printShortestPath(ArrayList<ArrayList<Integer>>adj, boolean[] visited, int[] dist, int s){
        Queue<Integer> q = new LinkedList<>();
        visited[s] = true;
        dist[s] = 0;
        q.offer(s);

        while(!q.isEmpty()){
            int p = q.poll();
            for(int v : adj.get(p)){
                if(!visited[v]){
                    visited[v] = true;
                    dist[v] = dist[p]+1; //+1 since its adjacent to p;
                    q.offer(v);
                }
            }
        }

        Arrays.stream(dist).forEach(System.out::println);

    }

    public static void addAnEdge(ArrayList<ArrayList<Integer>> adj, int u, int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

}
