package stack.implemenation;

import java.util.ArrayList;

public class ArrayListImpl {

    static class MyStack{
        ArrayList<Integer> list = new ArrayList<>();

        public int size(){
            return list.size();
        }

        public void push(int x){
            list.add(x);
        }

        public int pop(){
            int len = size();
            if(len==0){
                return -1;
            }
            int temp = list.get(len-1);
            list.remove(len-1);
            return temp;
        }

        public int peek(){
            int len = size();
            if(len==0){
                return -1;
            }
            return list.get(len-1);
        }

        public boolean isEmpty(){
            return size()==0;
        }
    }

    public static void main(String args[]){
        
        MyStack s = new MyStack();
        s.push(5);
        s.push(10);
        s.push(25);
        System.out.println(s.peek());
        System.out.println(s.pop());
        s.push(35);
        System.out.println(s.peek());
        System.out.println(s.size());
        System.out.println(s.isEmpty());

    }
    
}
