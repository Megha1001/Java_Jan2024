package linkedList.circularLL;


/*
 * Approach
 * 1. Divide into two cases
 *  - Delete head node
 *  - Delete non-head node
 */
public class DeleteKthNode {

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

        System.out.println("ORiginal LL");
        traverseUsingForLoop(head);

        System.out.println("After 1st node LL");
        head = deleteKThNode(head, 1);

        System.out.println("After Kth node LL");
        head = deleteKThNode(head, 2);

        traverseUsingForLoop(head);
        

    }

    public static Node deleteKThNode(Node head, int k){
        if(head == null){
            return null;
        }

        if(k==1){
            //delete head delete
            return deleteHeadNode(head);
        }

        int j=1;
        Node temp = head;
        while((j+1)!=k){
            temp = temp.next;
            ++j;
        }

        temp.next = temp.next.next;

        return head;

    }

    public static Node deleteHeadNode(Node head){
        if(head==null || head.next==head){
            return null;
        }

        head.data = head.next.data;
        head.next = head.next.next;
        return head;
    }

    public static void traverseUsingForLoop(Node head){
        if(head == null){
            return;
        }

        if(head.next == head){
            System.out.println(head.data);
        }

        Node temp = head;
        System.out.print(temp.data+" ");
        temp = temp.next;

        for(Node p = temp; p != head; p=p.next){
            System.out.print(p.data+" ");
        }

        System.out.println();
    }

    public static Node insertAtEnd(Node head, int data){
        Node newNode = new Node(data);

        if(head==null){
            newNode.next = newNode;
            return newNode;
        }

        Node temp = head;
        while(temp.next != head){
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.next = head;

        return head;
    }
    
}
