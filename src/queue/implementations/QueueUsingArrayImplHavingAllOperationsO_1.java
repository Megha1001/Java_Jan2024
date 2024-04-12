package queue.implementations;

public class QueueUsingArrayImplHavingAllOperationsO_1 {
    
    static class Queue{
        int cap;
        int size;
        int arr[];
        int front;


        Queue(int cap){
            this.cap = cap;
            this.size = 0;
            this.arr = new int[cap];
        }

        boolean isEmpty(){
            return size==0;
        }

        boolean isFull(){
            return size==cap;
        }


        int getFront(){
            if(isEmpty()){
                return -1;
            }

            return arr[front];
        }

        int getRear(){
            if(isEmpty()){
                return -1;
            }

            return arr[(front+size-1)%cap];
        }


        /*
         * Enqueue is done at rear
         */
        void enqueue(int x){
            if(isFull()){
                return;
            }

            int rear = front+size-1;
            rear = (rear+1)%cap;
            arr[rear] = x;
            ++size;
        }


        int dequeue(){
            if(isEmpty()){
                return -1;
            }

            int temp = arr[front];
            front = front+1;
            --size;
            return temp;
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
