package linkedList.singlyLL.cycle;

/*
 * APPROACH
 * The algorithm works by having two pointers travere the LL until they either meet at the same node
 * (indicating a cycle) or until the fast pointer reaches the end of the list(indicating no cycle)
 * 
 * If the pointer meet, it signifies the existence of cycle.
 * 
 * 
 * TIME COMPLEXITY : O(N)
 * AUX SPACE ; O(1)
 * 
 * Points to Note
 * 1. fast will enter the loop before(or at same time as slow)
 * 2. The fast be k distance ahead of slow when slow enter the loop where k>=0;
 * 
 * 3. This distace keeps on increasing by 1 in every movement of both pointers
 * 4. when distance becmoes length of cycle they meet
 */

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
