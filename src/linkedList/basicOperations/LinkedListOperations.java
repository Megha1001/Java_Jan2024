package linkedList.basicOperations;

public class LinkedListOperations {

    static class Node{
        int data;
        Node next;//bydefault next sets to null

        Node(int data){
            this.data = data;
        }
    }
    
    public static void main(String args[]){
        Node head = null;
        head = insertAtStart(head, 5);
        head = insertAtStart(head, 10);
        head = insertAtStart(head, 20);
        head = insertAtStart(head, 30);
        System.out.println("Insert at start of LL");
        printList(head);

        Node head1 = null;
        head1 = insertAtEnd(head1, 5);
        head1 = insertAtEnd(head1, 10);
        head1 = insertAtEnd(head1, 20);
        head1 = insertAtEnd(head1, 30);


        System.out.println("\nInsert at end of LL");
        printList(head1);


        System.out.println("\nInsert at given position of LL");
        head1= insertAtPos(head1, 25, 10);
        printList(head1);
    }

    public static void printList(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data+"->");
            curr = curr.next;
        }
        System.out.print("NULL");
    }

    //TIME COMPLEXITY : O(1)
    public static Node insertAtStart(Node head , int data){
        Node curr = new Node(data);
        curr.next = head;
        return curr;
    }

    public static Node insertAtEnd(Node head, int data){
        Node curr = new Node(data);

        if(head == null){
            return curr;
        }

        Node tail = head;

        while(tail.next != null){
            tail = tail.next;
        }

        tail.next = curr;

        return head;

    }


    /*
     * Insert at given position, index start from 1
     */
    public static Node insertAtPos(Node head, int data, int pos){
        Node curr = new Node(data);

        if(pos == 1){
            curr.next = head;
            return curr;
        }

        int j=1;
        Node temp = head;

        while(j!=(pos-1) && temp !=null){
            temp = temp.next;
            ++j;
        }

        //for invalid pos
        if(temp == null){
            return head;
        }

        curr.next = temp.next;
        temp.next = curr;

        return head;

    }

}
