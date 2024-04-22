package tree.binarySearchTrees.delete;

/*
 * TIME COMPLEXITY : O(H)
 * AUX SPACE : O(H)
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
        int arr[]={50,30,-1,40,-1,-1,70,60,-1,-1,80,-1,-1};

        Node root = buildTree(arr);

        root = deleteNode(root, 50);
        inOrderTraversal(root);
    }

    public static void inOrderTraversal(Node root){
        if(root==null){
            return ;
        }

        System.out.print(root.data+" ");
        inOrderTraversal(root.left);
        inOrderTraversal(root.right);

    }


    public static Node deleteNode(Node root, int x){
        if(root==null){
            return null;
        }

        if(root.data < x){
            //go to right
            root.right = deleteNode(root.right, x);
        }

        if(root.data > x){
            //go to left
            root.left = deleteNode(root.left, x); //root.left= --> this is needed to like IMP!
        }
        
        //when we find the key
        else{

            //have one child or no child
            if(root.left == null){
                return root.right;
            }

            if(root.right==null){
                return root.left;
            }

            //when both the child are present --> consider successor
            Node succ = getSuccessor(root, x);
            root.data = succ.data;
            /*
            since root's data is replaced by successor's data --> and at this point we have 
            two occurrence of successor.One at root.data place and other at its original place
            (right of root), we have to delete its original occurrence
            */

            root.right = deleteNode(root.right, succ.data);

        }
        return root;

    }

    /*
     * To find successor --> go right then go left, left left until not found null
     * 
     * This is not a generic code to calculate successor since we are calling ti in thrid case(when both the child exist), for ex: in case of cal succ of 40(which is a leaf node--> 50 is the actual successor), 
     * but this code will fail since 50 is root and 40 is leaf(with no childrens)
     */
    public static Node getSuccessor(Node root, int x){
        Node curr = root.right; // root should be there, otherwise got caught at earlier stages
        while(curr!=null && curr.left!=null){
            curr = curr.left;
        }
        return curr;
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
