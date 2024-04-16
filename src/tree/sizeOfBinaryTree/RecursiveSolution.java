package tree.sizeOfBinaryTree;

/*
 * TIME COMPLEXITY : O(N), traverserving every node exactly once.
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

        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);

        root.left.left = new Node(40);
        root.left.right = new Node(50);

        root.right.right = new Node(60);

        System.out.println("The number of nodes tree has : "+calNumOfNodes(root));

    }

    public static int calNumOfNodes(Node root){
        if(root == null){
            return 0;
        }
        else{
            return 1 + calNumOfNodes(root.left) + calNumOfNodes(root.right);
        }
    }
    
}
