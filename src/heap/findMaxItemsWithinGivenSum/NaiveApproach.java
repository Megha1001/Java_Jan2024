package heap.findMaxItemsWithinGivenSum;


/*
Approach
1. Sort the array in natural order ( we can pick only when we pick smaller elements first)

TIME CoMPLEXITY : O(NlogN)
AUX SPACE : O(1), if modification same array is allowed otherwise O(N)
 */


import java.util.Arrays;

public class NaiveApproach {

    public static void main(String[] args) {
        int arr[] = {1,12,5,111,200};
        Arrays.sort(arr);

        int res=0;
        int sum = 0;
        int target = 10;

        for(int i=0; i<arr.length; i++){
            sum += arr[i];
            if(sum<=target){
                ++res;
            }
        }

        System.out.println("Maximum items that can be picked is :"+res);

    }
}
