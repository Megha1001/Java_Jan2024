package tree.serializationAndDeserialization;

/*
 *  * TIME COMPLEXITY : O(N)
 */
public class Deserialization {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }

    /*
     * Given is pre-order traversal : NLR
     */
    public static void main(String args[]){
        int arr[] = {10, 20, 40, -1, -1, 50, -1, -1, 30, -1, 60, -1, -1};
        System.out.println("Construct tree : ");
        Node root = buildTree(arr);
        traverse(root);
    }

    //pre-order traversal
    public static void traverse(Node root){
        if(root==null){
            return;
        }

        System.out.print(root.data+" ");
        traverse(root.left);
        traverse(root.right);
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
