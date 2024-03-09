package arrays;
/*
TIME COMPLEXITY : O(N*N)
 */
public class NaiveMaxSumSubArray {
    public static void main(String[] args) {
        int arr[] ={2,3,-8,7,-1,2,3};
        System.out.println("Maximum sum of subarray is :"+findAndGetMaxSum(arr));
    }

    public static int findAndGetMaxSum(int arr[]){
        int res = 0;
        for(int i=0; i<arr.length; i++){
            int curr =0;
            for(int j=i; j<arr.length; j++){
                curr = curr +arr[j];
                res = Math.max(curr, res);
            }
        }
        return res;
    }
}
