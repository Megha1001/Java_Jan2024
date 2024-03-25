package hashing.longestSubArrayWithGivenSum;

public class NaiveLongestSubarrayWithGivenSum {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int sum = 5;
        System.out.println("Longest subarray with given sum is :"+findLongestSubArrayWithGivenSum(arr, sum));
    }

    private static int findLongestSubArrayWithGivenSum(int[] arr, int sum) {
        int res = 0;
        int n = arr.length;
        for(int i=0; i<n; i++){
            int currSum = 0;
            for(int j=i; j<n; j++){
                currSum += arr[j];
                if(currSum == sum){
                    res = Math.max(res, j-i+1);
                }
            }
        }

        return res;
    }


}
