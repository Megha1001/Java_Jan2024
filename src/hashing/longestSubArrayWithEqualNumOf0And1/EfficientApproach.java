package hashing.longestSubArrayWithEqualNumOf0And1;

import java.util.HashMap;

/*
TIME COMPLEXITY : O(N)

Approach :
1. Replace every 0 with -1.
2. now for the function to find length of the longest subarray with 9 sum
 */
public class EfficientApproach {
    public static void main(String[] args) {
        int arr[] = {1, 1, 1, 0, 1, 0, 1, 1, 1};
        int n = arr.length;
        //Replace 0 with -1
        for(int i=0; i<n; i++){
            if(arr[i]==0){
                arr[i] = -1;
            }
        }
        System.out.println("The longest subarray with equal number of 0's and 1's is "+findLongestSubArrayWith0And1(arr, n, 0));
    }

    public static int findLongestSubArrayWith0And1(int [] arr, int n , int x){
        int res = 0;
        int prefixSum = 0;
        HashMap<Integer, Integer> h = new HashMap<>();
        for(int i=0; i<n; i++){
            prefixSum += arr[i];

            if(prefixSum == x){
                res = i+1;
            }

            if(!h.containsKey(prefixSum)){
                h.put(prefixSum,i);
            }

            if(h.containsKey(prefixSum - x)){
                res = Math.max(res, i - h.get(prefixSum-x)); // i indicates ending of that subarray 5,8 ->Map ((5,0), (13,1))
            }
        }

        return res;
    }
}
