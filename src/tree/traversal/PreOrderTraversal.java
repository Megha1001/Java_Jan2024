package tree.traversal;

/*
 * TIME COMPLEXITY : O(N) --> constant amount of work for every node
 * AUX SPACE : O(Height of Tree) [Exact : O(H+1) , 1 for null]
 */

public class PreOrderTraversal {

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
        

        System.out.println("The inorder traversal for given tree is : ");
        inOrderTraversal(root);
    }

    public static void inOrderTraversal(Node root){
        if(root!=null){
            System.out.print(root.data +" ");
            inOrderTraversal(root.left);
            inOrderTraversal(root.right);
        }
    }
    
}
