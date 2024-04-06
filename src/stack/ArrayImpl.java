package stack;

public class ArrayImpl {

    static class MyStack{
        int capacity;
        int arr[];
        int filled = -1;

        MyStack(int capacity){
            this.capacity = capacity;
            this.arr = new int[capacity];
        }

        public int size(){
            return filled+1;//filled is 0 indexed
        }

        public void push(int x){
            if(filled == capacity){
                System.out.println("Overflow occurred");
                return;
            }
            ++filled;
            arr[filled] = x;
        }

        public int pop(){
            if(filled == -1){
                System.out.println("Underflow occurred");
            }
            int temp = arr[filled];
            --filled;
            return temp;
        }

        public int peek(){
            if(filled == -1){
                System.out.println("Underflow occurred");
            }

            return arr[filled];

        }

        public boolean isEmpty(){
            return filled==-1;
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
