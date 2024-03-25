package hashing.subArrayWithGivenSum;

import java.util.HashSet;
/*
TIME COMPLEXITY : O(N)
AUX SPACE (For hashset) : O(N)
 */
public class EfficientAppPrefixSumWithHashing {
    public static void main(String[] args) {
        int arr[] = {5,8,6,13,3,-1};
        int sum = 23;

        System.out.println("is the subarray exists in given array with sum:"+sum+" ?"+isSubArrayExists(arr, sum));
    }

    public static boolean isSubArrayExists(int arr[], int targetSum){
        int prefixSum = 0;
        HashSet<Integer> h = new HashSet<>();

        for(int i =0; i<arr.length; i++){
            prefixSum += arr[i];

            /*
            To handle the prefix that actually starts with index=0,
            for ex : {2,3,4,6} targetSum=9
            other way is to put 0 explicitly in hashSet
             */
            if(prefixSum == targetSum){
                return true;
            }

            else if(h.contains(prefixSum-targetSum)){
                return true;
            }

            h.add(prefixSum);
        }
        return false;
    }
}
