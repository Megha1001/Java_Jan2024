package deque.MaxInSubArrayOfSizeK;

/*
 * Approach : 
 * 1. run for every k subarray and find the max. 
 * 
 * TOTAL SUBARRAY OF SIZE K in N size array : O(N-k+1)
 * TIME COMPLEXITY : O(N^2)
 */

public class NaiveSolution {
    
    public static void main(String args[]){
        int arr[] = {20,40,30,10,60};
        int k =3;

        System.out.println("The maximum elements in subarray of size K are : ");
        printMaxForSubarrayK(arr, k);
    }

    public static void printMaxForSubarrayK(int arr[], int k){
        int n = arr.length;

        for(int i=0; i<n-k+1; i++){
            int max = arr[i];
            for(int j=i+1; j<i+k; j++){
                if(max < arr[j]){
                    max = arr[j];
                }
            }
            System.out.print(max+" ");
        }

    }
}
