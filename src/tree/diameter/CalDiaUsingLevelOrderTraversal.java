package tree.diameter;

import java.util.Queue;
import java.util.ArrayDeque;

public class CalDiaUsingLevelOrderTraversal {

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
        //base
        if(root==null){
            return res;
        }

        Queue<Node> q = new ArrayDeque<>();
        q.offer(root);

        while(!q.isEmpty()){
            Node curr = q.poll();
            res = calDiameter(curr);
            if(curr.left!=null){
                q.add(curr.left);
            }

            if(curr.right!=null){
                q.add(curr.right);
            }
        }

        return res;
    }

    public static int calDiameter(Node curr){
        int lh = height(curr.left);
        int rh = height(curr.right);

        res = Math.max(res, lh+rh+1);

        return res;
    }

    public static int height(Node curr){
        if(curr==null){
            return 0;
        }else{
            return Math.max(height(curr.left), height(curr.right))+1;
        }
    }
}
