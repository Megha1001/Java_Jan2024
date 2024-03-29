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
        printList(head);
    }

    public static void printList(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data+"->");
            curr = curr.next;
        }
        System.out.print("NULL");
    }


    public static Node insertAtStart(Node head , int data){
        Node curr = new Node(data);

        if (head != null) {
            curr.next = head;
        }
        head = curr;

        return head;
    }

}
