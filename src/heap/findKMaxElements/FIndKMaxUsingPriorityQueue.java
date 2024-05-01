package heap.findKMaxElements;

import java.util.Collections;
import java.util.PriorityQueue;

public class FIndKMaxUsingPriorityQueue {
    public static void main(String[] args) {
        int [] arr = {8,6,4,10,9};
        int k=3;

        System.out.println("The "+k+" largest elements in given array are : ");
        findKLargestItems(arr, k);
    }

    public static void findKLargestItems(int arr[], int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i: arr){
            pq.offer(i);
        }

        int count = 1;

        while(count<=k){
            System.out.print(pq.poll()+" ");
            ++count;
        }
    }
}
