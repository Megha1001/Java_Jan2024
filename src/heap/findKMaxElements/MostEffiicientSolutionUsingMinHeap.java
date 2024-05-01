package heap.findKMaxElements;

/*
Approach :
1. Build a min heap with first k elements - O(K)
2. Traverse from K+1 element --> O(n-k)
    - a. compare the value with minheap[0], if value is smaller reject it
    - b. if value is greater replace the k+i element value with minheap[0] --> its like extract min -> O(log(k))


TIME COMPLEXITY : O(k) + O((n-k)log(k))
 */

public class MostEffiicientSolutionUsingMinHeap {
}
