package heap.PriorityHeap;

import java.util.PriorityQueue;

/*
By default, Priority Queue impl min heap.
 */
public class MinHeap {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(10);
        pq.offer(20);
        pq.offer(15);
        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq.peek());
    }

}
