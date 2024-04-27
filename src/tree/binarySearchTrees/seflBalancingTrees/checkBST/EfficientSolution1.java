package tree.binarySearchTrees.seflBalancingTrees.checkBST;

/*
Approach :
1. Pass a range for every node.
2. For root, range is -∞ to +∞
3. for left  child of a node , in range we change the upper bound as the node's value
4. For right child of a node, in range we change the lower bound as the node's value.

TIME COMPLEXITY : O(N)

 */
public class EfficientSolution1 {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }


    public static void main(String[] args) {
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(5);
        root.left.left = new Node(1);
//        root.left.right = new Node(3);
        root.left.right = new Node(100);

        System.out.println(" does the given tree is bst ? "+isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
    }

    public static boolean isBST(Node root, int min, int max){

        if(root==null){
            return true;
        }

        return (root.data > min && root.data < max)
                && isBST(root.left, min, root.data)
                && isBST(root.right, root.data, max);

    }
}
