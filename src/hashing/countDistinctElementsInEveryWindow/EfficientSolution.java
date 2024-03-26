package hashing.countDistinctElementsInEveryWindow;

import java.util.HashMap;

/*
 * SLIDING WINDOW TECHNIQUE
 * 
 * TIME COMPLEXTIY : O(N)
 * AuX SPACE : O(K)
 */

public class EfficientSolution {

    public static void main(String args[]){
        int arr[] = new int[]{10, 10, 5, 3, 20, 5};
        
        int n = arr.length;
        int k=4;
        printDistinct(arr, n, k);
    }

    public static void printDistinct(int arr[], int n, int k){

        //Create a frequence Map of first k items

        HashMap<Integer, Integer> map = new HashMap<>(k);

        for(int i=0; i<k; i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }

        //print size of the frequence map
        System.out.println(map.size());


        //for remaning window
        for(int i=k; i<n; i++){ //considering start as end of current window
            //item that leaved the window
            map.put(arr[i-k], map.get(arr[i-k])-1);

            //check if item that leaved the window , if value of frequency is zero then remove the item
            if(map.get(arr[i-k]) == 0){
                map.remove(arr[i-k]);
            }


            //add last element of current window
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);

            System.out.println(map.size());

        }

    }
    
}
