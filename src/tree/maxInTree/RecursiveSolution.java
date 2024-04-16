package tree.maxInTree;
/*
 * TIME COMPLEXITY : O(N)
 * AUX SPACE : O(H)
 * 
 * Pros : Have overhead when tree is skew
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

        Node root = new Node(20);
        root.left = new Node(80);
        root.right = new Node(30);
        
        root.right.left = new Node(40);
        root.right.right = new Node(50);

        System.out.println("Max element in given tree is "+findMax(root));

    }

    public static int findMax(Node root){
        if(root==null){
            return Integer.MIN_VALUE;
        }
        else{
            return Math.max(root.data, Math.max(findMax(root.left), findMax(root.right)));
        }
    }
}
