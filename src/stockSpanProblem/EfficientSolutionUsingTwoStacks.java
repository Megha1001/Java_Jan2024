package stockSpanProblem;

import java.util.Deque;
import java.util.ArrayDeque;

public class EfficientSolutionUsingTwoStacks {

    public static void main(String args[]){
        int arr[] = {30,20,25,28,27,29};

        System.out.println("The stock span for all the days are :");
        findAndPrintSpan(arr);
    }


    public static void findAndPrintSpan(int arr[]){

        Deque<Integer> s1 = new ArrayDeque<>(); //main stack
        Deque<Integer> s2 = new ArrayDeque<>(); //temporary stack


        for(int element : arr) {
            int span = 1;

            //check stack is empty
            if(s1.isEmpty()){
                s1.push(element);
                System.out.print(span+" ");
                continue;
            }

            // Pop elements from s1 if they are smaller than or equal to the current element    
            while(!s1.isEmpty() && s1.peek()<=element){
                s2.push(s1.pop());
                ++span;
            }

            System.out.print(span+" ");

            // Push back elements from s2 to s1
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }

            s1.push(element);

        }
    }
}
