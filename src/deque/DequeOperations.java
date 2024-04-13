package deque;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class DequeOperations {

    public static void main(String args[]){

        Deque<Integer> dq = new LinkedList<>();

        /*
         * These func doesn't throw an exception where as addFirst, addLast , removeFirst, removeLast, getFirst, getLast throws exception
         */

        dq.offerFirst(10);
        dq.offerLast(20);
        dq.offerFirst(30);
        dq.offerLast(40);

        System.out.println(dq.peekFirst());

        System.out.println(dq.peekLast());

        dq.pollFirst();

        System.out.println(dq.peekFirst());
        
        dq.pollLast();

        System.out.println(dq.peekLast());

        //Traversal
        Iterator<Integer> it = dq.iterator();
        
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }

        System.out.println();

        for(int x : dq){
            System.out.print(x+" ");
        }

        System.out.println();

        //traverse in descending order
        it = dq.descendingIterator();

        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }

    }
    
}
