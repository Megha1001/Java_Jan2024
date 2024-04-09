package stack.largestAreaOfRectangleInHistogram;
/*
 * Approach : We consider every element as the smallest bar , the bar with the minimum height in the rectangle and we find the rectangle area with this bar being the smallest and return the largest area.
 * 
 * How do we find the ara of the rectangle where arr[i] is the smallest bar ? --> curr
 *  -> Go on left until we are finding arr[x]>=arr[i] and add arr[i] at every successful find
 *  -> Go to right and do the same we are doing on left
 * 
 * For res
 *  - Math.max(res, curr)
 * 
 * 
 * TIME COMPLEXITY : O(N^2)
 */

public class NaiveSolution {

    public static void main(String args[]){
        // int arr[] = {6,5,2,4,1,5,6}; // Result : 10
        int arr[] = {2,2,2}; // Result : 6

        System.out.println("The largest area of rectangle in histogram is "+findLargestArea(arr));
    }

    public static int findLargestArea(int arr[]){
        int n = arr.length;
        int res = 0;

        //consider every element as smallest
        for(int i=0; i<n; i++){
            int curr = arr[i];


            //go on left
            for(int j=i-1; j>=0; j--){
                if(arr[j] >= arr[i]){
                    curr += arr[i];
                }else{
                    break;
                }
            }

            //go on right
            for(int j=i+1; j<n; j++){
                if(arr[j] >= arr[i]){
                    curr += arr[i];
                }else{
                    break;
                }
            }

            res = Math.max(res, curr);

        }

        return res;
    }
    
}
