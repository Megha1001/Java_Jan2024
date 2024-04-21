package tree.traversal.levelOrderTraversal.iterativeSolution;

import java.util.Stack;

/*
 * TIME COMPLEXITY : O(N)
 * AUX SPACE : O(H)
 */

public class PreOrderTraversalMethod1 {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }

    public static void main(String args[]){
        int arr[] ={10,20,40,80,-1,-1,90,-1,-1,50,-1,-1,30,60,-1,-1,70,-1,-1};

        Node root = buildTree(arr);

        System.out.println("The preorder traversal iteratively is ");
        preOrderTraversal(root);

    }

    public static void preOrderTraversal(Node root){
        Stack<Node> s = new Stack<>();

        Node curr = root;
        while(curr!=null || !s.isEmpty()){
            while(curr!=null){
                System.out.print(curr.data+" ");
                s.push(curr);
                curr = curr.left;
            }

            curr = s.pop();
            curr = curr.right;
        } 

    }
    
    public static int idx = -1;
    public static Node buildTree(int []arr){
        ++idx;
        if(arr[idx]==-1){
            return null;
        }

        Node newNode = new Node(arr[idx]);
        newNode.left = buildTree(arr);
        newNode.right = buildTree(arr);

        return newNode;
    }
}
