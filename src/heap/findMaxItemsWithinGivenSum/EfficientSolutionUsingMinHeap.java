package heap.findMaxItemsWithinGivenSum;

/*
Approach :
1. Build MinHeap
REPEAT :
2. remove root element until sum >= root and do ++res and sum-=arr[i]

TIME COMPLEXITY : O(N) [build heap] + O(logN * res) [O(logN) require to delete from heap]
AUX SPACE : O(1), if modification to original array is allowed otherwise if used Priority queue or something else required O(N)

 */

public class EfficientSolutionUsingMinHeap {


    public static void main(String[] args) {
        int arr[] = {1,12,5,111,200};

        System.out.println("Maximum items that can be bought with the given sum is :"+findMaxItems(arr, 10));

    }


    public static int findMaxItems(int[]arr, int sum){
        int res = 0;
        int n = arr.length;

        //build max heap
        buildMaxHeap(arr, n);

        for(int i=n-1; i>=0 ; i--){

            if(arr[0] <=sum){
                ++res;
                sum -= arr[0];
            }else{
                break;
            }
            //swap root with last
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            minHeapify(arr,i,0); //always for 0th element
        }

        return res;
    }


    public static void buildMaxHeap(int [] arr, int n){

        for(int i=(n-2)/2; i>=0; i--){
            minHeapify(arr, n, i);
        }

    }

    public static void minHeapify(int arr[], int n, int i){
        int smallest = i;
        int left = 2*i+1;
        int right = 2*i+2;

        if(left<n && arr[left]<arr[smallest]){
            smallest = left;
        }

        if(right<n && arr[right]<arr[smallest]){
            smallest = right;
        }

        if(smallest!=i){
            //need heapify
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;

            minHeapify(arr, n, smallest);
        }

    }

}
