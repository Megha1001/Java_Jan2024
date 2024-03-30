package linkedList.doublyLL.reverse;
/*
 * TIME COMPLExITY : O(N)
 * AUX SPACE : O(1)
 */
public class ReverseDLL {

    static class Node{
        int data;
        Node next;
        Node prev;


        Node(int data){
            this.data = data;
        }
    }


    public static void main(String [] args){
        Node head = insertAtEnd(null, 10);
        head = insertAtEnd(head, 20);
        head = insertAtEnd(head, 30);
        head = insertAtEnd(head, 40);

        System.out.println("Original linked list");
        traverse(head);

        System.out.println("\nReversed linked list");
        head = reversedLL(head);
        traverse(head);
    }
    

    public static Node insertAtEnd(Node head, int data){

        Node curr = new Node(data);

        if(head == null){
            return curr;
        }

        Node temp = head;

        while(temp.next !=null){
            temp = temp.next;
        }

        temp.next = curr;
        curr.prev = temp;

        return head;
    }


    public static void traverse(Node head){
        Node temp = head;

        while(temp !=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }


    public static Node reversedLL(Node head){
        
        if(head==null || head.next == null){
            return head;
        }

        Node temp = head;

        /*
         * Run till second last element as we need hold of last element to make it head
         */
        while(temp.next !=null){
            //swap prev and next
            Node curr = temp.next;
            temp.next = temp.prev;
            temp.prev = curr;

            temp = temp.prev;
        }

        //for last elment
        Node curr = temp.next;
        temp.next = temp.prev;
        temp.prev = curr;

        head =  temp;

        return head;
    }
}
