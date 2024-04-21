package tree.serializationAndDeserialization;

import java.util.ArrayList;

/*
 * converting tree to arraylist
 * Traversal used :- preorder
 */
public class Serialization {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data= data;
        }
    }

    public static void main(String args[]){
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);

        root.left.left = new Node(40);
        root.left.right = new Node(50);

        root.right.right = new Node(60);

        System.out.println("After serialization : ");
        ArrayList<Integer> arr = new ArrayList<>();
        serialization(root, arr);
        System.out.println(arr);
    }

    public static void serialization(Node root, ArrayList<Integer> arr){

        if(root==null){
            arr.add(-1);
            return;
        }

        arr.add(root.data);
        serialization(root.left, arr);
        serialization(root.right, arr);

    }
    
}
