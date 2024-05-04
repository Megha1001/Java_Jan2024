package graphs.adjacencyList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BredthFirstSearch {

    public static void main(String args){
        int V = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();

        for(int i=0; i<V;i++){
            adj.add(new ArrayList<>());
        }

        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 1, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 2, 3);
        addEdge(adj, 2, 4);
        addEdge(adj, 3, 4);

        System.out.println("BFS Traversal of adjency list is : ");
        breadthFirstTraversal(adj, V, 0);

    }

    public static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v){
        adj.get(u).get(v);
        adj.get(v).add(u);
    }

    public static void breadthFirstTraversal(ArrayList<ArrayList<Integer>>adj, int v, int s){

        /*
         * it shows that elements that needs to be are already enuqueue in queue;
         */
        boolean visited [] = new boolean[v];

        Queue<Integer> q = new LinkedList<>();
        visited[s] = true;
        q.offer(s);

        while(!q.isEmpty()){
            int x = q.poll();
            System.out.print(x+" ");
            for(int y : adj.get(x)){
                if(!visited[y]){
                    visited[y] = true;
                    q.offer(y);
                }
            }
        }

    }


}
