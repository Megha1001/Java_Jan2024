package deque.arrayDeque.MaxInSubArrayOfSizeK;

import java.util.Deque;
import java.util.LinkedList;

/*
* Approach : 
* 
* If we see current element is greater than element present at last --> remove that since it will not contribute being maximum element in present and in subsequent subarray 
*  otherwise add index to deque
*  -> WHY INDEX : since we need to make sure it should be deleted for next subarray consideration since element whose index<=i-k would be invalid
*   
*
*   peek --> peekFirst
*   peekLast
*   pollLast
*   offerFirst
*
*   TIME COMPLEXITY : O(N)
*   Why : Because for inner while loops that are actually like doing 2 N operation(each element add and remove atmost once)
*
*
*/

public class EffSolutionUsingDeque {
    public static void main(String args[]){
        int arr[] = {20,40,30,10,60};
        int k =3;

        System.out.println("The maximum elements in subarray of size K are : ");
        printMaxForSubarrayK(arr, k);
    }

    
    public static void printMaxForSubarrayK(int arr[], int k){

        Deque<Integer> d = new LinkedList<>();
        int n = arr.length;


        //process for first 
        
        for(int i=0; i<k; i++){

            while(!d.isEmpty() && arr[i] >= arr[d.peekLast()]){
                    d.pollLast();
            }

            d.offerLast(i);
        }

        /*
         * We are trying to maintain in non-incresing order
         */


        for(int i=k; i<n; i++){
            //print for previous subarray
            System.out.print(arr[d.peek()]+ " ");//this is peekFirst

            //remove invalid elements
            while(!d.isEmpty() && d.peek() <= i-k){//this is peekFirst
                d.pollFirst();
            }

            //check for elements(i-k-1) in present subequence that are alrady there in dequeu --> if they are <=curr_element remove them
            while(!d.isEmpty() && arr[i] >= arr[d.peekLast()]){
                d.pollLast();
            }

            d.offerLast(i);
        }

        //for last subsequence --> print max element
        System.out.print(arr[d.peek()]);

    }
}
