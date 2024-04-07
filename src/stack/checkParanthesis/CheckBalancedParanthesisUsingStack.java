package stack;

import java.util.Stack;

public class CheckBalancedParanthesis {
    public static void main(String args[]){
        String input = "(())";

        System.out.println("is input string has balanced paranthesis : "+ isBalanced(input));
    }
    

    public static boolean isBalanced(String s){
        if(s.isEmpty()){
            return true;
        }

        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()){
            if(c=='{' || c=='(' || c=='['){
                stack.push(c);
            }else{

                if(stack.isEmpty()){
                    return false;
                }else if (c== '}' && stack.peek() != '{'){
                    return false;
                }else if (c== ']' && stack.peek() != '['){
                    return false;
                }else if (c== ')' && stack.peek() != '('){
                    return false;
                }else{
                    stack.pop();
                }

            }
        }

        return stack.isEmpty();
    }

}
