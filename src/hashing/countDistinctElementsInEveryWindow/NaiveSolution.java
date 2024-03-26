package hashing.countDistinctElementsInEveryWindow;

import java.util.HashSet;

/*
 * TIME COMPLEXITY : k*(n-k)
 * AUX SPACE : O(k)
 */

public class NaiveSolution {
    
    public static void main(String []args){
        // int []arr = {10,20,20,10,30,40,10};
        int arr[] = new int[]{10, 10, 5, 3, 20, 5};
        int k = 4;
        System.out.println("Priting the distinct elment count of every window of size "+k+" : ");
        printDistinctElementsInEveryWindowOfSizeK(arr, k);
    }
    
    public static void printDistinctElementsInEveryWindowOfSizeK(int arr[], int k){
        int n = arr.length;
        
        for(int i=0; (i+k) <= n; i++){ // OR (i+k-1<n) --> so that we can inclue the last kth elements , i is zero indexed but not k
            HashSet<Integer> h = new HashSet<>(k);
            for(int j=i ;j<i+k; j++){ 
                h.add(arr[j]);
            }
            System.out.println(h.size());
        }
    }
}
