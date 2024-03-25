package hashing.longestCommonSpanWithSameSumInBinaryArrays;
/*
TIME COMPLEXITY : O(N^2)
 */
public class NaiveSolution {
    public static void main(String[] args) {
        int arr1[] = {0,1,0,0,0,0};
        int arr2[] = {1,0,1,0,0,1};
        System.out.println("Longest common subarray with maximum sum is "+findLongestCommonSubArray(arr1, arr2));
    }

    public static int findLongestCommonSubArray(int []arr1, int[]arr2){
        int res = 0;

        /*
        Both arrays size is same , hence will traverse through both the array simultaneously and check when both the sum is equal then compare with max sum seen so far
         */
        for(int i=0; i< arr1.length; i++){
            //calculate for every subarray
            int sum1 = 0;
            int sum2 = 0;
            for(int j=i; j<arr1.length; j++){
                sum1 += arr1[j];
                sum2 += arr2[j];

                if(sum1 == sum2){
                    res = Math.max(j-i+1, res);
                }
            }
        }

        return res;
    }
}
