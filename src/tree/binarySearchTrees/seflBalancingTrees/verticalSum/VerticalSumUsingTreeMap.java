package tree.binarySearchTrees.seflBalancingTrees.verticalSum;

/*
Approach
1. use any traversal while traversing if going on left do horizontal_heigh-1 and if going on right horizontal_heigh+1.
2. Maintain a treemap<Integer, Integer>, 1st represents hd and second sum.
3. Print the Map

Why using hasmap --> since it prints in sorted order

TIME CoMPLEXITY : O(NLoghd + hd), where hd is horizontal distance (O(loghd) --> work for every node, we can have hd nodes in tree map and insertion
in treemap is log operation), hd is traversal
hd-> total number of possible horizontal distances.

AUX SPACE : O(hd)
 */

import java.util.Map;
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

        getVerticalSum(root, hd, tm);

        //print treemap
        for(Map.Entry map : tm.entrySet()){
            System.out.print(map.getValue()+" ");
        }
    }

    public static void getVerticalSum(Node root, int hd, TreeMap<Integer, Integer> tm){

        if(root == null){
            return;
        }

        //left
        getVerticalSum(root.left, hd-1, tm);

        //node
        int currSum = tm.get(hd)==null ? 0 : tm.get(hd);
        tm.put(hd, currSum+root.data);

        //right
        getVerticalSum(root.right, hd+1, tm);
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
