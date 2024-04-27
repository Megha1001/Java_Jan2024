package tree.binarySearchTrees.seflBalancingTrees.checkBST;

/*
Approach : for every node
    1. find max in left subtree
    2. find min in right subtree
    3. root.data > max && root.data < min
 */


public class EfficientApproach1 {

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
        root.left.right = new Node(100);

        if(isBST(root)==1){
            System.out.println("Its a BST");
        }else{
            System.out.println("It is Not BST");
        }
    }


    public static int isBST(Node root){
        if(root==null){
            return 1;
        }

        //compare with max value on left subtree
        if(root.left!=null && maxValue(root.left) > root.data){
            return 0;
        }


        //compare with min value on right subtree
        if(root.right!=null && minValue(root.right) < root.data){
            return 0;
        }


        //Now do this for all the nodes
        if(isBST(root.left)==0 || isBST(root.right)==0){
            return 0;
        }

        return 1;

    }

    public static int maxValue(Node root){
        if(root==null){
            return Integer.MIN_VALUE;
        }

        int res = root.data;

        int lres = maxValue(root.left);

        int rres = maxValue(root.right);

        if(res < lres){
            res = lres;
        }

        if(res < rres){
            res = rres;
        }

        return res;

    }

    public static int minValue(Node root){
        if(root==null){
            return Integer.MAX_VALUE;
        }

        int res = root.data;

        int lres = minValue(root.left);
        int rres = minValue(root.right);

        if(res > lres){
            res = lres;
        }

        if(res > rres){
            res = rres;
        }

        return res;
    }
}
