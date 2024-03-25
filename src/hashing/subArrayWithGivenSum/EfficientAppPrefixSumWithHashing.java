package hashing.subArrayWithGivenSum;

import java.util.HashSet;

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
