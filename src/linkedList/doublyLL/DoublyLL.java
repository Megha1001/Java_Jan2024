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

        System.out.println("\nInsert 40 at beginning :");
        head = insertAtBegin(head, 40);
        traverse(head);

        System.out.println("\nInsert 50 at beginning by improved method :");
        head = insertAtBeginImproved(head, 50);
        traverse(head);

        System.out.println("\nInsert 70 at end :");
        head = insertAtEnd(head, 70);
        traverse(head);

    }

    public static void traverse(Node head){
        Node curr = head;
        while(curr !=null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }

    public static Node insertAtBegin(Node head, int data){
        Node curr = new Node(data);

        if(head==null){
            return curr;
        }

        curr.next = head;
        head.prev = curr;
        head = curr;

        return head;
    }

    public static Node insertAtBeginImproved(Node head, int data){

        Node curr = new Node(data);

        curr.next = head;

        if(head !=null){
            head.prev = curr;
        }

        return curr;

    }


    public static Node insertAtEnd(Node head, int data){
        
        Node curr = new Node(data);
        Node temp = head;

        //corner case
        if(head == null){
            return curr;
        }

        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = curr;
        curr.prev = temp;

        return head;
    }
}
