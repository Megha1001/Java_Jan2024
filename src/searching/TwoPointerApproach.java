package searching;
/*
 * TIME COMPLEXITY : O(N)
 */
public class TwoPointerApproach {
    public static void main(String[] args) {
        int arr[] = {2,4,8,9,11,12,20,30};
        int x = 23;
        System.out.println("is any pair exists with given value ? "+isPairExists(arr, x));
    }

    public static boolean isPairExists(int arr[], int x){
        int i = 0;
        int j = arr.length -1;
        while(i < j){
            int sum = arr[i]+arr[j];
            if(sum==x){
                return true;
            }else if(sum > x){
                --j;
            }else{
                ++i;
            }
        }
        return false;
    } 
}
