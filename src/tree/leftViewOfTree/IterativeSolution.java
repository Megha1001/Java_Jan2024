package tree.leftViewOfTree;

import java.util.Queue;
import java.util.LinkedList;
/*
 * Approach : 
 * line by line LEVEL order traversal 
 * 
 * TIME COMPLEXITY : O(N)
 * AUX SPACE : O(W) , where w is width
 */

public class IterativeSolution {

    public static int maxLevel = 0;

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

        root.right.left = new Node(40);
        root.right.right = new Node(50);

        System.out.println("The left view of binary tree is : ");
        printLeftView(root);
    }

    public static void printLeftView(Node root){
        
        if(root == null){
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
            int size = q.size();

            for(int i=0 ; i<size; i++){
                Node curr = q.poll();
                if(i==0){
                    System.out.print(curr.data+" ");
                }

                if(curr.left!=null){
                    q.add(curr.left);
                }

                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
        }
    
    }
    
}
