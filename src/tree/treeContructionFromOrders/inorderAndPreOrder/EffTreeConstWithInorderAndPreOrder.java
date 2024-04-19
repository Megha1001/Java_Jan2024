package tree.treeContructionFromOrders.inorderAndPreOrder;

import java.util.HashMap;

/*
* Using hashing to preprocess inorder traversal items
 * TIME COMPLEXITIES : O(N^)
 */
public class EffTreeConstWithInorderAndPreOrder {

     //preprocessing of inorder traversal
    public static HashMap<Integer, Integer> h = new HashMap<>();

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }


    public static void main(String args[]){
        int in[] ={20,10,40,30,50};
        int pre[] = {10,20,30,40,50};

        for(int i=0; i<in.length;i++){
            h.put(in[i], i);
        }

        System.out.println("The binary tree is : ");
        Node root = constructTree(in, pre, 0, pre.length-1);

        //do preorder traversal
        preOrderTraversal(root);
    }

    //LNR
    public static void preOrderTraversal(Node root){
       
        if(root!=null){
            preOrderTraversal(root.left);
            System.out.print(root.data+" ");
            preOrderTraversal(root.right);
        }


    }
    
    public static int preIndex=0; // to iterate through pre-order

    public static Node constructTree(int in[], int pre[], int is, int ie){

        if(is>ie){
            return null;
        }

        //consider element of pre-order as root
        Node root = new Node(pre[preIndex++]);

        //search root in inorder
        int inIndex=h.get(root.data);

        root.left = constructTree(in, pre, is, inIndex-1);
        root.right = constructTree(in, pre, inIndex+1, ie);

        return root;
    }
    
}
