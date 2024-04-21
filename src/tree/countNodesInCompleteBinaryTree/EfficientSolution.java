package tree.countNodesInCompleteBinaryTree;

/*
 * TIME coMPLEXITY : O(logN(base 3/2) * LogN(base2))
 * T(N) = T(2N/3)+O(H)
 * AUX SPACE : O(H)
 * 
 * This use the fact that its complete binary tree
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
       }
    
       int lh = 0, rh = 0;
       Node curr = root;

       //left subtree
       while(curr!=null){
        ++lh;
        curr = curr.left;
       }

       curr = root;

       //right subtree
       while(curr!=null){
        ++rh;
        curr = curr.right;
       }

       if(lh==rh){
        return (int) (Math.pow(2,lh)-1);
       }

       return 1+countNode(root.left) + countNode(root.right);


    }
    
}
