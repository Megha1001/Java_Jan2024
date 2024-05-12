package graphs.adjacencyList.cycleDetection;

import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Arrays;

/*
 * Approach : Do BFS traversal, if you encounter a vertex which is visited twice --> then there is a cycle. This approach has one catch. It has cycle only when the adjacent it not the parent of the vertex
 * from wher we start traversal
 *          1. Maintain a bool [] visited array and parent array.
 *          2. Do DFS traversal with adjacency matrix, visited bool array and Parent(-1-> starting)
 *          3. if Encounter any vertex who is already visited and its not its parent --> return true
 * 
 * 
 * FOR disconnected graph --> run the same algo for every disconnted component
 * TIME COMPLEXITY : O(V+E)
 */

public class DetectCycleUsingBFS {

    public static void main(String args[]){

        int V = 6;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i=0; i<V; i++){
            adj.add(new ArrayList<>());
        }

        addAnEdge(adj, 0, 1);

        addAnEdge(adj, 1, 2);
        addAnEdge(adj, 1, 3);

        addAnEdge(adj, 2, 3);
        addAnEdge(adj, 2, 4);

        addAnEdge(adj, 4, 5);

        System.out.println("Is the given graph contains cycle ?"+detectCycle(adj, V));


    }

    public static boolean detectCycle(ArrayList<ArrayList<Integer>>adj, int V){
        boolean [] visited = new boolean[V];
        int [] parent = new int[V];
        Arrays.fill(parent, -1);

        for(int i=0; i<V; i++){
            if(!visited[i]){
                if(BFS(adj, visited, 0, parent)){
                    return true;
                }
            }
        }

        return false;
    }


    public static boolean BFS(ArrayList<ArrayList<Integer>>adj, boolean [] visited, int s, int[] parent){
        Queue<Integer> q = new LinkedList<>();
        q.offer(s);
        visited[s] = true;

        while(!q.isEmpty()){
            int p = q.poll();
            for(int u : adj.get(p)){
                if(!visited[u]){
                    visited[u] = true;
                    q.offer(u);
                    parent[u] = p;
                }
                else if(u!=parent[p]){
                    return true;
                }
            }
        }


        return false;
    }

    public static void addAnEdge(ArrayList<ArrayList<Integer>>adj, int u, int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    
}
