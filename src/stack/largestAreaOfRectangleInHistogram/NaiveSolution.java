package stack.largestAreaOfRectangleInHistogram;

/*
 * Approach :
 * The result can be of one of below three for every element until we reach the last element
 *  -> value arr[i] itself
 *  -> value of  Math.min(arr[i],arr[i+1])*2
 *  -> max value found so far
 * 
 * TIME COMPLEXITY : O(N)
 * AUX SPACE : O(1)
 */

public class NaiveSolution {

    public static void main(String args[]){
        // int arr[] = {6,5,2,4,1,5,6}; // Result : 10
        int arr[] = {2,5,1}; // Result : 5

        System.out.println("The largest area of rectangle in histogram is "+findLargestArea(arr));
    }

    public static int findLargestArea(int arr[]){
        int n = arr.length;
        if(n==0){
            return -1;
        }

        int res=-1;

        for(int i=0; i<n; i++){
            int cal = res;
            if(i+1 < n){
                cal = Math.min(arr[i],arr[i+1])*2;
            }

            res = Math.max(res, Math.max(arr[i], cal));
        }



        return res;
    }
    
}
