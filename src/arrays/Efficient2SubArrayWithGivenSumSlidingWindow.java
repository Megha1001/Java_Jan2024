package arrays;

public class Efficient2SubArrayWithGivenSumSlidingWindow {
    public static void main(String[] args) {
        int arr[] = {1,4,20,3,10,5};
        int sum = 25;
        System.out.println("Does the subarray with given sum:"+sum+" exists? "+isSubArrayExists(arr,sum));
    }

    public static boolean isSubArrayExists(int arr[], int targetSum){
        int currSum=0, s=0;

        for(int i=0; i<arr.length; i++){
            currSum += arr[i];

            while(currSum > targetSum){
                currSum -= arr[s];
                --s;
            }

            if(currSum == targetSum){
                return true;
            }
        }

        return false;
    }
}
