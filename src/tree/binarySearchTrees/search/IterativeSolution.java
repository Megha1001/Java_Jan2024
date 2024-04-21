package tree.binarySearchTrees.search;

/*
 * TIME COMPLEXITY : O(H)[It can become N in case of skew]
 * AUX SPACE : O(1)
 */

public class IterativeSolution {
    
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }

    public static void main(String args[]){
        Node root = new Node(15);
        root.left = new Node(5);
        root.right = new Node(20);

        root.left.left = new Node(3);
        root.right.left = new Node(18);
        root.right.right = new Node(80);
        root.right.left.left = new Node(16);

        int search = 16;
        System.out.println("Is the search element present in BST ?"+isPresent(root, search));

    }

    public static boolean isPresent(Node root, int x){
        
        while(root!=null){
            if(root.data == x){
                return true;
            }else if(root.data < x){
                root = root.right;
            }else{
                root = root.left;
            }
        }
        return false;
    }
    
}
