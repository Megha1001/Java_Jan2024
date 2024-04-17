package tree.widthOfTree;

import java.util.Queue;
import java.util.LinkedList;

/*
 * use solution of printing left view iterative solution
 * 
 * TIME COMPLEXITY : THeta(N) , every nodes goes into the queue once
 * AUX SPACE : O(W) , where w is width or O(N)[in prefect binary tree, N/2]
 */

public class NaiveSolution {

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
       root.right.right.right = new Node(70);

        System.out.println("Width of given tree is ? "+findWidth(root));
    }

    public static int findWidth(Node root){
        int res = 0;
        
        if(root==null){
            return res;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int size = q.size();

            res = Math.max(res, size);

            for(int i=0; i<size;i++){
                Node temp = q.poll();

                if(temp.left!=null){
                    q.add(temp.left);
                }
                if(temp.right!=null){
                    q.add(temp.right);
                }
            }
            
        }
        return res;

    }
    
}
