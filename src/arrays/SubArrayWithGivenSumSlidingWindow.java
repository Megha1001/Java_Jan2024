package arrays;

public class SubArrayWithGivenSumSlidingWindow {
    public static void main(String[] args) {
        int arr[] = {1,4,20,3,10,5};
        int sum = 33;
        System.out.println("Does the subarray with given sum:"+sum+" exists? "+isSubArrayExists(arr,sum));
    }

    //check for all possible sliding window sum
    public static boolean isSubArrayExists(int arr[], int sum){
        for(int i= 0; i<arr.length; i++){
          if(isSumWithKSlidingWindowExists(arr, i, sum)){
              return true;
          }
        }
        return false;
    }

    public static boolean isSumWithKSlidingWindowExists(int arr[], int k, int sum){
        //cal sum for first k elements
        int currSum=0;
        for(int i=0; i<k; i++){
            currSum += arr[i];
        }

        for(int i=1; (i+k-1)<arr.length; i++){
            currSum+= arr[i+k-1] - arr[i-1];
            if(currSum==sum){
                return true;
            }
        }

        return false;
    }
}
