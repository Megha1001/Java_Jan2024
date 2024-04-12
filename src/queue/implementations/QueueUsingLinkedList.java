package queue.implementations;

/*
 * TIME COMPLEXITY : O(1)
 */

public class QueueUsingLinkedList {

    static class Node{
        int data;
        Node next;


        Node(int data){
            this.data = data;
        }
    }

    static class Queue{
        Node front;
        Node rear;
        int size;

        void enqueue(int x){
            Node temp = new Node(x);
            ++size;
            //first element
            if(front==null){ //-> CORNER CASE
                front = temp;
                rear = temp;

                return;
            }

            //insert at rear
            rear.next = temp;
            rear = temp;

        }

        void dequeue(){
            if(front==null){ //-> CORNER CASE
                return;
            }

            //always from front
            System.out.println("Dequeued "+front.data);
            front = front.next;

            //dequeued last element -> CORNER CASE
            if(front==null){
                rear = null;
            }
            --size;
        }


        int getSize(){
            return size;
        }
    }


    public static void main(String args[]){
        Queue q = new Queue(); 
		q.enqueue(10); 
		q.enqueue(20); 
		q.dequeue(); 
		q.dequeue(); 
		q.enqueue(30); 
		q.enqueue(40); 
		q.enqueue(50); 
		q.dequeue(); 
		System.out.println("Queue Front : " + q.front.data); 
		System.out.println("Queue Rear : " + q.rear.data); 
        System.out.println("Size : "+q.getSize());
    }
    
}
