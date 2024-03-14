package searching.searchTriplet;

/*
 * TIME COMPLEXITY : O(N^2)
 * Approach : 
 * 1. Traverse the array from L to R for every element
 * 2. for every element arr[i] search a pair on right side whose sum is x-arr[i], where x is the target sum
 * 
 * Note: It will work for both sorted and unsorted array, in case of unsorted --> sort the array first in O(NlogN) time. The overall complexity will still remain
 * the same 
 *  = O(N^2) + O(NlogN) = O(N^2)
 */
public class EfficientAppUsingBinarySearch {
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 8, 9, 20, 40};
        int x = 62;
        System.out.println("is the triplet exists with given item ? "+searchTriplet(arr, x));
    }

    public static boolean searchTriplet(int arr[], int x){
        int n = arr.length;
        for(int i=0; i<n-2; i++){ //Going till n-2 so we would have two elements at right to form triplet
            if(searchPair(arr, i+1, n-1, x-arr[i])){
                return true;
            }
        }
        return false;
    }

    //Two pointer approach
    public static boolean searchPair(int arr[], int s, int e, int x){
        while(s < e){
            int sum = arr[s]+arr[e];
            if(sum == x){
                return true;
            }else if(sum > x){
                // move e
                --e;
            }else{
                //move s
                ++s;
            }
        }
        return false;
    }
}