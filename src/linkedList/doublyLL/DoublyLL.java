package linkedList.doublyLL;

public class DoublyLL {

    static class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data = data;
        }
    }

    public static void main(String args[]){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.prev = head;

        head.next.next = new Node(30);
        head.next.next.prev = head.next;

        traverse(head);

    }

    public static void traverse(Node head){
        Node curr = head;
        while(curr !=null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }
}
