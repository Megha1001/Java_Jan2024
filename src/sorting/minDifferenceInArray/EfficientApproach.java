package sorting.minDifferenceInArray;

import java.util.Arrays;

/*
TIME COMPLEXITY : O(NLOGN)
 */
public class EfficientApproach {

    public static void main(String[] args) {
        int arr[] = {1,8,12,5,18};
        System.out.println("The min difference b/w two elements of arrays is "+findMinDiff(arr));
    }

    public static int findMinDiff(int arr[]){
        //sort
        Arrays.sort(arr);

        //find adjacent diff and update min
        int res = Integer.MAX_VALUE;

        for(int i = 1; i< arr.length; i++){
            res = Math.min(res, arr[i]- arr[i-1]);
        }

        return res;
    }

}
