package tree.balancedTrees;

/*
 * Approach : 
 *  Write a function that will return -1 if tree is not balanced otherwise return height of the node. At any point we got -1 immediately return -1 that indicates tree is not balanced
 * 
 * TIME COMPLEXITY : O(N)
 */

public class EfficientSolution {

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
//        root.right.right.right = new Node(70);
        System.out.println("is the given tree balanced ? "+(isBalanced(root)==-1?false: true));
    }

    public static int isBalanced(Node root){

        if(root == null){
            return 0; //height
        }

        int lh = isBalanced(root.left);
        if(lh==-1){
            return -1; //not balanced
        }

        int rh = isBalanced(root.right);
        if(rh==-1){
            return -1; // not balanced
        }

        //subtree are balanced check for current node
        if(Math.abs(lh-rh)>1){
            return -1 ;//not balanced
        }
        
        return Math.max(lh, rh)+1; //return valid height


    }
    
}
