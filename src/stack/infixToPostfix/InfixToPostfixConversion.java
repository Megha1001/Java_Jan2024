package stack.infixToPostfix;


import java.util.Stack;

public class InfixToPostfixConversion {

    public static void main(String args[]){

        String input = "a+b*(c^d-e)^(f+g*h)-i";
        System.out.println("Expression after converting infix to postfix is ");
        findInfixToPostfix(input);

    }

    static int prec(char c){
        if(c=='^'){
            return 3;
        }else if(c=='*' || c=='/'){
            return 2;
        }else if(c=='+' || c=='-'){
            return 1;
        }else{
            return -1;
        }
    }

    static char associativity(char c){
        if(c=='^'){
            return 'R';
        }
        return 'L';
    }


    public static void findInfixToPostfix(String s){
        //to store result
        StringBuilder result = new StringBuilder();

        //To store operator
        Stack<Character> stack = new Stack<>();


        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);


            //to check for operands
            if((c>='a' && c<='z')||(c >='A' && c<='Z')||(c>='0' && c<='9')){
                result.append(c);
            }

            //check for left parenthesis
            else if(c=='('){
                stack.push(c);
            }

            else if(c==')'){
                //pop until we found left paranthesis
                while(!stack.isEmpty() && stack.peek() != '('){
                    result.append(stack.pop());
                }

                //found (
                stack.pop();
            }

            //for operators
            else{
                while(!stack.isEmpty() && (prec(c) < prec(stack.peek())||(prec(c) == prec(stack.peek())&&(associativity(c)=='L')))){
                    result.append(stack.pop());
                }
                stack.push(c);
            }
        }

        //pop out all the elements
        while(!stack.isEmpty()){
            result.append(stack.pop());
        }

        System.out.println(result);

    }
    
}