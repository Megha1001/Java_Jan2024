package heap.findKMaxElements;


/*
Approach :
1. build Max heap -> O(N)
2. delete k elements -> O(k*logN)

Time complexity : O(N) + O(k*logN) -> better than naive
AUX SPACE : O(1), if allowed to modify array otherwise use priority queue
 */

public class EfficientAppUsingMaxHeap {
    public static void main(String[] args) {
        int [] arr = {8,6,4,10,9};
        int k=3;

        System.out.println("The "+k+" largest elements in given array are : ");
        findKLargestItems(arr, k);

    }

    public static void findKLargestItems(int arr[], int k){
        int n = arr.length;

        int count = 0;

        buildMaxHeap(arr, n);

        for(int i=n-1; i>=0; i--){
            ++count;
            if(count<=k){
                System.out.print(arr[0]+" ");
            }

            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            maxHepify(arr, i, 0);
        }
    }

    public static void buildMaxHeap(int arr[], int n){
        for(int i=(n-2)/2; i>=0; --i){
            maxHepify(arr, n, i);
        }
    }

    public static void maxHepify(int arr[], int n, int i){
        int largest = i;
        int left = 2*i+1;
        int right = 2*i+2;

        if(left<n && arr[left] >arr[largest]){
            largest = left;
        }

        if(right<n && arr[right]>arr[largest]){
            largest = right;
        }

        if(largest!=i){
            //need hepify
            int temp = arr[largest];
            arr[largest] = arr[i];
            arr[i] = temp;

            maxHepify(arr, n, largest);
        }
    }

}
