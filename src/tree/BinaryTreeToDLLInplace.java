package tree;

public class BinaryTreeToDLLInplace {

    public static Node prev = null;

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
        root.right = new Node(20);
        root.right.left = new Node(30);
        root.right.right = new Node(35);

        System.out.println("Converted DLL elemenet are :");
        Node head = convertBTToDLL(root);
        traverse(head);
    }

    public static void traverse(Node head){
        if(head==null){
            return;
        }

        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.right;
        }
    }
    
    /*
     * Consider inorder traversal
     */

    public static Node convertBTToDLL(Node root){
        if(root==null){
            return null;
        }

        Node head = convertBTToDLL(root.left);
        
        if(prev == null){
            head = root;
        }else{
            prev.right = root;
            root.left = prev;
        }
        prev = root;
        convertBTToDLL(root.right);

        return head;

        


    }
    
}
