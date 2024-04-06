package stack.implemenation;

/*
 *  Problem with the implementation
 *  1. No dynamic sizing
 */

public class ArrayImpl {

    static class MyStack{
        int cap;
        int arr[];
        int top;

        MyStack(int cap){
            this.cap = cap;
            this.arr = new int[cap];
            this.top = -1;
        }

        public int size(){
            return top+1;//top is 0 indexed
        }

        public void push(int x){
            if(top == cap){
                System.out.println("Overflow occurred");
                return;
            }
            ++top;
            arr[top] = x;
        }

        public int pop(){
            if(top == -1){
                System.out.println("Underflow occurred");
            }
            int temp = arr[top];
            --top;
            return temp;
        }

        public int peek(){
            if(top == -1){
                System.out.println("Underflow occurred");
            }

            return arr[top];

        }

        public boolean isEmpty(){
            return top==-1;
        }

    }

    public static void main(String args[]){
        MyStack s = new MyStack(10);
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
