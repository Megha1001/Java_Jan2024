package tree.diameter;

/*
WORSt case : Skew tree
 * TIME COMPLEXITY : O(N^2)
 * T(N) = T(N-1)+O(N)
 */

public class NaiveSolution {

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

        System.out.print("Diameter of given tree is : "+findDiameter(root));

    }

    public static int findDiameter(Node root){
        if(root==null){
            return 0;
        }

        int dia = 1 + height(root.left)+ height(root.right);

        int dia1 = findDiameter(root.left);
        int dia2 = findDiameter(root.right);

        return Math.max(Math.max(dia1, dia2),dia);
    }


    public static int height(Node root){
        if(root==null){
            return 0;
        }

        else{
            return Math.max(height(root.left), height(root.right)) + 1;
        }
    }
    
}
