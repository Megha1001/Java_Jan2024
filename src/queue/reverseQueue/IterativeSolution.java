package queue.reverseQueue;

/*
 * Approach : Use Stack
 * 1. poll all the items from queue push to stack.
 * 2. pop all items from stack offer to queue
 * 
 * TIME COMPLEXITY : O(N)
 * AUX SPACE : O(N)
 */

import java.util.Stack;
import java.util.Queue;
import java.util.ArrayDeque;

public class IterativeSolution {

    public static void main(String args[]){

        Queue<Integer>  q1 = new ArrayDeque<>();

        q1.offer(10);
        q1.offer(20);
        q1.offer(30);
        q1.offer(40);

        //print 
        System.out.println("original queue : "+q1);

        Stack<Integer> s = new Stack<>();

        while(!q1.isEmpty()){
            s.push(q1.poll());
        }

        while(!s.isEmpty()){
            q1.offer(s.pop());
        }

        System.out.println("After reversal queue : "+q1);
    }
    
}
