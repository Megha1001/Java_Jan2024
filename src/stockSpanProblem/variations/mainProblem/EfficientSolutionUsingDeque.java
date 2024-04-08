package stockSpanProblem.variations.mainProblem;

import java.util.Deque;
import java.util.ArrayDeque;

/*
Approach :
1. if there is a greater element on left side
    -> Span = Index of current element - index of closest greater element on left side

2. Otherwise
    ->  Span = index of current element +1 (since its the largest element till now.)
 */
public class EfficientSolutionUsingDeque {

    public static void main(String args[]){
        int arr[] = {30,20,25,28,27,29};

        System.out.println("The stock span for all the days are :");
        findAndPrintSpan(arr);
    }

    public static void findAndPrintSpan(int [] arr){

        int n = arr.length;

        Deque<Integer> deque = new ArrayDeque<>(); //store the indexes
        deque.push(0);
        System.out.print(1+" ");

        for(int i=1; i<n; i++){
            while(!deque.isEmpty() && arr[deque.getLast()] <= arr[i]){
                deque.removeLast();
            }
            int span = deque.isEmpty()? i+1 : i - deque.getLast();
            System.out.print(span+" ");

            deque.push(i);
        }

    }

}
