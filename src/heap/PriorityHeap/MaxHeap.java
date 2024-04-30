package heap.PriorityHeap;

import java.util.PriorityQueue;
import java.util.Collections;

public class MaxHeap {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); //for max heap

        pq.offer(10);
        pq.offer(20);
        pq.offer(15);

        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq.peek());
    }
}
