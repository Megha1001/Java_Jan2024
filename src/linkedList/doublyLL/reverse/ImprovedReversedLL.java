package linkedList.doublyLL.reverse;
/*
 * TIME COMPLExITY : O(N)
 * AUX SPACE : O(1)
 */
public class ImprovedReversedLL {

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

        Node prev = null, curr = head;

        while(curr != null){
            prev = curr.prev;
            curr.prev = curr.next;
            curr.next = prev;

            curr = curr.prev;
        }

        return prev.prev;

    }
}
