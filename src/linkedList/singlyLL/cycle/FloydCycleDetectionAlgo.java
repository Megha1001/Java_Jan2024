package linkedList.singlyLL.cycle;

import java.util.HashSet;

public class FloydCycleDetectionAlgo {
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
        head.next.next.next.next = head;

        // traverse(head);
        System.out.println("is Cycle present : "+isCyclePresent(head));
    }

    public static boolean isCyclePresent(Node head){
        if(head == null) return false;

        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow==fast){
                return true;
            }
        }
        return false;
    }

    public static void traverse(Node head){
        if(head==null){
            return;
        }

        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }

        System.out.println();
    }

    public static Node insertAtEnd(Node head, int data){
        Node newNode = new Node(data);
        if(head==null){
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
