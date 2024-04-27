package tree.binarySearchTrees.pairSumWithGivenBST;

import java.util.HashSet;

/*
Approach
- While traversing in inorder fashion also check the pair by storing element in hashset

TIME COMPLEXITY : O(N)
AUX SPACE : O(N)
 */
public class CheckPairUsingHashingBetter {

    static class Node{
        int key;
        Node left;
        Node right;

        Node(int key){
            this.key = key;
        }
    }

    public static void main(String[] args) {
        //pre-order -> NLR
        int arr[] = {10,5,-1,-1,20,16,-1,-1,40,-1,-1};

        Node root = buildTree(arr);

        HashSet<Integer> h = new HashSet<>();
        System.out.println("is the given sum present as pair in the tree ? "+checkPair(root, h, 56));
    }


    public static boolean checkPair(Node root, HashSet<Integer> h, int x){
        if(root==null){
            return false;
        }

        //left subtree
        if(checkPair(root.left, h, x)){
            return true;
        }

        //process node
        if(h.contains(x-root.key)){
            return true;
        }else{
            h.add(root.key);
        }

        //right subtree
        return checkPair(root.right, h, x);


    }

    public static int idx = -1;
    public static Node buildTree(int arr[]){
        ++idx;
        if(arr[idx] == -1){
            return null;
        }

        Node newNode = new Node(arr[idx]);
        newNode.left = buildTree(arr);
        newNode.right = buildTree(arr);

        return newNode;
    }

}
