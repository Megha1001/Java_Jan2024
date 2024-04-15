package tree.traversal.levelOrderTraversal.relatedQuestions;

import java.util.LinkedList;
import java.util.Queue;

/*
 * Approach :
 *  When you traverse last node of level  your next level will already be there in the queue.
 *  null indicates end of level marker
 * 
 * TIME COMPLEXITY : O(N+H), height can we ignored
 * Every node enqueu and deque exactly once, 
 * how much time to process extra nulls (O(H), we have H null , where H is height)
 * 
 * AUX SPACE : Theta(W), more specially , O(W+1(for null)) or O(N)--> for perfectly binary
 */

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
