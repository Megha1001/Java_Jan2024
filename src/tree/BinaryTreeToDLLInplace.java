package tree;

public class BinaryTreeToDLLInplace {

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
        root.left = new Node(5);
        root.right = new Node(20);
        root.right.left = new Node(30);
        root.right.right = new Node(35);

        System.out.println("Converted DLL elemenet are :");
        Node head = convertBTToDLL(root);
        traverse(head);
    }
    
    /*
     * Consider inorder traversal
     */

    public static Node convertBTToDLL(Node root){
        if(root==null){
            return null;
        }


    }
    
}
