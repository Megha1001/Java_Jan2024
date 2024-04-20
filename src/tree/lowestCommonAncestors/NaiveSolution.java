package tree.lowestCommonAncestors;

/*
Approach :
1. find the path arrays for both inputs
    p1 = {a1,a2,a3,x}
    p2 = {a1,a2,y}
2. iterate through both the arraylist and return the previous index where you found the elements in both array are not simple

TIME COMPLEXITY : O(N)[for first findPath](for skew) + O(N)[for second findPath](for skew) + O(N-1)[traverse of arraylist] = O(N)

Three traversal for binary tree
 */

import java.lang.reflect.Array;
import java.util.ArrayList;

public class NaiveSolution {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);

        root.right.left = new Node(40);
        root.right.right = new Node(50);

        int n1=20;
        int n2=50;

        System.out.println("the LCA from n1 and n2 is : "+findLCA(root, n1,n2));
    }

    public static int findLCA(Node root, int n1, int n2){
        ArrayList<Node> p1 = new ArrayList<>();
        ArrayList<Node> p2 = new ArrayList<>();

        //not able to found any of the path
        if(!findPath(root, p1, n1) || !findPath(root, p2, n2)){
            return -1;
        }

        for(int i=0; i<p1.size()-1 && i<p2.size()-1;i++){
            if(p1.get(i+1) != p2.get(i+1)){
                return p1.get(i).data;
            }
        }

        return -1;
    }

    public static boolean findPath(Node root, ArrayList<Node>p, int n){
        if(root==null){
            return false;
        }
        p.add(root);
        if(root.data==n){
            return true;
        }

        if(findPath(root.left, p, n) || findPath(root.right, p, n)){
            return true;
        }

        p.remove(p.size() - 1);

        return false;
    }
}
