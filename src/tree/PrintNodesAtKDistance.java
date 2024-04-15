package tree;

/*
 * TIME COMPLEXITY : O(N) //might have to traverse all the nodes
 * AUX COMPLEXITY : O(H) //height of the tree
 */

public class PrintNodesAtKDistance {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }

    public static void main(String args[]){
        // Node root = new Node(10);
        // root.left = new Node(20);
        // root.left.left = new Node(40);
        // root.left.right = new Node(50);
        // root.right = new Node(30);
        // root.right.right = new Node(70);

        Node root = new Node(10);
        root.left = new Node(6);
        root.right = new Node(8);
        root.right.right = new Node(7);
        root.right.right.left = new Node(11);
        root.right.right.right = new Node(12);


        System.out.println("Nodes present at distance K are ");
        // printNodes(root, 3-1);
        printNodes(root, 0);
    
    }

    public static void printNodes(Node root, int k){

        if(root==null){
            return;
        }
        
        else if(k==0){
            System.out.print(root.data+" ");
            return;
        }
        else{
            printNodes(root.left, k-1);
            printNodes(root.right, k-1);
        }
    }

    
}
