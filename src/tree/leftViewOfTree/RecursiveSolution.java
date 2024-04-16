package tree.leftViewOfTree;

/*
 * Approach : 
 *  If we do pre-order traversal of binary tree we are always going to visit leftmost node first before any other node of that level.
 *  While doing preorder traversal we maintain two extra variables
 *      - maxLevel  --> seen visited so far, initialize as zero
 *      - Level --> curr level
 * 
 * TIME COMPLEXITY : O(N)
 * AUX SPACE : O(H)
 */

public class RecursiveSolution {

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
        printLeftView(root, 1);
    }


    /*
     * Using inorder traversal
     */
    public static void printLeftView(Node root, int level){

        if(root == null){
            return;
        }

        if(maxLevel < level){
            System.out.print(root.data+" ");
            maxLevel = level;
        }

        printLeftView(root.left, level+1);
        printLeftView(root.right, level+1);



    }
    
}
