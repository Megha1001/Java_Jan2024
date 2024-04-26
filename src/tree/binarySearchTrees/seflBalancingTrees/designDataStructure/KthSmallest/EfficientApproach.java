package tree.binarySearchTrees.seflBalancingTrees.designDataStructure.KthSmallest;

/*
Augmented tree : Maintain  lCount of nodes in the left subtree
    1. Compare (lCount+1) with K
        -> If same, return root
        -> if greater, recur for left subtree with same K
        -> if smaller, recur for right subtree with K as (k-lCount-1)

    HOW TO MAINTAIN lCount
    -> Insertion (insert x)
        -> compare with root --> if x < root.key then only increment lCount of root and do that until we find correct position to insert
    -> Deletion(delete x)
        -> compare with root --> if x <root.key then only decrement lCount of root and do that until we delete the actual.
 */
public class EfficientApproach {

    static class Node
    {
        int key;
        Node left;
        Node right;

        int lCount;
        Node(int k, int ){
            key=k;
            lCount=0;
        }
    }
    public static void main(String[] args) {
        Node root=new Node(15);
        root.left=new Node(5);
        root.left.left=new Node(3);
        root.right=new Node(20);
        root.right.left=new Node(18);
        root.right.left.left=new Node(16);
        root.right.right=new Node(80);
        int k=3;

        System.out.print("Kth Smallest: ");
        printKth(root,k);
    }

    public static void printKth(Node root, int k){

    }
}
