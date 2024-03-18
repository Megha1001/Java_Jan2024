package sorting.minDifferenceInArray;
/*
TIME COMPlEXITY : O(N^N)
 */
public class NaiveApproach {
    public static void main(String[] args) {
        int arr[] = {1,8,12,5,18};
        System.out.println("The min difference b/w two elements of arrays is "+findMinDiff(arr));
    }

    public static int findMinDiff(int arr[]){
        //find for every pair
        int res = Integer.MAX_VALUE;
        int n = arr.length;
        for(int i=1; i<n; i++){
            for(int j=0; j<i; j++){
                res = Math.min(res, Math.abs(arr[i] - arr[j]));
            }
        }

        return res;
    }
}
