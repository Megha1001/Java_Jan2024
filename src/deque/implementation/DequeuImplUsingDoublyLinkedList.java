package deque.implementation;

/*
 * Approach : Use Doubly Linked List(why not Singly : Because we cannot perform delete from rear in O(1))
 * Except print operation here all are O(1)
 */


public class DequeuImplUsingDoublyLinkedList {

    public static Node front = null;
    public static Node rear = null;


    static class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data = data;
        }
    }

    static class Deque{

        public Node insertFront(int x){
            Node temp = new Node(x);

            if(front==null){
                front = temp;
                rear = temp;
                return front;
            }

            temp.next = front;
            front.prev = temp;
            front = temp;

            return front;

        }


        public Node insertRear(int x){
            Node temp = new Node(x);
            
            if(front==null){
                front = temp;
                rear = temp;
                return front;
            }

            rear.next = temp;
            temp.prev = rear;
            rear = temp;

            return front;
        }

        public Node deleteFront(){
            if(front==null || front.next == null){
                return null;
            }

            front.next.prev = null;

            return front.next;
        }


        public Node deleteRear(){
            if(front==null || front.next == null){
                return null;
            }

            rear = rear.prev;
            rear.next.prev = null;
            rear.next = null;

            return front;
        }


        public void printList(Node front){
            if(front==null){
                return;
            }

            Node temp = front;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }

            System.out.println();
        }

    }

    public static void main(String args[]){
        Deque d = new Deque();
        front = d.insertFront(10);
        front = d.insertFront(20);
        front = d.insertRear(30);
        front = d.insertRear(40);

        d.printList(front);

        front = d.deleteFront();

        d.printList(front);

        front = d.deleteRear();
        d.printList(front);

    }
    
}
