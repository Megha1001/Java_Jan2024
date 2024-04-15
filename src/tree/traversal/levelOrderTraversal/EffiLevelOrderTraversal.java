package tree.traversal.depthFirst.levelOrderTraversal;

import java.util.Queue;
import java.util.ArrayDeque;

/*
 * TIME COMPLEXITY : O(N) oR THETA(N)
 *  -> for every node we do two operations
 *      -> enqueu (TC : O(1))
 *      -> Dequeue (TC : O(1))
 * 
 * 
 * AUX SPACE : O(W), where w is width of binary tree
 *  *  We have (atmost one next level) already in the queue --> so AS : O(WIDTH oF BiNARY TREE)
 *  sometimes O(1)-> skew tree
 * 
 * In perfect binary tree : N/2 nodes will be at last level
 * so in general , O(N)
 * 
 * 
 */

public class EffiLevelOrderTraversal {
    
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }


    public static void main(String args[]){
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(8);
        root.left.right = new Node(7);
        root.right.right = new Node(6);
        root.left.right.left = new Node(9);
        root.left.right.right = new Node(15);

        System.out.println("the level order traversal for given tree is ");
        levelOrderTraversal(root);

    }


    public static void levelOrderTraversal(Node root){

        if(root==null){
            return;
        }

        Queue<Node> q = new ArrayDeque<>();
        q.add(root);


        while(!q.isEmpty()){
            Node curr = q.poll();

            System.out.print(curr.data+" ");

            //check for left child
            if(curr.left != null){
                q.add(curr.left);
            }

            //check for right child
            if(curr.right != null){
                q.add(curr.right);
            }
        }


    }



}
