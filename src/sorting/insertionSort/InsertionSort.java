package sorting.insertionSort;
/*
 * TIME COMPLEXITIES
 *  1. BEST CASE : WHEN ARRAY ALREADY SORTED : Theta(N)
 *  2. WORST CASE : WHEN ARRAY IS REVERSE SORTED : Theta(N*N)
 *  3. AVERAGE CASE : O(N*N)
 */

public class InsertionSort {
    
    public static void main(String args[]){
        int arr[] = {9,8,6,1,2,3};
        System.out.println("Array after sorting :");
        insertionSort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void insertionSort(int arr[]){
        int n = arr.length;

        /*
         * Maintain two arrays one is sorted and other is unsorted. At first in sorted array we have only one element that is arr[0] later we add elements from arr[1] to arr[n-1].
         * For each unsorted element will start loop from i-1 and go to left until we found the element whose value is < arr[i] during this shifting we also lift and shift the elements >arr[i] to right of them
         * one we find the element <arr[i] we know next to it position is available and we can insert arr[i] there
         */
        for(int i=1; i<n; i++){
            int key = arr[i];
            int j = i-1;
            while(j >= 0 && arr[j] > key){ // to maintain the stability we have > only
                arr[j+1] = arr[j];
                --j;
            }

            //Next to j is the correct position for key
            arr[j+1] = key;
        }
    }
    
}
