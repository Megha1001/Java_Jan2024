package sorting.quickSort.KthSmallestElement;
/*
 * TIME COMPLEXITY : O(N) -> Average case //same as that of quick sort. Use partition function
 */

public class EffApproachKthSmallestElement {
    
    public static void main(String args[]){
        int arr[] = {10,4,5,8,11,6,26};
        int k = 5;
        System.out.println("The "+k+"th smallest element of given array is :"+findKthSmallest(arr, k));
    }

    //Lomuto partition
    public static int findKthSmallest(int arr[], int k){
        int l = 0;
        int h = arr.length-1;
        while(l <= h){
            int partition = partition(arr, l, h);
            
            if(partition == k-1){
                return arr[partition];
            }else if (partition > k-1){
                // go to left half
                h = partition - 1;
            }else{
                //go to right half
                l = partition + 1;
            }
        }
        return -1;
    }

    public static int partition(int arr[], int l, int h){
        int i = l-1;
        int p = arr[h];
        for(int j=l; j<=h-1; j++){
            if(arr[j] < p){
                ++i;
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //swap
        int temp = arr[h];
        arr[h] = arr[i+1];
        arr[i+1] = temp;

        return i+1;
    }
}
