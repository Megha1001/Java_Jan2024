package stack.infixToPostfix;

import java.util.Stack;
/*
 * Approach : No need to care about precedence, associativity
 * 
 * Scan the string from L to R :
 *      If get operand(here digit) push to stack
 *      if get operator:
 *          - pop last two values from stack and evaluate it please keep it mind the some operands are not commutative( like - & /) and then push the result back to stack
 * 
 * TIME COMPLEXITY : O(N)
 * AUX SPACE : O(N)
 * 
 * 
 */
public class PostfixEvaluationForSingleDigit {

    public static void main(String [] args){
        String s = "231*+9-"; //space is delimiter

        System.out.println("Evaluation of given postfix expression is :");
        evaluate(s);
    }

    public static void evaluate(String s){
        Stack<Integer> stack = new Stack<>();


        for(char c : s.toCharArray()){

            //check for digit
            if(Character.isDigit(c)){
                stack.push(c-'0'); // to convert to integer
            }

            else{
                int val1 = stack.pop();
                int val2 = stack.pop();

                int res = 0;

                switch(c){

                    case '+' :
                        res = val1+val2; //commutative
                        break;
                    
                    case '-' :
                        res = val2 - val1; //not commutative
                        break;
                    
                    case '*' :
                        res = val1 * val2; //commutative
                        break;
                    
                    case '/' :
                        res = val2 / val2; //not commutative
                        break;
                
                }

                stack.push(res);

            }

        }

        System.out.println(stack.pop());

    }
    
}
