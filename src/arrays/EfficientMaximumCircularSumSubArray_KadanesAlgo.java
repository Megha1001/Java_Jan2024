package arrays;
/*
Approach :
    1. Max sum of normal subarray using kadane's algo -> res1
    2. Max sum of circular subarray -> res2
        a. Formula : Total sum of array - min normal subarray (using kadana's algo)
    3. Final res = Math.max(res1, res2)
 */
public class EfficientMaximumCircularSumSubArray_KadanesAlgo {
    public static void main(String[] args) {
        int arr[]={5,-2,3,4};
        System.out.println("Maximum sub of circular subarray is "+findAndGetMaxCircularSubArraySum(arr));
    }

    public static int findAndGetMaxCircularSubArraySum(int arr[]){
        int res; //final result
        int len = arr.length;

        int resMaxSumSubArray = findMaxSumSubArrayUsingKadaneAlgo(arr,len);

        //cornerCase -> all are negative then resMaxSumSubArray will give me the max sum
        if(resMaxSumSubArray < 0){
            return resMaxSumSubArray;
        }

        int resMaxSumCircularSubArray = findMaxSumCircularSubArrayUsingKadaneAlgo(arr, len);

        res = Math.max(resMaxSumSubArray, resMaxSumCircularSubArray);
        return  res;
    }

    public static int findMaxSumSubArrayUsingKadaneAlgo(int arr[], int n){
        int res = arr[0];
        int maxEnding = arr[0];

        for(int i=1; i<n; i++){
            maxEnding = Math.max(maxEnding, maxEnding+arr[i]);
            res = Math.max(res, maxEnding);
        }

        return res;
    }

    public static int findMaxSumCircularSubArrayUsingKadaneAlgo(int arr[], int n){
        int res = arr[0];
        int sum = arr[0];
        int minEnding = arr[0];

        for(int i=1; i<n; i++){
            minEnding = Math.min(minEnding, minEnding+arr[i]);
            res = Math.min(res, minEnding);
            sum += arr[i];
        }

        return sum - res;
    }
}
