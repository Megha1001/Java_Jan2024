package linkedList.singlyLL.reverse.recursive;

/*
 * APPROACH : 
 * 1. First reverse n-1 then reverse rest
 * 
 * TIME COMPLEXITY : O(N)
 * AUX SPACE = O(N)
 */

public class SolutionTwo {
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

        head =  reverseRecursive(head, null);
        traverse(head);
    }


    public static Node reverseRecursive(Node curr, Node prev){

        if(curr == null){
            return prev;
        }

        Node next = curr.next;
        curr.next = prev;

        return reverseRecursive(next, curr);


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
