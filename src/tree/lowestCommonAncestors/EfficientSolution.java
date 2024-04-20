package tree.lowestCommonAncestors;

/*
 * 1. Require one traversal and O(H) extra space for the recursive traversal
 * 2. Assume  that both n1 and n2 exist in the tree. Does not give corect result when only(n1 or n2)exist-> in that case it would return reference to present one
 * 
 * IDEA
 *  1. We do normal traversal . We have the following cases for every node
 *  - If its same as n1 or n2
 *  - If one of its subtree contains n1 and other contains n2
 *  - If one of its subtree contains n1 and n2 both
 *  - If none of its subtree contains any of n1 and n2;
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

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);

        root.right.left = new Node(40);
        root.right.right = new Node(50);

        int n1=20;
        int n2=50;

        System.out.println("the LCA from n1 and n2 is : "+findLCA(root, n1,n2).data);
    }

    public static Node findLCA(Node root, int n1, int n2){

        if(root==null){
            return root;
        }

        if(root.data == n1 || root.data==n2){
            return root;
        }

        Node lca1 = findLCA(root.left, n1,n2);
        Node lca2 = findLCA(root.right, n1,n2);

        if(lca1!=null && lca2!=null){
            return root;
        }

        if(lca1!=null){
            return lca1;
        }else{
            return lca2;
        }

    }
}
