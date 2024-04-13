package queue.reverseQueue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class RecursiveSolution {
    public static void main(String args[]){

        Queue<Integer>  q1 = new ArrayDeque<>();

        q1.offer(10);
        q1.offer(20);
        q1.offer(30);
        q1.offer(40);

        //print 
        System.out.println("original queue : "+q1);

        reverse(q1);
       
        System.out.println("After reversal queue : "+q1);
    }

    public static void reverse(Queue<Integer> q1){

        if(q1.isEmpty()){
            return;
        }

        int temp = q1.poll();

        reverse(q1);

        q1.offer(temp);

        
    }
}
