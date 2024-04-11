package stack.infixToPrefix;

import java.util.Stack;

public class InfixToPrefixConversion {


    public static void main(String args[]){

        String input = "(A-B/C)*(A/K-L)";
        System.out.println("Expression after converting infix to prefix is ");
        findInfixToPrefix(input);

    }


    static int prec(char c){
        if(c=='^'){
            return 3;
        }else if(c=='*'||c=='/'){
            return 2;
        }else if(c=='+'||c=='-'){
            return 1;
        }else{
            return -1;
        }
    }

    static char associativity(char c){
        if(c=='^'){
            return 'R';
        }else{
            return 'L';
        }
    }



    public static void findInfixToPrefix(String s){
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();


        for(int i=s.length()-1; i>=0; i--){
            char c = s.charAt(i);

            //check for operands
            if((c>='a' && c<='z')||(c>='A' && c<='Z')||(c>='0' && c<='9')){
                result.append(c);
            }

            //check for right parenthesis
            else if(c==')'){
                stack.push(c);
            }

            //check for left parenthesis
            else if(c=='('){

                while(!stack.isEmpty() && stack.peek()!=')'){
                    result.append(stack.pop());
                }

                stack.pop(); //not need brackets in result

            }

            //check for operands
            else{

                while(!stack.isEmpty() && ((prec(c) < prec(stack.peek())) || ((prec(c)==prec(stack.peek())) &&(associativity(c)=='L')))){
                    result.append(stack.pop());
                }

                stack.push(c);

            }

        }
        
        while(!stack.isEmpty()){
            result.append(stack.pop());
        }

        System.out.println(result.reverse());


    }


    
}
