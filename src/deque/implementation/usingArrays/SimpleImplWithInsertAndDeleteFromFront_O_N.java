package deque.implementation.usingArrays;


/*
 * Approach : No need to maintain two pointer will always keep front=0 and rear = size-1
 * 
 * In this impl , deleteFromFront and insertAtFront would take O(N) others would take O(1)
 */

public class SimpleImplWithInsertAndDeleteFromFront_O_N {


    static class Deque{
        int cap;
        int size;
        int arr[];


        Deque(int cap){
            this.cap = cap;
            this.size = 0;
            this.arr = new int[cap];
        }


        boolean isFull(){
            return size==cap;
        }

        boolean isEmpty(){
            return size==0;
        }

        void insertAtFront(int x){

            if(isFull()){
                return;
            }

            //move elements from o to size one position ahead

            for(int i=0; i<size; i++){
                arr[i+1] = arr[i];
            }

            arr[0] = x;
            ++size;
        }

        void deleteFromFront(){
            if(isEmpty()){
                return;
            }

            //move all the elements from 1 to size one position ahead;
            for(int i=0; i<size-1; i++){ //run until second last element of size
                arr[i] = arr[i+1];

            }

            --size;

        }


        void deleteFromRear(){
            if(isEmpty()){
                return;
            }

            --size;
        }

        void insertAtRear(int x){
            if(isFull()){
                return;
            }
            arr[size] = x; // size started from 0 and that has no value so no need to incremenet size prior to insertion
            ++size;
        }

        int getRear(){
            if(isEmpty()){
                return -1;
            }
            return arr[size];
        }

        int getFront(){
            if(isEmpty()){
                return -1;
            }

            return arr[0];
        }

    }

    public static void main(String args[]){
        Deque d  = new Deque(5);
        d.insertAtRear(5);
        d.insertAtRear(10);
        System.out.println(d.getFront());
        d.deleteFromRear();
        d.insertAtFront(15);
        System.out.println(d.getFront());
        d.deleteFromFront();
        System.out.println(d.getFront());

    }
    
}
