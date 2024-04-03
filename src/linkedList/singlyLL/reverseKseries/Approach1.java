package linkedList.singlyLL.reverseKseries;

/*
 * Approach : First reverse First K nodes then recursively reverse for remaining batch
 * 
 * 
 * TIME COMPLEXITY : O(N)
 * AUX SPACE : N/K
 * 
 * auxiliary space complexity comes in:

Each recursive call creates a new activation record on the call stack. This activation record stores information about the function call, including local variables like curr, prev, and next.
In the worst case, the recursion continues until the end of the linked list is reached (curr == null). For a linked list with N nodes, there could be N/K recursive calls (each call reversing a batch of K nodes).
 */
public class Approach1 {
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
        head = insertAtBegin(head, 50);

        System.out.print("Original array : ");
        traverse(head);

        head =  reverseKthRecursive(head, 3);
        traverse(head);
    }

    public static Node reverseKthRecursive(Node head, int k){
        Node curr = head;
        Node prev = null;
        Node next = null;
        int count = 0;

        while(curr!=null && count < k){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            ++count;
        }

        // if(curr != null){
        //     Node rest_head = reverseKthRecursive(curr, k);
        //     head.next = rest_head;
        // }

        if(next != null){
            Node rest_head = reverseKthRecursive(next, k); // this is being called N/K times
            head.next = rest_head;
        }
        return prev;

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
