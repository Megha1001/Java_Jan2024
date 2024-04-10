package stack.getMinOperationStack;

import java.util.Stack;

/*
 * TIME COMPLEXITIES
 *  Push, Pop , getMin : O(1)
 * 
 * AUX SPACE : O(1)
 */

public class DesignGetMinUsingStackWithO_1AuxSpace {

    static class MyStack{
        Stack<Integer> ms = new Stack<>();
        int min;

        public void push(int x){
            //first element
            if(ms.isEmpty()){
                ms.push(x);
                min = x;
                return;
            }

            //for elements > min -> push as is
            if(min < x){
                ms.push(x);
            }else{
                //update min as well and insert negative value to indicate its not actual value
                int temp = x-min;
                ms.push(temp);
                //update min
                min = x; // to find actual value will sum x and temp
            }

        }


        public int pop(){
            if(ms.isEmpty()){
                return -1;
            }

            if(ms.peek() < 0){
                //not actual value and have to update min
                int temp = ms.peek();
                int res = min;
                //have to pop min and update min
                int prevMin = min - temp; //to sum actually - - => +
                min = prevMin;
                return res;
            }
            return ms.pop(); //always

        }


        public int getMin(){
            if(ms.isEmpty()){
                return -1;
            }
            
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
