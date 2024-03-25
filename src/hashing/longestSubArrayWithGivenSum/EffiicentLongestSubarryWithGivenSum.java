package hashing.longestSubArrayWithGivenSum;

import java.util.HashMap;
/*
TIME COMPLEXITY : O(N)
AUX SPACE : O(N)
 */
public class EffiicentLongestSubarryWithGivenSum {
    public static void main(String[] args) {
        int arr[] = new int[]{5, 8, -4, -4, 9, -2, 2};
        int n = arr.length;
        int sum = 0;
        System.out.println(largestSubarrayWithSumX(arr, n, sum));
    }

    public static int largestSubarrayWithSumX(int arr[], int n, int targetSum){
        int res = 0;
        int prefixSum = 0;
        HashMap<Integer, Integer> h = new HashMap<>();
        //traverse array
        for(int i=0; i<n; i++){

            //find prefixSum
            prefixSum += arr[i];

            //since we are starting from index=0 and found the target it would be the longest one
            if(prefixSum == targetSum){
                 res = i+1;
            }

            //populate hash map , we are not putting prefix when they encountered again since will maintain the lower index to get the largest value for length of subarray
            if(!h.containsKey(arr[i])){
                h.put(arr[i], i);
            }

            if(h.containsKey(prefixSum - targetSum)){
                res = Math.max(res, i- h.get(prefixSum - targetSum));
            }
        }

        return res;
    }
}
