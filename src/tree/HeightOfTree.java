package tree;

/*
 * TIME COMPLEXITY : O(height of tree)
 * AUX SPACE : : O(height of tree)
 */
public class HeightOfTree {


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
        root.left = new Node(8);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);


        System.out.println("height of the tree is : "+heightOfTree(root));
    }
    

    public static int heightOfTree(Node root){

        if(root==null){
            return 0;
        }else{
            return Math.max(heightOfTree(root.left), heightOfTree(root.right)) +1;
        }

    }

}
