package hashing.morethanNByKOccurrences;

import java.util.HashMap;
import java.util.Map;


/*
 * TIME COMPLEXITY : O(N)
 * AUX SPACE : O(N)
 */

public class EfficientSolutionUsingHashMap {

       public static void main(String args[]){
        int arr[] = {10,10,20,30,20,10,10};
        int n = arr.length;
        int k = 2;

        System.out.println("Elements that has more than n/k occurrences are : ");
        printElements(arr, n, k);

    }

    public static void printElements(int arr[], int n, int k){
        HashMap<Integer, Integer> h = new HashMap<>();

        for(int i=0; i<n; i++){
            h.put(arr[i], h.getOrDefault(arr[i],0)+1);
        }

        for(Map.Entry<Integer, Integer>e : h.entrySet()){
            if(e.getValue() > (n/k)){
                System.out.println(e.getKey());
            }
        }

    }
    
}
