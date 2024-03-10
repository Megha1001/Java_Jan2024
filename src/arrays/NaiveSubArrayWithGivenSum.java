package arrays;
/*
TIME COMPLEXITY: O(N*N)
 */
public class NaiveSubArrayWithGivenSum {
    public static void main(String[] args) {
        int arr[] = {1,4,20,3,10,5};
        int sum = 33;
        System.out.println("Does the subarray with given sum:"+sum+" exists? "+isSubArrayExists(arr,sum));
    }

    public static boolean isSubArrayExists(int arr[], int sum){
        boolean result = false;
        int n = arr.length;

        for(int i=0; i<n; i++){
            int curr = 0;
            for(int j = i; j<n; j++){
                curr += arr[j];
                if(curr == sum){
                    return true;
                }
            }
        }

        return result;
    }
}
