package queue;
import java.util.Queue;
import java.util.ArrayDeque;

/*
 *  Given a number n, print first n numbers(in increasing order) such that all these numbers have digis in set {5,6}
 *  Example : 
 *  i/p n =10
 *  o/p : 5,6,55,56,65,66,555,556,565,566 
 * 
 *  Approach :
 *  1. Take Queue of String type(since number can be large)
 *  2. Enqueue 5, 6 into it, (order is imp)
 *  3. run a loop from 0->N-1
 *      -> for each iteration
 *          -> poll the number and same it in temp
 *          -> print temp
 *          -> add temp+"5", and temp+"6" to the queue  (order is imp)
 * 
 * 
 * TIME COMPLEXITY : O(N)
 * AUX SPACE : O(N) -> for queue
 * 
 */

public class GenerateNItemsContainTwoNumbers {
    
    public static void main(String args[]){
        int n = 10;

        System.out.println("First "+n+" numbers form by using 5 & 6 in increasing order are :");
        getAndPrintNumbers(n);
    }

    public static void getAndPrintNumbers(int n){
        if(n==0){
            System.out.println("Nothing to print");
        }

        Queue<String> q = new ArrayDeque<>();

        //add 5 and 6
        q.offer("5");
        q.offer("6");

        for(int i=0; i<n; i++){
            String curr = q.poll();

            System.out.print(curr+" ");

            //append 5 and 6 and push to q
            q.offer(curr+"5");
            q.offer(curr+"6");

        }

    }

}
