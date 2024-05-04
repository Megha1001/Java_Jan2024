package graphs.adjacencyList.BFS;

import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

/*
 * -> Approach 
Similar to traversal of BFS in case of given disconnected graph.
 */

public class NumberOfIslands {
    public static void main(String args[]){
        int V=9;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();

        for(int i=0; i<V; i++){
            adj.add(new ArrayList<Integer>());
        }

        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 1, 2);

        addEdge(adj, 3, 4);
        
        addEdge(adj, 5,6);
        addEdge(adj, 5,7);
        addEdge(adj, 7,8);

        
        System.out.println("Number of islands are : "+findNumOfIsland(adj, V));

    }

    public static int findNumOfIsland(ArrayList<ArrayList<Integer>>adj, int V){

        int res = 0;
        
        boolean visited[] = new boolean[V];

        for(int i=0; i<V; i++){
            if(!visited[i]){
                BFS(adj, i , visited);
                ++res;
            }
        }

        return res;

    }


    public static void BFS(ArrayList<ArrayList<Integer>>adj, int s, boolean[] visited){

        Queue<Integer> q = new LinkedList<>();
        visited[s] = true;

        q.offer(s);

        while(!q.isEmpty()){
            int x = q.poll();

            for(int y : adj.get(x)){
                if(!visited[y]){
                    visited[y] = true;
                    q.offer(y);
                }
            }
        }

    }

    public static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

}
