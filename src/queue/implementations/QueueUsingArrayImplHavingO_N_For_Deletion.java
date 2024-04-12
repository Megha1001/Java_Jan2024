package queue.implementations;

public class QueueUsingArrayImplHavingO_N_For_Deletion {

    static class Queue{
        int size;//size filled by elements
        int cap; //capacity of array
        int [] arr;


        Queue(int cap){
            this.cap = cap;
            this.size = 0;
            this.arr = new int[cap];
        }

        /*
         * insert : always happens at rear end(last of array)
         */

        void enqueue(int x){
            if(size==cap){
                return;
            }
            arr[size] = x;
            ++size;
        }

        /*
         * delete from front and then shift other element by one position
         */

        int dequeue(){

            if(size==0){
                return -1 ;
            }

            int temp = arr[0];
            System.out.println("deleted item is "+arr[0]);

            for(int i=0; i<size-1; i++){
                arr[i] = arr[i+1];
            }

            --size;

            return temp;

        }

        int getFront(){
            if(size==0){
                return -1;
            }

            return arr[0];
        }

        int getRear(){
            if(size==0){
                return -1;
            }

            return arr[size];
        }

        boolean isFull(){
            return size==cap;
        }

        boolean isEmpty(){
            return size==0;
        }

        int size(){
            return size;
        }

    }

    public static void main(String[] args) 
	{ 
		Queue queue = new Queue(1000); 

		queue.enqueue(10); 
		queue.enqueue(20); 
		queue.enqueue(30); 
		queue.enqueue(40); 

		System.out.println(queue.dequeue() 
						+ " dequeued from queue\n"); 

		System.out.println("Front item is "
						+ queue.getFront()); 

		System.out.println("Rear item is "
						+ queue.getRear()); 
	} 



    
}
