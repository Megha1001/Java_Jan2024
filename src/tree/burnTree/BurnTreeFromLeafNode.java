package tree.burnTree;

public class BurnTreeFromLeafNode {

    public static int res=-1;

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }

    static class Distance{
        int val;

        Distance(int val){
            this.val = val;
        }
    }

    public static void main(String args[]){
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);

        root.left.left = new Node(40);
        root.left.right = new Node(50);

        root.left.left.left = new Node(60);
        root.left.left.left.left = new Node(70);


        burnTree(root, 50, new Distance(-1));
        System.out.print("The number of seconds require to burn whole tree is " +res);
    }


    /*
     * it will return height and maintain distance variable among ancestors
     */
    public static int burnTree(Node root, int leaf, Distance dis){
        if(root==null){
            return 0; //when node is null height is0;
        }

        if(root.data==leaf){
            dis.val = 0;//found the leaf
        }

        Distance ldist = new Distance(-1);
        Distance rdist = new Distance(-1);
      
        //search in left and right and also compute height and update ldist and rdist
        int lh = burnTree(root.left, leaf, ldist);
        int rh = burnTree(root.right, leaf, rdist);

        /*
         * leaf exists in left and need to consider right height and update dis.value so it can be shared among ancestors
         */
        if(ldist.val!=-1){
            dis.val = ldist.val + 1;
            res = Math.max(res, rh+dis.val);
        }

        /*
         * it can be at left or right
         */
        else if(rdist.val!=-1){
            dis.val = rdist.val + 1;
            res = Math.max(res, dis.val+lh);
        }

        return Math.max(lh, rh) + 1;

    }
    
    
}
