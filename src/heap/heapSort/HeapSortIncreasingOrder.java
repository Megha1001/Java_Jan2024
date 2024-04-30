package heap.heapSort;

/*
Approach :
Use max heap --> to sort in increasing order otherwise use min heap for decreasing order
1. Build Max heap
    for(i= n-1/2; i>=0; i++) maxHeapify(arr, n, i);
2. use selection sort idea
    - Swap max element(present at root) with n-1(keep changing(for(i=n-1;  i>=1;i--)))
    - call maxHeapify(arr, i, 0) since we dont want to touch swapped elements the total is i instead of n. and we always call maxhepify for root. since root is being swapped
 */

public class HeapSortIncreasingOrder {

    
}
