package linkedList.singlyLL.basicOperations.creation;

public class Creation2 {

    static class Node{
        int data;
        Node next;
    
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    public static void main(String args[]){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        System.out.println(head.data +":"+ head.next);
        System.out.println(head.next.data +":"+ head.next.next);
        System.out.println(head.next.next.data +":"+ head.next.next.next);
    }
    
}