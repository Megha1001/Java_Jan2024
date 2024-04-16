package tree.maxInTree;

import java.util.Queue;
import java.util.LinkedList;

/*
TIME COMPLEXITY : O(N)
AUX SPACE : O(W), where w is width
 *
 * Pros : Have overhead when tree is perfectly balanced

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

        Node root = new Node(20);
        root.left = new Node(80);
        root.right = new Node(30);
        
        root.right.left = new Node(40);
        root.right.right = new Node(50);

        System.out.println("Max element in given tree is "+findMax(root));

    }

    public static int findMax(Node root){
        int res = Integer.MIN_VALUE;
        if(root==null){
            return res;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            Node curr = q.poll();
            res = Math.max(res, curr.data);

            if(curr.left!=null){
                q.add(curr.left);
            }

            if(curr.right!=null){
                q.add(curr.right);
            }
        }

        return res;
       
    }
}
