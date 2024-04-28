package tree.binarySearchTrees.seflBalancingTrees.bottomView;

import tree.binarySearchTrees.seflBalancingTrees.topView.PrintTopView;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class PrintBottomView {

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

    public static int idx=-1;
    public static Node contructTree(int arr[]){
        ++idx;
        if(arr[idx]==-1){
            return null;
        }

        Node newNode = new Node(arr[idx]);
        newNode.left = contructTree(arr);
        newNode.right = contructTree(arr);

        return newNode;

    }

    public static void main(String[] args) {
        //preorder
        int [] arr = {10,20,40,-1,-1,50,-1,-1,30,-1,-1};

        Node root = contructTree(arr);

        printBottomView(root);
    }

    public static void printBottomView(Node root){

        if(root==null){
            return;
        }

        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));

        TreeMap<Integer, Integer> tm = new TreeMap<>();

        while(!q.isEmpty()){
            Pair p = q.poll();
            Node curr = p.node;
            int hd = p.hd;

            tm.put(hd, curr.data); //we have to override

            if(curr.left!=null){
                q.add(new Pair(curr.left, hd-1));
            }

            if(curr.right!=null){
                q.add(new Pair(curr.right, hd+1));
            }
        }

        //traverse
        for(Map.Entry<Integer, Integer> map : tm.entrySet()){
            System.out.print(map.getValue()+ " ");
        }

    }

}
