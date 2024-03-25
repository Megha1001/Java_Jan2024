package hashing.subArrayWithGivenSum;

/*
TIME COMPLEXITY : O(N)
AUX SPACE : O(N) -> hashSet
Approach : calculate prefix sum and store it in HashSet if we encounter same prefix sum again
that means there is a sum array whose sum is zero.
 */
import java.util.HashSet;

public class EfficientAppPrefixSumWithHashing {
    public static void main(String[] args) {
        int arr[] = {-3,4,-3,-1,1};
        System.out.println("is there any subarrays exists with sum zero ?"+findSumArray(arr));
    }

    public static boolean findSumArray(int arr[]){
        HashSet<Integer> h = new HashSet<>();
        int prefixSum = 0;
        for(int i=0; i<arr.length; i++){
            prefixSum +=arr[i];

            if(h.contains(prefixSum)){
                return true;
            }

            if(prefixSum ==0){
                return true;
            }
            h.add(prefixSum);
        }

        return false;
    }
}
