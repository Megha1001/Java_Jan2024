package tree.childrenSumProperty;

import java.util.Queue;
import java.util.LinkedList;


/*
 * Problem : Children Sum property is a property in which the sum of values of the
 * left child and right child should be equal to the value of their nodes if both children
 * present , else if only one child is presen then the value of the child should be equal to its node value
 * 
 * in none of the child is present(return true for leaf or single node) or root is null then return true
 * 
 * TIME COMPLEXITY : O(N)
 * AUX SPACE : O(W),where w is width
 */


public class RecursiveSolution {

    static class Node{
        int data;
        Node left;
        Node right;


        Node(int data){
            this.data = data;
        }


    }

    public static void main(String args[]){
        Node root = new Node(20);
        root.left = new Node(8);
        root.right = new Node(12);

        root.right.left = new Node(3);
        root.right.right = new Node(9);

        // Node root = new Node(20);
        // root.left = new Node(8);
        // root.right = new Node(12);

        // root.right.left = new Node(3);
        // root.right.right = new Node(11);

        System.out.println("is the given tree satisfy children sum property ? "+checkChildrenSumProperty(root));

    }

    public static boolean checkChildrenSumProperty(Node root){
        
        //base cases
        if(root==null || (root.left==null && root.right == null)){ //SECOND CONDITION IS IMP
            return true;
        }

        int sum = 0;

        if(root.left != null){
            sum += root.left.data;
        }

        if(root.right != null){
            sum += root.right.data;
        }

        return (sum==root.data &&
                (checkChildrenSumProperty(root.left)) &&
                (checkChildrenSumProperty(root.right)));

    }
    
}
