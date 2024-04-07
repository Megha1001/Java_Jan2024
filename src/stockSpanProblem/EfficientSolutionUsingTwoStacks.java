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
        boolean firstElement = true;


        for(int element : arr){
            int span=1;

            //check stack -> basically for first element
            if(s1.isEmpty() && firstElement){
                System.out.print(span+" ");
                firstElement = false;
                s1.push(element);
                continue;
            }

            if(!s1.isEmpty() && s1.peek()>element){
                //push to s1
                while(!s1.isEmpty() && s1.peek()>element){
                    s1.push(element);
                    System.out.print(span+" ");
                    break;
                }
            }else if(!s1.isEmpty() && s1.peek() <= element){
                //not empty and element on top is <= curr
                while(!s1.isEmpty() && s1.peek() <= element){
                    ++span;
                    s2.push(s1.pop());
                }

                System.out.print(span+" ");

                //push back from s2->s1
                while(!s2.isEmpty()){
                    s1.push(s2.pop());
                }

                s1.push(element);
            }
        }

    }
}
