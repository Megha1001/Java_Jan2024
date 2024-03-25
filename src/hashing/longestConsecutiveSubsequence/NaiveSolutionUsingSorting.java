package hashing.longestConsecutiveSubsequence;

import java.util.Arrays;
/*
 * Consecutive Subsequence : We need to find the longest subsequence in the ofrm of x, x+1, x+2 with these elements
 * appearing in any order
 *         int [] arr = {2,9,4,3,5};
 *         2,3,4,5 -> result : 4
 * 
 * Approach :
 * 1. sort the array
 * 2. check the present element and its previous element
 *  - If yes, then increment the result count by 1 
 *  - if no, then it means the current consecutive sequence has been ended and new one going to start. Hence, compute the res and update accordingy(using max function) and set curr = 1
 * 
 * 
 * TIME COMPLEXITY : O(NLogN)
 * AUX SPACE : O(N)
 */

public class NaiveSolutionUsingSorting {
    public static void main(String[] args) {
        int [] arr = {2,9,4,3,5};
        System.out.println("the length of longest consecutive : "+findLongestConsecutiveSubsequence(arr));
    }

    public static int findLongestConsecutiveSubsequence(int arr[]){
        Arrays.sort(arr);
        
        int res = 1;
        int curr = 1;

        for(int i=1; i<arr.length; i++){
            //consecutive
            if(arr[i]-arr[i-1]==1){
                curr++;
            }else{
                //not consecutive, now new consecutive subsequence will start
                res = Math.max(res, curr);
                curr = 1;
            }
        }

        return res;
    }
}
