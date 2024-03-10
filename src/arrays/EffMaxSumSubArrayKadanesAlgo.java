package arrays;
/*
TIME COMPLEXITY : O(N)
The idea is to maintain a variable maxEnding that stores the maximum sum contiguous subarray
ending at the current index and a variable res stores the maximum sum of contiguous subarray
found so far.
Everytime there is a positive-sum value in maxEnding comapre it with res and update res if its
greater than res.

 */
public class EffMaxSumSubArrayKadanesAlgo {
    public static void main(String[] args) {
        int arr[] ={2,3,-8,7,-1,2,3};
        System.out.println("Maximum sum of subarray is :"+findAndGetMaxSum(arr));
    }

    public static int findAndGetMaxSum(int arr[]){
        int res = arr[0];
        int maxEnding = arr[0];
        for(int i=1; i<arr.length; i++){
            maxEnding = Math.max(maxEnding+arr[i],arr[i]);
            res = Math.max(res, maxEnding);
        }

        return res;
    }
}
