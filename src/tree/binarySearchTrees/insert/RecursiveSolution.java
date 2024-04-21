package tree.binarySearchTrees.insert;

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
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        
        root.right.left = new Node(12);
        root.right.right = new Node(18);

        System.out.println("After inseration the tree is : ");
        Node newRoot = insert(root, 20);
    }

    public static Node insert(Node root, int x){
        Node newNode = new Node(x);
        if(root==null){
            return newNode;
        }

        Node curr = root;
        while(curr.left!=null || curr.right!=null){
            if(curr.data < x){
                curr = curr.right;
            }else{
                curr = curr.left;
            }
        }

        if(curr.data < x){
            curr.right = newNode;
        }else{
            curr.left = newNode;
        }
        

        return root;
    }
    
}
