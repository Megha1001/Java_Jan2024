package tree.spiralForm;


import java.util.Stack;

/*
 * Approach : Use Two Stacks
 * 1. Push root to stack1
 * 2. while any of the two  is not empty
 *  - while s1 is not empty
 *      - take out a node, print it.
 *      - push children of the taken out node in s2
 * - while s2 is not empty
 *      - take out a node, print it
 *      - PUSH CHILDREN OF TAKE OUT NODE IN REVERSE ORDER
 * 
 * In naive solution , every item that needs to be print in reverse order traversed 4 times(enqueu, dequeue, push, pop). Here for every time --> push and pop
 * TIME COMPLEXITY : O(N)
 */


public class EfficientSolution {

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
        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();

        //push node to s1
        s1.push(root);

        while(!s1.isEmpty() || !s2.isEmpty()){
            
            while(!s1.isEmpty()){
                Node curr = s1.pop();

                System.out.print(curr.data);

                if(curr.left!=null){
                    s2.push(curr.left);
                }

                if(curr.right!=null){
                    s2.push(curr.right);
                }
            }


            System.out.println();


            while(!s2.isEmpty()){
                Node curr = s2.pop();

                System.out.print(curr.data);

                if(curr.right!=null){
                    s1.push(curr.right);
                }

                if(curr.left!=null){
                    s1.push(curr.left);
                }
            }

            System.out.println();

        }
    }


}
