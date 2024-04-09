package stack.getMinOperationStack;

import java.util.Stack;

/*
 * TIME COMPLEXITIES
 *  Push, Pop , getMin : O(1)
 * 
 * AUX SPACE : O(N)
 */

public class DesignGetMinUsingStack {

    static class MyStack{
        Stack<Integer> ms = new Stack<>();
        Stack<Integer> as = new Stack<>(); //--> this is Aux space


        //push operation -> element x
        /*
         * 1. For first element push to both ms and as
         * 2. Always push to ms
         *  - Push to as only when as.peek() >= x
         * 
         */

        public void push(int x){
            //first elmenet
            if(ms.isEmpty() && as.isEmpty()){
                ms.push(x);
                as.push(x);
                return;
            }
            //always push to ms
            ms.push(x);

            if(as.peek()>=x){
                as.push(x);
            }
        }

        //pop operation
        /*
         * 1. Always pop from ms
         * 2. pop from as only when x==as.peek()
         */

        public void pop(){
            if(ms.isEmpty()){
                return; //underflow
            }

            if(as.peek()==ms.peek()){
                as.pop();
            }

            //always pop from ms
            ms.pop();
        }


        //get min
        public int getMin(){
            if(as.isEmpty()){
                return -1;
            }

            return as.peek();
        }

    }

    public static void main(String args[]){
        MyStack myStack = new MyStack();
        myStack.push(5);
        myStack.push(10);
        myStack.push(4);
        myStack.push(2);
        myStack.push(6);
        myStack.pop();
        myStack.pop();
        myStack.push(4);
        myStack.push(3);
        myStack.pop();
        myStack.pop();
        
        System.out.print("The min element till now is "+myStack.getMin());


    }
    
}
