package arrays;
/*
TIME COMPLEXITY : O(N)
 */
public class EffMaxDifferenceProblem {
    public static void main(String[] args) {
        int arr[] = {2,3,10,6,4,8,100};
        System.out.println("Maximum difference b/w two pairs is "+getMaxDiff(arr));
    }
    
    public static int getMaxDiff(int arr[]){
        int res = arr[1]-arr[0];
        int minValue = arr[0];
        for(int i=1; i<arr.length; i++){
            res = Math.max(res, arr[i]-minValue);
            minValue = Math.min(minValue,arr[i]);
        }
        return res;
    }
}
