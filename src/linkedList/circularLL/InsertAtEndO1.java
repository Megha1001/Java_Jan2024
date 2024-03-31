package linkedList.circularLL;

/*
 * TIME COMPLExiTY : O(1)
 * APPROACH 
 *  Insert the new node after head and then swap data of head and new Node. Then modify the head
 */

public class InsertAtEndO1 {

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }


    public static void main(String args[]){
        Node head = insertAtEnd(null,  60);
        head = insertAtEnd(head,  50);
        head = insertAtEnd(head,  40);
        head = insertAtEnd(head,  30);
        head = insertAtEnd(head,  20);
        head = insertAtEnd(head,  10);

        System.out.println("Traversing after insertion at begin of LL");
        traverseUsingForLoop(head);
    
    }

    public static void traverseUsingForLoop(Node head){

        //no node
        if(head == null){
            return;
        }

        //one node
        if(head.next == head){
            System.out.print(head.data);
            return;
        }

        //more than one node
        Node temp = head;
        System.out.print(temp.data+" ");
        temp = temp.next;

        for(Node n = temp; n != head; n = n.next){
            System.out.print(n.data+" ");
        }


    }

    public static Node insertAtEnd(Node head, int data){
        Node newNode = new Node(data);

        //no existing node
        if(head == null){
            newNode.next = newNode;
            return newNode;
        }

        //have nodes
        //insert after head
        newNode.next = head.next;
        head.next = newNode;

        //swap
        int headData = head.data;
        head.data = newNode.data;
        newNode.data = headData;

        //move head by one postion
        head = head.next;

        return head;
    }
    
}
