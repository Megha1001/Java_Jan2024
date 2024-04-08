package stockSpanProblem.variations.findNearestGreaterOnLeft;

import java.util.Stack;
/*
 * APproach : Similar to stock span problem but instead of pushing index to stack push element.
 * 
 * TIME COMPLEXITY : O(N)
 * AUX SPACE : O(N)
 */

public class EffSolutionUsingStack {
    public static void main(String args[]){
        int arr[] = {15,10,18,12,4,6,2,3};

        System.out.println("The nearest greatest element on left side of each elements are : ");
        getAndPrintGreatestNearestElement(arr);

    }

    public static void getAndPrintGreatestNearestElement(int [] arr){
        int n = arr.length;
    
        //corner case
        if(n==0){
            return;
        }

        Stack<Integer> s = new Stack<>();
        s.push(arr[0]);
        System.out.print(-1+" "); 

        for(int i=1; i<n; i++){
            while(!s.isEmpty() && s.peek() <= arr[i]){
                s.pop();
            }

            int res = s.isEmpty() ? -1: s.peek();
            System.out.print(res+" ");

            s.push(arr[i]);
        }
    
    }

}
