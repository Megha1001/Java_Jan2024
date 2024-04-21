package binarySearchTrees.search;

/*
 * TIME COMPLEXITY : O(H)
 * AUX SPACE : O(H)
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
        Node root = new Node(15);
        root.left = new Node(5);
        root.right = new Node(20);

        root.left.left = new Node(3);
        root.right.left = new Node(18);
        root.right.right = new Node(80);
        root.right.left.left = new Node(16);

        int search = 16;
        System.out.println("Is the search element present in BST ?"+isPresent(root, search));

    }
   
    
    public static boolean isPresent(Node root, int x){
        if(root == null){
            return false;
        }

        if(root.data == x){
            return true;
        }

        //search in left
        if(root.data > x){
            return isPresent(root.left, x);
        }

        //search in right
        if(root.data < x){
            return isPresent(root.right, x);
        }

        return false;
    }

}
