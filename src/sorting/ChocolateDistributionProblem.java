package sorting;

import java.util.Arrays;

public class ChocolateDistributionProblem {

    public static void main(String args[]){
        int arr[] = {7,3,2,4,9,12,56};
        int m = 3;
        System.out.println("Min difference is :"+findMinDifference(arr, m));
    }

    public static int findMinDifference(int arr[], int m){
        int n = arr.length;
        if(m > n){
            return -1;
        }
        Arrays.sort(arr);
        //considering first m students will have min difference
        int res = arr[m-1] - arr[0];
        
        for(int i=0;(i+m-1)<n;i++){
            res = Math.min(res, arr[m+i-1] - arr[i]);
        }


        return res;
    }
    
}
