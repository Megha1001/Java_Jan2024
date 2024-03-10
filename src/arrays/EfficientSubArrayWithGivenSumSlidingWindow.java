package arrays;

/*
TIME COMPLEXITY : O(N)
 */
public class EfficientSubArrayWithGivenSumSlidingWindow {
    public static void main(String[] args) {
        int arr[] = {1,4,20,3,10,5};
        int sum = 25;
        System.out.println("Does the subarray with given sum:"+sum+" exists? "+isSubArrayExists(arr,sum));
    }

    public static boolean isSubArrayExists(int arr[], int targetSum){
        int sum = 0;
        int k = -1;
        //calculate K
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
            if(sum >= targetSum){
               k=i;
               break;
            }
        }

        if(sum==targetSum){
            return true;
        }

        //shrink the sum to find if we have target subarray
        for(int i=1; (i+k-1)<arr.length; i++){
            sum = sum - arr[i-1]; //only shrinking
            if(sum==targetSum){
                return true;
            }
        }

        return false;
    }
}
