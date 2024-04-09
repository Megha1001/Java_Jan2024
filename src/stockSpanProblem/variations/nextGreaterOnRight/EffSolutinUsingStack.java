package stockSpanProblem.variations.nextGreaterOnRight;

import java.util.Stack;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

/*
 * TIME COMPLEXITY : O(NlogN)
 * AUX SPACE : O(N)
 */

public class EffSolutinUsingStack {
    public static void main(String args[]){
        int arr[] = {5,15,10,8,6,12,9,18};

        System.out.println("The nearest greatest element on righ side of each elements are : ");
        System.out.println(Arrays.asList(getAndPrintGreatestNearestElement(arr)));
    }

    public static ArrayList<Integer> getAndPrintGreatestNearestElement(int []arr){
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;
        if(n==0){
            return null;
        }

        Stack<Integer> s = new Stack<>();
        
        s.push(arr[n-1]);
        // System.out.print(-1+" ");
        list.add(-1);

        for(int i=n-2; i>=0; i--){ // TC : O(N)
            while(!s.isEmpty() && s.peek() <= arr[i]){
                s.pop();
            }

            int span = s.isEmpty() ? -1 : s.peek();
            /*
             * Issue is it will print in reverse order
             */
            // System.out.print(span+" ");
            list.add(span);
            s.push(arr[i]);
        }
        Collections.reverse(list);   // TC : O(NlogN)
        return list;

    }
}
