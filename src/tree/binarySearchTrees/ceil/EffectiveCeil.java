package tree.binarySearchTrees.ceil;
/*
 * TIME COMPLEXITY : O(H)
 * AUX SPACE : O(1)
 */

public class EffectiveCeil {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }

    public static void main(String args[]){
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);

        root.left.left = new Node(20);
        root.left.right = new Node(40);
        root.right.left = new Node(60);
        root.right.right = new Node(78);
        root.right.left.left = new Node(55);
        root.right.left.right = new Node(65);

        int search = 15;
        Node res = findCeil(root, search);
        System.out.println("The floor of given element is  "+(res!=null ? res.data : null));
    }


    public static Node findCeil(Node root, int x){
        Node res = null;

        while(root!=null){
            if(root.data == x){
                return root;
            }else if(root.data > x){
                //potential ceil
                res = root;
                root = root.left;
            }else{
                root = root.right;
            }
        }

        return res;
    }
}
