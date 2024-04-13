package deque.implementation;

public class DequeImplUsingCircularArray {

    static class Deque{
        int arr[];
        int cap;
        int size;
        int front;
        int rear;


        Deque(int cap){
            this.arr = new int[cap];
            this.size = 0;
            this.cap = cap;
            this.front=0;
            this.rear=0;
        }


        void insertAtFront(int x){
            //first element
            if(front==0 && rear==0){
                arr[0] = x;
                ++rear;
            }

            
        }

    }
    
}
