package tree.binarySearchTrees.seflBalancingTrees.FixBSTWithTwoNodeSwap;


/*
Approach :
1. Traverse in left and check for the element that is greater than root.data
2. Traverse in right and check for element that is less than root.data

NOT WORKS when root is the culprit
 */
public class NaiveApp {

    public static int rootData;

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {
        int arr[] ={20,60,4,-1,-1,10,-1,-1, 80,8,-1,-1,100,-1,-1};

        Node root = buildTree(arr);

        root = fixBST(root);

        System.out.println("is this now valid BST ? "+checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE));

    }

    public static boolean checkBST(Node root, int min, int max){
        if(root==null){
            return true;
        }
        return (min < root.data && root.data < max)
                && checkBST(root.left, min, root.data)
                && checkBST(root.right, root.data, max);
    }

    public static Node fixBST(Node root){
        if(root==null){
            return null;
        }
        Node wrongLeft = null;
        Node wrongRight = null;

        rootData = root.data;

        if(root.left!=null && root.left.data > root.data){
            wrongLeft = root.left;
        }

        if(root.right!=null && root.right.data < root.data){
            wrongRight = root.right;
        }

        if(wrongLeft == null){
            wrongLeft=  findWrongLeftNode(root.left);
        }

        if(wrongRight == null){
            wrongRight=  findWrongRightNode(root.right);
        }


        //swap
        int temp = wrongLeft.data;
        wrongLeft.data = wrongRight.data;
        wrongRight.data = temp;

        return root;

    }

    public static Node findWrongLeftNode(Node root){
        if(root==null){
            return null;
        }

        if(root.left!=null && root.left.data > rootData){
            return root.left;
        }

        if(root.right!=null && root.right.data > rootData){
            return root.right;
        }

        return null;
    }

    public static Node findWrongRightNode(Node root){
        if(root==null){
            return null;
        }

        if(root.left!=null && root.left.data < rootData){
            return root.left;
        }

        if(root.right!=null && root.right.data < rootData){
            return root.right;
        }

        return null;
    }


    public static int idx = -1;
    public static Node buildTree(int arr[]){
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
