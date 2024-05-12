package graphs.adjacencyList.cycleDetection;

import java.util.ArrayList;


/*
 * Approach : Do DFS traversal, if you encounter a vertex which is visited twice --> then there is a cycle. This approach has one catch. It has cycle only when the adjacent it not the parent of the vertex
 * from wher we start traversal
 *          1. Maintain a bool [] visited array.
 *          2. Do DFS traversal with adjacency matrix, visited bool array and Parent(-1-> starting)
 *          3. if Encounter any vertex who is already visited and its not its parent --> return true
 * 
 * 
 * FOR disconnected graph --> run the same algo for every disconnted component
 * 
 * TIME COMPLEXITY : O(V+E)
 */

public class DetectCycleUsingDFS {

    public static void main(String args[]){

        int V = 6;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i=0; i<V; i++){
            adj.add(new ArrayList<>());
        }

        addAnEdge(adj, 0, 1);

        addAnEdge(adj, 1, 2);
        // addAnEdge(adj, 1, 3);

        addAnEdge(adj, 2, 3);
        addAnEdge(adj, 2, 4);

        addAnEdge(adj, 4, 5);

        System.out.println("Is the given graph contains cycle ?"+detectCycle(adj, V));


    }

    public static boolean detectCycle(ArrayList<ArrayList<Integer>>adj, int V){
        boolean [] visited = new boolean[V];
        int parent = -1;

        for(int i=0; i<V; i++){
            if(!visited[i]){
                if(DFS(adj, visited, 0, parent)){
                    return true;
                }
            }
        }

        return false;
    }


    public static boolean DFS(ArrayList<ArrayList<Integer>>adj, boolean [] visited, int s, int parent){

        visited[s] = true;

        for(int u : adj.get(s)){
            if(!visited[u]){
                if(DFS(adj, visited, u, s)){
                    return true;
                }
            }
            else if(u!=parent){
                return true;
            }
        }

        return false;
    }

    public static void addAnEdge(ArrayList<ArrayList<Integer>>adj, int u, int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    
}
