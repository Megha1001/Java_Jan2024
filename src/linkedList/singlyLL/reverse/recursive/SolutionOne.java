package linkedList.singlyLL.reverse.recursive;

/*
 * APPROACH : 
 * 1. Reverse LL for head.next to remaning and name the head as rest_head
 * 2. Then get the rest_tail with head.next;
 * 3. Now change the references
 * 
 * 
 * TIME COMPLEXITY : O(N)
 * AUX SPACE = O(N)
 */

public class SolutionOne {
    static class Node{
        int data;
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

        System.out.print("Original array : ");
        traverse(head);

        head =  reverseRecursive(head);
        traverse(head);
    }


    public static Node reverseRecursive(Node head){

        //base conditions
        if(head==null || head.next == null){
            return head;
        }

        Node rest_head = reverseRecursive(head.next);
        Node rest_tail = head.next;
        rest_tail.next = head;
        head.next = null;

        return rest_head;
    }

    public static void traverse(Node head){
        if(head == null){
            return;
        }

        Node temp = head;

        while(temp!=null){
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node insertAtBegin(Node head, int data){
        Node newNode = new Node(data);

        if(head == null){
            return newNode;
        }

        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        
        temp.next = newNode;

        return head;

    }
}
