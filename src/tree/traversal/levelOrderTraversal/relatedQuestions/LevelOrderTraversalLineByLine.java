package tree.traversal.levelOrderTraversal.relatedQuestions;

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


        Queue<Node> q = new ArrayDeque<>();

        q.add(root);
        q.add(new Node(-1)); //to find where to put new line , assuming -1 will never be present in that

        while(!q.isEmpty()){
            
            Node temp = q.poll();
            if(q.isEmpty()){
                break;
            }
            if(temp.data==-1){
                q.add(temp);
                System.out.println();
            }else{ //have data
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

    
}
