package tree.traversal.levelOrderTraversal.relatedQuestions;

import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayDeque;

public class LevelOrderTraversalLineByLine {

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
        levelOrderTraveralLineByLine(root);

    }

    public static void levelOrderTraveralLineByLine(Node root){
        
        //base case
        if(root==null){
            return;
        }


        /*
         * ArrayDeque does not allow null elements to be added to the queue. When you attempt to add null to an ArrayDeque, 
         * it throws a NullPointerException. This behavior is different from LinkedList, which allows null elements.
         */
        Queue<Node> q = new LinkedList<>();

        q.add(root);
        q.add(null);

        while(q.size() > 1){
            
            Node temp = q.poll();
            if(temp==null){
                System.out.println();
                q.add(null);
                continue;
            }
            System.out.print(temp.data+" ");
            if(temp.left!=null){
                q.add(temp.left);
            }

            if(temp.right!=null){
                q.add(temp.right);
            }

        }

    }
    
}
