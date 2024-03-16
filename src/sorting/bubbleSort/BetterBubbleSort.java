package sorting.bubbleSort;
/*
TIME COMPLEXITY IN worst case : O(N^2)
when array is sorted : O(N-1)
Stable algo
inplace algo
Total number of swaps (be array is not sorted ): N(N-1)/2
Total number of swaps (be array is  sorted ) < N-1
total number of passes : N-1
total number of passes(sorted array) : 1
 */
public class BetterBubbleSort {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        System.out.println("Array after sorting is :");
        bubbleSort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void bubbleSort(int arr[]){
        int n = arr.length;
        boolean swap;
        for(int i=0; i<n-1; i++){
            swap = false;
            for(int j=0; j<n-i-1; j++){
                int temp;
                if(arr[j] > arr[j+1]){
                    //swap
                    swap = true;
                    temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            //if sorted then swap = 0
            if(!swap){
                break;
            }
        }
    }
}
