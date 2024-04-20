package tree.diameter;

/*
 * Approach : While calculating height also calculate diameter but return height
 * TIME COMPLEXITY : O(N)
 */

public class EfficientSolution {
    public static int res = 0;
    
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
        root.left = new Node(20);
        root.right = new Node(60);

        root.left.left = new Node(30);
        root.left.right = new Node(80);

        root.left.left.left = new Node(40);
        root.left.left.right = new Node(50);
        root.left.right.right = new Node(90);
        root.left.right.right.right = new Node(18);

        root.left.left.left.left = new Node(100);

        findHeight(root);

        System.out.print("Diameter of given tree is : "+res);

    }

    /*
     * This function returns height but sets the res variable to have diameter.
     */

    public static int findHeight(Node root){
        if(root==null){
            return 0;
        }

        int lh = findHeight(root.left);
        int rh = findHeight(root.right);
        res = Math.max(res, lh+rh+1);
        return Math.max(lh,rh)+1;
    }
}
