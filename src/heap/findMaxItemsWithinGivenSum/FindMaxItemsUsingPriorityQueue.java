package heap.findMaxItemsWithinGivenSum;

import java.util.PriorityQueue;

public class FindMaxItemsUsingPriorityQueue {

    public static void main(String[] args) {
        int arr[] = {1,12,5,111,200};

        System.out.println("Maximum items that can be bought with the given sum is :"+findMaxItems(arr, 10));
    }

    public static int findMaxItems(int arr[], int target){
        int res = 0;
        int sum=0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i : arr){
            pq.add(i);
        }

        while(sum<=target){
            sum+=pq.poll();
            ++res;
        }

        return res-1;
    }

}
