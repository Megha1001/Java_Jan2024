package linkedList.singlyLL.pairwiseSwap;


/*
 *  APPROACH : SWAP THE DATA
 *  TIME COMPLEXITY : O(N)
 *  Naive solution : Since it would not be recommended in case of object here we have simple integers so okay but for objects with many fields swapping is not recommended.
 */

public class NaiveSolution {

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    public static void main(String args[]){

        Node head = insertAtEnd(null, 10);
        head = insertAtEnd(head, 20);
        head = insertAtEnd(head, 30);
        head = insertAtEnd(head, 40);
        head = insertAtEnd(head, 50);
        // head = insertAtEnd(head, 60);

        traverse(head);

        pairwiseSwap(head);
        traverse(head);

    }

    public static void pairwiseSwap(Node head){
        if(head==null||head.next==null){
            return;
        }

        for(Node i=head; i!=null && i.next!=null; i=i.next.next){
            int data = i.data;
            i.data = i.next.data;
            i.next.data = data;
        }

        return;

    }

    public static void traverse(Node head){
        if(head==null){
            return;
        }

        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }

        System.out.println();
    }

    public static Node insertAtEnd(Node head, int data){
        Node newNode = new Node(data);

        if (head==null){
            return newNode;
        }

        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }

        temp.next = newNode;

        return head;
    }
    
}
