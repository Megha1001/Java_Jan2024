package arrays;
/*
Approach :
    1. Find the maximum of all the subarray by considering every element as starting position.
    2. out of all the maximum subarray sum found in step 1 found the maximum out of it

    TIME COMPLEXITY : O(N*N)
 */
public class NaiveMaximumCircularSumSubArray {
    public static void main(String[] args) {
        int arr[]={5,-2,3,4};
        System.out.println("Maximum sub of circular subarray is "+findAndGetMaxCircularSubArraySum(arr));
    }

    public static int findAndGetMaxCircularSubArraySum(int arr[]){
        int res = arr[0]; //take care for step2
        int n = arr.length;

        for(int i=0; i<n; i++){
            int currMax = arr[i];
            int currSum = arr[i];
            for(int j=1; j<n; j++){ // why considering 1->n ; Since we have to consider for all the elements be it from wherever we are starting
                // so instead of complex logic of % we are going for n elements that we do while implementing complex %logic as well, and since sum is associate so the order
                //will not mattter
                int index = (i+j)%n;
                currSum += arr[index];
                currMax = Math.max(currMax, currSum);
            }
            res = Math.max(res, currMax);
        }

        return res;
    }
}
