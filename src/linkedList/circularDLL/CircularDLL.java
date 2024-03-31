package linkedList.circularDLL;

public class CircularDLL {
    static class Node{
        int data;
        Node prev;
        Node next;

        Node(int data){
            this.data = data;
        }
    }


    public static void main(String args[]){
        Node head = insertAtBegin(null, 10);
        head = insertAtBegin(head, 20);
        head = insertAtBegin(head, 30);
        head = insertAtBegin(head, 40);
        head = insertAtBegin(head, 50);


        traverse(head);


    }

    /*
     * TIME COMPLEXITY : O(N)--> same as Circular Singly Linked List
     */

    public static void traverse(Node head){
        if(head==null){
            return;
        }

        if(head.next == head){
            System.out.println(head.data);
            return;
        }

        //more than one node
        Node temp = head;

        do{
            System.out.print(temp.data+" ");
            temp = temp.next;
        }while(temp!=head);

        
    }

    /*
     * TIME COMPLEXITY : O(1)
     */
    public static Node insertAtBegin(Node head, int data){
        Node newNode = new Node(data);

        if(head==null){
            newNode.next = newNode;
            newNode.prev = newNode;
            return newNode;
        }

        newNode.next = head;
        newNode.prev = head.prev;
        head.prev.next = newNode;
        head.prev = newNode;

        /*
         * IF return head then it will insert at end
         */
        return newNode;
    }
}
