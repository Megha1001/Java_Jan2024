package tree.countNodesInCompleteBinaryTree;

/*
 * TIME coMPLEXITY : O(N)
 * AUX SPACE : O(H)
 */

public class NaiveSolution {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }

    public static void main(String args[]) 
    { 
        Node root=new Node(10);
    	root.left=new Node(20);
    	root.right=new Node(30);
    	root.right.left=new Node(40);
    	root.right.right=new Node(50);
    	
    	System.out.print(countNode(root));
    } 

    public static int countNode(Node root){
        if(root==null){
            return 0;
        }else{
            return 1 + countNode(root.right)+countNode(root.left);
        }
    }
    
}
