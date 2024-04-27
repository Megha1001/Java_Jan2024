package tree.binarySearchTrees.seflBalancingTrees.verticalSum;

/*
Approach
1. use any traversal while traversing if going on left do horizontal_heigh-1 and if going on right horizontal_heigh+1.
2. Maintain a treemap<Integer, Integer>, 1st represents hd and second sum.
3. Print the Map

Why using hasmap --> since it prints in sorted order
 */

import java.util.TreeMap;

public class VerticalSumUsingTreeMap {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data= data;
        }
    }

    public static void main(String[] args) {
        //preorder
        int arr[] = {10,20,30,-1,-1,40,-1,-1,50,-1,-1};

        Node root = buildTree(arr);

        //horizontal distance
        int hd = 0;
        TreeMap<Integer, Integer> tm = new TreeMap<>();

        printVerticalSum(root, hd, tm);
    }

    public static void printVerticalSum(Node root, int hd, TreeMap<Integer, Integer> tm){

        if(root == null){
            return;
        }

        //left
        printVerticalSum(root.left, hd-1, tm);

        //node
        int currSum = tm.get(hd)==null ? 0 : tm.get(hd);
        tm.put(hd, currSum+root.data);

        //right
        printVerticalSum(root.right, hd+1, tm);

    }


    public static int idx = -1;

    public static Node buildTree(int arr[]){
        ++idx;
        if(arr[idx]==-1)
            return null;
        Node newNode = new Node(arr[idx]);
        newNode.left = buildTree(arr);
        newNode.right = buildTree(arr);
        return newNode;
    }
}
