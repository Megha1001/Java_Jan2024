package heap.findKMaxElements;

/*
Approach :
1. Build a min heap with first k elements - O(K)
2. Traverse from K+1 element --> O(n-k)
    - a. compare the value with minheap[0], if value is smaller reject it
    - b. if value is greater replace the k+i element value with minheap[0] --> its like extract min -> O(log(k))


TIME COMPLEXITY : O(k) + O((n-k)log(k))
 */

import java.util.Iterator;
import java.util.PriorityQueue;

public class MostEffiicientSolutionUsingMinHeap {

    public static void main(String[] args) {
        int [] arr = {8,6,4,10,9};
        int k=3;

        System.out.println("The "+k+" largest elements in given array are : ");
        findKLargestItems(arr, k);
    }

    public static void findKLargestItems(int arr[], int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>(); //min heap

        //O(K)
        for(int i=0; i<k; i++){
            pq.offer(arr[i]);
        }

        int i=k;
        while(i<arr.length){ //O(n-k)
            if(arr[i]>pq.peek()){
                pq.poll();
                pq.offer(arr[i]); // extract min --> O(logK)
                ++i;
            }
        }

        //iterate
        Iterator<Integer> iterator = pq.iterator();

        while(iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
    }
}
