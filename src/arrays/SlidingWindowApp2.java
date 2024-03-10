package arrays;

public class SlidingWindowApp2 {
    public static void main(String[] args) {
        int arr[] ={1,8,30,-5,20,7};
        int k=4;
        System.out.println("The maximum sum of "+k+" consecutive elements is :"+findAndGetMaxSumOfKConsecutiveElements(arr, k));
    }

    public static int findAndGetMaxSumOfKConsecutiveElements(int arr[], int k){
        int res = Integer.MIN_VALUE;
        int currSum=0;

        //sum first k elements
        for(int i=0; i<k; i++){
            currSum += arr[i];
        }
        res = currSum;

        //use result of first k element in computing the slided slate and considering the start as end of next slide
        // K : is actually not zero-indexed so actually if we are using K means its an end of next slide.
        //arr[i] : is pointing to end of current slide
        //arr[i-k] : is pointing to first element of previous slide
        for(int i=k; i<arr.length; i++){
            currSum += arr[i] - arr[i-k];
            res = Math.max(currSum, res);
        }

        return res;
    }
}
