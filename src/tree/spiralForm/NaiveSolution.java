package tree.spiralForm;


import java.util.Stack;
import java.util.Queue;
import java.util.ArrayDeque;
/*
 * Approach : Not in place -> Use stack, queue
 * 1. Maintain a variable reversed(false at start). 
 * 2. Do normal Level order traversal by using size of queue.
 * 3. while printing at LOT check reversed 
 *  - if true push the elements into the stack
 *  - if false print the elements
 * - push left check and right check as normal in queue
 * 4. after loop if reversed is true --> pop item from stack and print until it gets empty
 * 5. toggle the reversed variable
 * 
 * TIME COMPLEXITY : O(N), Enqueue and dequeue in queue exactly once  (Also pushed and pop in Stack --> O(4N))
 * Amount of work while printing %2==0 level node is twice of other level(root level=1)
 */


public class NaiveSolution {

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
        root.right = new Node(30);

        root.left.left = new Node(40);
        root.left.right = new Node(50);
        
        root.right.left = new Node(60);
        root.right.right = new Node(70);

        System.out.println("The spiral traversal of given tree is :");
        printSpiralForm(root);
    }
    
    public static void printSpiralForm(Node root){
        if(root==null){
            return;
        }

        Queue<Node> q = new ArrayDeque<>();
        boolean reversed = false;
        Stack<Integer> s = new Stack<>();

        q.offer(root);

        while(!q.isEmpty()){
            int count = q.size();

            //execute for every level
            for(int i=0; i<count;i++){
                Node temp = q.poll();
                //print
                if(reversed){
                    s.push(temp.data);
                }else{
                    System.out.print(temp.data+" ");
                }

                if(temp.left!=null){
                    q.offer(temp.left);
                }
                if(temp.right!=null){
                    q.offer(temp.right);
                }
            }

            if(reversed){
                while(!s.isEmpty()){
                    System.out.print(s.pop()+" ");
                }
            }

            reversed = !reversed;

            System.out.println();
        }

    }


}
