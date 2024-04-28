package tree.binarySearchTrees.seflBalancingTrees.verticalTraversal;

import java.lang.reflect.Array;
import java.util.*;

/*
Approach :
Use vertical sum concept. Instead of storing the sum store the list of elements
TreeMap<Integer, ArrayList<Integer>>

NOte : NO OtHER TRAVERSAL WOULD WORK
 */
public class VerticalTraversalUsingTreeMapAndLevelOrderTraversal {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }

    static class Pair{
        Node node;
        int hd;

        Pair(Node node, int hd){
            this.node = node;
            this.hd = hd;
        }
    }

    public static void main(String[] args) {
        //pre-order
//        int [] arr= {10,20,-1,-1,30,40,-1,-1,50,-1,-1};
        int [] arr= {1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,7,8,9,-1,-1,-1,-1};
        Node root = buildTree(arr);

        populateMap(root);

        for(Map.Entry<Integer, ArrayList<Integer>> map : tm.entrySet()){
            map.getValue().stream().forEach(e -> System.out.print(e+" "));
            System.out.println();
        }
    }

    public static TreeMap<Integer, ArrayList<Integer>> tm = new TreeMap<>();
    public static void populateMap(Node root){
        //LEVEL order traversal
        //Queue will store a Pair (Node, hd)
        Queue<Pair> q = new LinkedList<Pair>();


        q.add(new Pair(root, 0));

        while(!q.isEmpty()){
            Pair p = q.poll();
            Node curr = p.node;
            int hd = p.hd;

            if(tm.containsKey(hd)){
                tm.get(hd).add(curr.data);
            }else{
                ArrayList<Integer> al = new ArrayList<>();
                al.add(curr.data);
                tm.put(hd, al);
            }

            if(curr.left!=null){
                q.add(new Pair(curr.left, hd-1));
            }

            if(curr.right!=null){
                q.add(new Pair(curr.right, hd+1));
            }
        }


    }

    public static int idx = -1;
    public static Node buildTree(int []arr){
        ++idx;
        if(arr[idx]==-1){
            return null;
        }

        Node newNode = new Node(arr[idx]);
        newNode.left = buildTree(arr);
        newNode.right = buildTree(arr);

        return newNode;
    }

}
