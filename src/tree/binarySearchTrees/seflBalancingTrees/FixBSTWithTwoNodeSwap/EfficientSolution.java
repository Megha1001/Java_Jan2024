package tree.binarySearchTrees.seflBalancingTrees.FixBSTWithTwoNodeSwap;

/*
Approach :
Idea : Inorder traversal of BST is sorted --> USE CHECKBST MostEfficient Solution Idea

1. Maintain three references -> prev, first, second
2. while traversing BST in inorder fashion
    -> if prev!=null && prev.key > curr --> violation --> first!=null=> first=prev, second = curr; //there is a reason behind setting second as curr. check with example
3. After the traversal we would have values of first and second then swap the keys of these references
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
        //Pre-order traversal -> NLR
        int arr[] = {20,60,4,-1,-1,10,-1,-1,80,8,-1,-1,100,-1,-1};

        Node root = buildTree(arr);
        inOrder(root);

        fixBST(root);

        int temp = first.data;
        first.data = second.data;
        second.data = temp;

        System.out.println();
        inOrder(root);
    }

    static Node prev=null, first = null, second = null;

    public static void fixBST(Node root){ //no need to return anything since we just want to populate first and second
        if(root == null){
            return;
        }

        fixBST(root.left);

        if(prev!=null && prev.data > root.data){
            if(first==null){
                first=prev;
            }

            second = root; //always populate since when consecutive nodes needs to swap
        }

        prev = root;

        fixBST(root.right);

    }

    public static void inOrder(Node root){
        if(root==null){
            return;
        }

        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);

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

        return  newNode;


    }
}