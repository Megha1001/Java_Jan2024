package linkedList.circularLL;

public class CircularLL {

    static class Node{
        int data;
        Node next ;

        Node(int data){
            this.data = data;
        }
    }

    public static void main(String [] args){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(15);
        head.next.next.next = head;

        System.out.println("Circular LL ");
        traverse(head);
    }

    public static void traverse(Node head){
        if(head == null){
            //zero
            return ;
        }

        if(head.next == head){
            System.out.print(head.data);
        }


        Node temp = head;
        System.out.print(temp.data + " ");
        temp = temp.next;
        while(temp != head){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    
}
