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

import java.util.Arrays;

public class HeapSortIncreasingOrder {

    static class HeapSort{

        int getLeft(int i){
            return 2*i+1;
        }

        int getRight(int i){
            return 2*i+2;
        }

        int getParent(int i){
            return (i-1)/2;
        }


        void sort(int [] arr){
            int n = arr.length;

            buildMaxHeap(arr, n);

            for(int i=n-1; i>=1; --i){
                int temp = arr[0]; //always zero since max is present at 0th index
                arr[0]= arr[i];
                arr[i] = temp;

                maxHeapify(arr, i, 0); //always have to heapify the 0th element
            }

        }


        void buildMaxHeap(int arr[], int n){
            //start from rightmost internal node
            for(int i=(n-2/2); i>=0; i--){
                maxHeapify(arr, n, i);
            }
        }

        void maxHeapify(int arr[], int n, int i){
            int largest = i;
            int left = getLeft(i);
            int right = getRight(i);

            //finding max in left, right and node
            if(left < n && arr[left]> arr[i]){
                largest = left;
            }
            if(right<n && arr[right]> arr[largest]){//not <arr[i]
                largest = right;
            }

            //check need of heapification
            if(largest!=i){
                int temp = arr[largest];
                arr[largest] = arr[i];
                arr[i] = temp;

                maxHeapify(arr, n, largest);
            }
        }

    }

    public static void main(String[] args) {
        int arr[] ={12,10,13,5,6,7};
        HeapSort h = new HeapSort();
        h.sort(arr);

        Arrays.stream(arr).forEach(e-> System.out.print(e+" "));
    }


}
