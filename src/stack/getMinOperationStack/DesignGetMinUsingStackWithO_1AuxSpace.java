package stack.getMinOperationStack;

import java.util.Stack;

public class DesignGetMinUsingStackWithO_1AuxSpace {


    static class MyStack{
        Stack<Integer> s = new Stack<>();
        int min;

        void push(int x){
            if(s.isEmpty()){
                s.push(x);
                min = x;
                return;
            }

            //x might be min , --> update min
            if(x<=min){
                s.push(2*x-min);
                min = x;
            }else{
                s.push(x);
            }
        }

        int pop(){
            int t = s.pop();

            //top element can we min and to return min and update min to second min
            if(t<=min){
                int res = min;

                //update min to second min
                min = 2*min - t;

                return res;
            }

            return t;
        }
        
        int peek(){
            int t = s.peek();

            return (t<=min)? min: t;
        }

        int getMin(){
            return min;
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
