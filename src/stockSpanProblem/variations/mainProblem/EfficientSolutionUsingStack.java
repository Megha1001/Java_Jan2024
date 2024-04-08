package stockSpanProblem.variations.mainProblem;

import java.util.Stack;

/*
Approach :
1. if there is a greater element on left side
    -> Span = Index of current element - index of closest greater element on left side

2. Otherwise
    ->  Span = index of current element +1 (since its the largest element till now.)

    TIME COMPLEXITY : O(N) ---> we are pushing and poping every item atmost once
    AUX Space : O(N
 */
public class EfficientSolutionUsingStack {

    public static void main(String args[]){
        int arr[] = {30,20,25,28,27,29};

        System.out.println("The stock span for all the days are :");
        findAndPrintSpan(arr);
    }

    public static void findAndPrintSpan(int [] arr){

        int n = arr.length;

        Stack<Integer> s = new Stack<>(); //store indexes
        s.push(0); //for first elment
        System.out.print(1+" ");

        for(int i=1; i<n; i++){
            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
                s.pop();
            }

            int span = s.isEmpty() ? i+1 : i-s.peek();
            System.out.print(span +" ");
            s.push(i);
        }

    }

}
