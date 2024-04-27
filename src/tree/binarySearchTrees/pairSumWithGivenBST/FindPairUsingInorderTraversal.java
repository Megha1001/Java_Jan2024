package tree.binarySearchTrees.pairSumWithGivenBST;

import java.util.ArrayList;

/*
Approach :
1. Do inorder traversal --> print in sorted order
2. Use two pointer approach to check the pair

TIME COMPLEXITY : O(N) [inorder traversal(O(N)) , two pointer app(O(N))]
AUX SPACE : O(N) [O(N) -> for arraylist, O(H)--> for call stack -> O(N+H) = O(N)]
 */

public class FindPairUsingInorderTraversal {

    static class Node{
        int key;
        Node left;
        Node right;

        Node(int key){
            this.key = key;
        }
    }

    public static void main(String[] args) {
        //pre-order
        int arr[] ={10,8,4,-1,-1,9,-1,-1,20,11,-1,-1,30,25,-1,-1,-1};
        Node root = buildTree(arr);

        System.out.println("is the given sum present as pair in the tree ? "+checkPair(root, 19));
    }


    public static boolean checkPair(Node root, int x){
        //inorder traversal
        ArrayList<Integer> list = new ArrayList<>();
        inOrder(root, list);

        //two pointer approach
        int first = 0;
        int last = list.size()-1;


        //O(N)
        for(int i=0; i< list.size(); i++){
            int sum = list.get(first) + list.get(last);

            if(sum==x){
                return true;
            }

            if(sum > x){
                --last;
            }else{
                ++first;
            }
        }

        return false;
    }


    //O(N)
    public static void inOrder(Node root, ArrayList<Integer> list){
        if(root==null){
            return;
        }

        inOrder(root.left,list);
        list.add(root.key);
        inOrder(root.right, list);
    }


    public  static int idx=-1;
    public static Node buildTree(int []arr){
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
