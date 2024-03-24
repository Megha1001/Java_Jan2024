package hashing;

import java.util.HashSet;
/*
 * TIME COMPLEXITY : O(N)
 * AUX SPACE : O(N)
 */

public class PairWithGivenSumInUnsortedArray {
    public static void main(String args[]){
        int arr[] = {8,3,4,2,5};
        int X = 6;
        System.out.println("Is the sum with "+X+" exists in given array? "+checkForGivenSum(arr, X));
    }

    public static boolean checkForGivenSum(int arr[], int X){
        HashSet<Integer> h = new HashSet<>();

        for(int i : arr){
            //is the pair exists 
            if(h.contains(X-i)){
                return true;
            }
            //not present , add it in hashSet
            h.add(i);
        }

        return false;
    }
}
