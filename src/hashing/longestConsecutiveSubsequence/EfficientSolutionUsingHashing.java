package hashing.longestConsecutiveSubsequence;

import java.util.HashSet;
/*
 * APPROACH
 * 1. Make HashSet (it will contain distinct elements that doesn't matter like we are interested in consecutive so duplicate doesn't matter)
 * 2. for current element
 *  - if arr[i] - 1 exists --> then its not the start of that greatest common subsequce of consecutive elements
 *  - if not exists then it start and increment current until we are encoutering consecutive elements that by checking whether they are present in the HashSet or not
 * 
 * TIME COMPLEXITY : O(N)
 * AUX SPACE : O(N)
 */

public class EfficientSolutionUsingHashing {
    public static void main(String[] args) {
        int [] arr = {2,9,4,3,5};
        System.out.println("the length of longest consecutive : "+findLongestConsecutiveSubsequence(arr));
    }

    public static int findLongestConsecutiveSubsequence(int arr[]){
        int res = 1; // be it any case it should be atleast 1 until the array is null
        int n = arr.length;

        HashSet<Integer> h = new HashSet<>();

        //populate hashSet
        for(int i=0; i<n; i++){
            h.add(arr[i]);
        }

        //iterate through hashSet
        for(Integer x : h){ //can't run until h.size() since we have to check in array for arr[i]-1
            // start of consequtive sequence
            if(!h.contains(x-1)){
                int curr = 1;
                while(h.contains(curr+x)){
                    ++curr;
                }

                res = Math.max(res, curr);
            }

        }

        return res;
    }
    
}
