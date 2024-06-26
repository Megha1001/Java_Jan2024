package tree.balancedTrees;
/*
Balanced Tree : Math.abs (Height(Left sub tree) - Height(Right Sub tree)) <=1

TIME COMPLEXITY : O(N^2)

Calling height func for every node of left sub tree and right sub tree (except root) so basically height function will be executed N-1 times for N-1 nodes --> Overall O(N^2)
*/

public class NaiveRecursiveSolution{
    
    
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
        root.right.right.right = new Node(60);
        
        System.out.println("Is the given tree balanced ?"+isBalancedTree(root));
    }
    
    public static boolean isBalancedTree(Node root){
        if(root==null){
            return true;
        }
        
        int hLSB = height(root.left);
        int hRSB = height(root.right);
        
        return ((Math.abs(hLSB-hRSB)<=1) && (isBalancedTree(root.left)) && (isBalancedTree(root.right)));
    }
    
    
    public static int height(Node root){
        if(root==null){
            return 0;
        }
        else{
           return  1 + Math.max(height(root.left),height(root.right));
        }
    }
    
}
