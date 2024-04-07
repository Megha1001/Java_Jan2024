package stack.checkParanthesis;

import java.util.Deque;
import java.util.ArrayDeque;

/*
 * Stack has thread implementaiton means its thread safe so if we use it for singly threaded env it just ads an overhead . Hence, its better to use Dequeue
 * 
 * TIME COMPLEXITY : O(N)
 * AUX SPACE : O(N)
 */

public class CheckBalancedParanthesisUsingDeque {

    public static void main(String args[]){
        String s = "{{[()]}}";

        System.out.println("is input string has balanced paranthesis : "+ isBalanced(s));
    }

    public static boolean isBalanced(String s){
        Deque<Character> d = new ArrayDeque<>();

        for(char c : s.toCharArray()){
            if(c=='{' || c=='[' || c=='('){
                d.push(c);
            }else{
                //check if we have item in dequeue
                if(d.isEmpty()){
                    return false;
                }else if(!matching(c, d.peek())){
                    return false;
                }else{
                    d.pop();
                }
            }
        }

        return d.isEmpty();
    }

    public static boolean matching(char c, char d){
        return ((c=='}' && d=='{') || (c==']' && d=='[')|| (c==')' && d=='('));
    }
    
}
