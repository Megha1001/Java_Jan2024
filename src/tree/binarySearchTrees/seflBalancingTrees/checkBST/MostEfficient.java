package tree.binarySearchTrees.seflBalancingTrees.checkBST;

/*
A binary tree is a BST iff its inorder traversal is in increasing order.
 */
public class MostEfficient {
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
            root.left.right = new Node(3);
//          root.left.right = new Node(100);

            System.out.println(" does the given tree is bst ? "+isBST(root));
        }

        public static int prev = Integer.MIN_VALUE;
        public static boolean isBST(Node root){

            if(root==null){
                return true;
            }

            //go in left
            if(!isBST(root.left)){
                return false;
            }

            if(prev >= root.data){
                return false;
            }

            prev = root.data;

            return isBST(root.right);


        }
}
