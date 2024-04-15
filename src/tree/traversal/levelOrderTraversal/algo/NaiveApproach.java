package tree.traversal.levelOrderTraversal.algo;

/*
 * Approach
 * 1. Find height of binary tree : O(h)
 * 2. run a loop from k = 0-> h-1
 *  - print nodes at k distance -> O(N)
 * 
 * TIME COMPLEXITY : O(N*H + H) = O(NH)
 */

public class NaiveApproach {
    
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
        if(root == null){
            return;
        }

        int height = calHeight(root);

        for(int k=0; k<height; k++){
            printNodes(root, k);
        }
    }

    public static void printNodes(Node root, int k){
        if(root==null){
            return;
        }
        if(k==0){
            System.out.print(root.data+" ");
            return;
        }else{
            printNodes(root.left, k-1);
            printNodes(root.right, k-1);
        }
    }

    public static int calHeight(Node root){
        if(root == null){
            return 0;
        }else{
           return  Math.max(calHeight(root.left), calHeight(root.right)) + 1;
        }
    }


}