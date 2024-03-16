package sorting.bubbleSort;

/*
TIME COMPLEXITY IN ALL CASES : O(N^2)
Stable algo
inplace algo
Total number of swaps (be array sorted or not ): N(N-1)/2
total number of passes : N-1
 */
public class BubbleSortNormal {
    public static void main(String[] args) {
        int arr[] = {4,3,2,1};
        System.out.println("Array after sorting is :");
        bubbleSort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void bubbleSort(int arr[]){
        int n = arr.length;
        for(int i=0; i<n-1; i++){ //n-1 since we are comparing in pairs
            for(int j=0; j<n-i-1; j++){ //after every pass position of largest element gets fixed.
                int temp;
                if(arr[j]>arr[j+1]){
                    //swap
                    temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

}
