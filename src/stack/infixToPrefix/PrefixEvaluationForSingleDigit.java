package stack.infixToPrefix;

import java.util.Stack;

/*
 * TIME COMPLEXITY : O(N)
 */

public class PrefixEvaluationForSingleDigit {

    public static void main(String args[]){
        String input = "+9*26";

        System.out.println("The prefix evaluation for given expression is ");
        findPrefixEvaluation(input);
    }


    public static void findPrefixEvaluation(String s){

        Stack<Integer> stack = new Stack<>();

        for(int i=s.length()-1; i>=0; i--){
            char c = s.charAt(i);

            //check for digits
            if(Character.isDigit(c)){
                stack.push(c-'0'); //store the digit
            }
            //handle operands
            else{
                int val1 = stack.pop();
                int val2 = stack.pop();
                int res=0;

                switch(c){

                    case '+' :
                        res = val1+val2;
                        break;
                    
                    case '-' :
                        res = val1 - val2;
                        break;
                    
                    case '*' :
                        res = val1 * val2;
                        break;
                    
                    case '/' :
                        res = val1 / val2;
                        break;

                }
                stack.push(res);
            }


        }

        System.out.println(stack.pop());

    }
    
}
