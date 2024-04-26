package tree.binarySearchTrees.seflBalancingTrees.designDataStructure;
/*
Augmented tree : Maintain  lCount of nodes in the left subtree

Augmenting is simply changing the existing data structure to solve our problem

    1. Compare (lCount+1) with K
        -> If same, return root
        -> if greater, recur for left subtree with same K
        -> if smaller, recur for right subtree with K as (k-lCount-1)

    HOW TO MAINTAIN lCount
    -> Insertion (insert x)
        -> compare with root --> if x < root.key then only increment lCount of root and do that until we find correct position to insert(if going to right dont do anything)
    -> Deletion(delete x)
        -> compare with root --> if x <root.key then only decrement lCount of root and do that until we delete the actual.(if going to right dont do anything)
 */

public class DataStructureToSupportInsertAndKthSmallest {

    static class Node{
        int data;
        Node left;
        Node right;
        int lCount;

        Node(int x){
            this.data = x;
        }
    }


    public static Node insert(Node root, int x){
        Node newNode = new Node(x);

        if(root==null){
            return newNode;
        }

        else if(root.data < x){
            //insert in right
            root.right = insert(root.right, x); // DONT MiSS TO LINK IT !!!!!
        }else {
            root.lCount++;
            root.left =  insert(root.left, x);
        }
        return root;

    }

    public static Node kthSmallest(Node root, int k){

        int count = root.lCount+1;

        if(count==k){
            return root;
        }

        else if(count < k){
            //on right
            return kthSmallest(root.right, k - count);
        }

        else{
            //on left
            return kthSmallest(root.left, k);
        }

    }

    public static void main(String[] args) {
        Node root = null;
        int keys[] = { 20, 8, 22, 4, 12, 10, 14 };

        for (int x : keys)
            root = insert(root, x);

        int k = 4;
        Node res = kthSmallest(root, k);
        if (res == null)
            System.out.println("There are less "
                    + "than k nodes in the BST");
        else
            System.out.println("K-th Smallest"
                    + " Element is " + res.data);
    }
}
