package arrays;
/*
TIME COMPLEXITY : O(N*K)
AUX SPACE : O(1)
 */
public class NaiveMaximumSumOfKConsecutiveElements {
    public static void main(String[] args) {
        int arr[] ={1,8,30,-5,20,7};
        int k=3;
        System.out.println("The maximum sum of "+k+" consecutive elements is :"+findAndGetMaxSumOfKConsecutiveElements(arr, k));
    }

    public static int findAndGetMaxSumOfKConsecutiveElements(int arr[], int k){
        int res = Integer.MIN_VALUE;
        int n=arr.length;

        for(int i=0; (i+k-1)<n; i++){
            int curr = 0;
            for(int j=0; j<k; j++){
                curr += arr[i+j]; //making i as offset
            }
            res = Math.max(res ,curr);
        }

        return res;
    }

}
