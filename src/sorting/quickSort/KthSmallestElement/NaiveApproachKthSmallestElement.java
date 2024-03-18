package sorting.quickSort.KthSmallestElement;

/*
 * TIME COMPLEXITY : O(NLOGN)
 */
import java.util.Arrays;

public class NaiveApproachKthSmallestElement {
    
    public static void main(String args[]){
        int arr[] = {10,4,5,8,11,6,26};
        int k = 5;
        System.out.println("The "+k+"th smallest element of given array is :"+findKthSmallest(arr, k-1));
    }

    public static int findKthSmallest(int arr[], int k){
        Arrays.sort(arr);
        return arr[k];
    }
}
