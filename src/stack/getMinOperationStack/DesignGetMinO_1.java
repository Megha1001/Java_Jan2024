package stack.getMinOperationStack;

import java.util.Stack;

public class DesignGetMinO_1 {

    static class MyStack{
        Stack<Integer> ms = new Stack<>();
        Stack<Integer> as = new Stack<>();


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

    }
    
}
