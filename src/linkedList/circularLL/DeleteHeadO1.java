package linkedList.circularLL;

/*
 * TIME COMPLEXITY : O(1)
 */

public class DeleteHeadO1 {
    
    static class Node{
        int data;
        Node next;


        Node(int data){
            this.data = data;
        }
    }

    public static void main(String args[]){
        Node head = insertAtBegin(null, 40);
        head = insertAtBegin(head, 30);
        head = insertAtBegin(head, 20);
        head = insertAtBegin(head, 10);


        System.out.println("Original LL");
        traverse(head);

        head = deleteHead(head);
        System.out.println("LL after delete head");
        traverse(head);

    }

    public static Node deleteHead(Node head){
        if(head==null || head.next == head){
            return null;
        }

        //copy the data of second node to head;
        head.data = head.next.data;
        head.next = head.next.next;

        return head;
    }

    public static void traverse(Node head){
        if(head == null){
            return;
        }

        if(head.next == head){
            System.out.print(head.data);
            return;
        }

        Node temp = head;
        do{
            System.out.print(temp.data+" ");
            temp = temp.next;
        }while(temp != head);

        System.out.println();
    }

    public static Node insertAtBegin(Node head, int data){
        Node newNode = new Node(data);

        if(head==null){
            newNode.next = newNode;
            return newNode;
        }

        newNode.next = head.next;
        head.next = newNode;

        //swap
        int headData = head.data;
        head.data = newNode.data;
        newNode.data = headData;

        return head;
    }

    
}
