package linkedList.circularLL;

/*
 * TIME COMPLExiTY : O(1)
 * APPROACH 
 *  Insert the new node after head and then swap data of head and new Node
 */

public class InsertAtBeginO1 {

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }


    public static void main(String args[]){
        Node head = insertAtBegin(null,  60);
        head = insertAtBegin(head,  50);
        head = insertAtBegin(head,  40);
        head = insertAtBegin(head,  30);
        head = insertAtBegin(head,  20);
        head = insertAtBegin(head,  10);

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

    public static Node insertAtBegin(Node head, int data){

        Node newNode = new Node(data);

        //for first node
        if(head==null){
            newNode.next = newNode;
            return newNode;
        }

        newNode.next = head.next;
        head.next = newNode;

        //swap head's data and newNode data
        int headData = head.data;
        head.data = data;
        newNode.data = headData;


        return head;
    }
    
}
