package hashing.longestCommonSpanWithSameSumInBinaryArrays;

import java.util.HashMap;

/*
TIME COMPLEXITY : O(N)
AUX SPACE : O(N)

Approach :
1. Compute a difference array
2. Return length of the longest subarray with 0 sum in temp
    - Values in temp
        - we get 0 when values are same in both
        - we get 1 when arr1[i] = 1 and arr2[i] = 0
        - we get -1 when arr1[i] = 0 and arr2[i] = -1

The same number like when we get 0, we can add pairs of 1, and -1 to keep it zero and to include in ans
arr1[] = {0,1,0,0,0,0}
arr2[] = {1,0,1,0,0,1}
temp[] = {-1,1,-1,0,0,-1}

1,-1,0,0 -> we can include pair of 1 and -1
 */
public class EfficientSolutionUsingHashing {
    public static void main(String[] args) {
        int[] arr1 = {0, 1, 0, 1, 1, 1, 1};
        int[] arr2 = {1, 1, 1, 1, 1, 0, 1};
        int temp[] = computeTempArray(arr1, arr2);
        System.out.println("Longest common subarray with maximum sum is "+findLongestCommonSubArray(temp));
    }

    public static int[] computeTempArray(int arr1[], int arr2[]){
        int temp[] = new int[arr1.length];
        for(int i=0; i<arr1.length; i++){
            temp[i] = arr1[i] - arr2[i];
        }
        return temp;
    }

    public static int findLongestCommonSubArray(int temp[]){
        int res = 0;
        int prefix = 0;
        HashMap<Integer, Integer> h = new HashMap<>();

        for(int i=0; i<temp.length; i++){
            prefix += temp[i];

            if(prefix == 0){
                res = i+1;
            }

            if(!h.containsKey(prefix)){
                h.put(prefix, i);
            }

            if(h.containsKey(prefix-0)){
                res = Math.max(res, i- h.get(prefix-0));
            }

        }

        return res;
    }
}
