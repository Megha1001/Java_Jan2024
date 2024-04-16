package tree.sizeOfBinaryTree;

import java.util.Queue;
import java.util.LinkedList;

/*
 * TIME COMPLEXITY : O(N)
 * AUX SPACE : O(W), where w is width of binary tree
 */

public class IterativeSolution {
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

        root.left.left = new Node(40);
        root.left.right = new Node(50);

        root.right.right = new Node(60);

        System.out.println("The number of nodes tree has : "+calNumOfNodes(root));

    }

    public static int calNumOfNodes(Node root){
        int count = 0;

        if(root == null){
            return count;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            Node curr = q.poll();
            ++count;
            if(curr.left != null){
                q.add(curr.left);
            }
            if(curr.right != null){
                q.add(curr.right);
            }
        }


        return count;
    }
    
}
