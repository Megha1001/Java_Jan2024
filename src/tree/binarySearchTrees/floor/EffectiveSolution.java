package tree.binarySearchTrees.floor;

public class EffectiveSolution {
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
        System.out.println("The floor of given element is  "+findFloor(root, search).data);
    }

    public static Node findFloor(Node root, int x){
        Node res = null;

        while(root!=null){
            if(root.data == x){
                return root;
            }else if(root.data > x){
                // go to left; and root cannot be the potential floor
                root = root.left;
            }else{
                //go on right and root can be the potential floor
                res = root;
                root = root.right;
            }
        }

        return res;

    }
}
