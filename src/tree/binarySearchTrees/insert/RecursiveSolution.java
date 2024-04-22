package tree.binarySearchTrees.insert;

/*
TIME COMPLEXITY : O(H)
AUX SPACE : O(H)
*/

class RecursiveSolution {
    static class Node{
        int data;
        Node left;
        Node right;
        
        Node(int data){
            this.data = data;
        }
    }
    
    public static void main(String args[]){
        int arr[] = {10,5,-1,-1,15,12,-1,-1,18,-1,-1};
        
        Node root = buildTree(arr);
        root = insertNode(root, 20);
        traversePreOrder(root);
    }
    
    public static void traversePreOrder(Node root){
        if(root==null){
            return;
        }
        
        System.out.print(root.data+" ");
        traversePreOrder(root.left);
        traversePreOrder(root.right);
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
    
    public static Node insertNode(Node root, int x){
        Node newNode = new Node(x);
        
        if(root == null){
            return newNode;
        }
        
        if(root.data < x){
            root.right = insertNode(root.right, x);
        }
        
        if(root.data > x){
            root.left = insertNode(root.left, x);
        }
        
        
        return root; //incase of equal as well it will not insert that element simply return.
    }
}
