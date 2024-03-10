package arrays;

public class SlidingWindow {
    public static void main(String[] args) {
        int arr[] ={1,8,30,-5,20,7};
        int k=4;
        System.out.println("The maximum sum of "+k+" consecutive elements is :"+findAndGetMaxSumOfKConsecutiveElements(arr, k));
    }

    public static int findAndGetMaxSumOfKConsecutiveElements(int arr[], int k){
        int res = Integer.MIN_VALUE;
        int currSum = 0;
        //find sum of k elements
        for(int i=0; i<k; i++){
            currSum +=arr[i];
        }
        res = currSum;
        //use res of currSum in computing next sliding window -> considering starting of next window as starting index
        for(int i=1; (i+k-1)<arr.length; i++){
            currSum = currSum -arr[i-1] + arr[i+k-1]; //subtracting 1st element of previous window and adding last element of current window.
            //substracting -1 from i+k since k is not zero indexed
            res = Math.max(res,currSum);
        }

        return res;
    }
}
