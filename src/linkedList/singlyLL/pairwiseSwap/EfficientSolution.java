package linkedList.singlyLL.pairwiseSwap;

/*
 * APPROACH : SWAP THE link
 * TIME COMPLEXITY : O(N)
 * AUX SPACE : O(1)
 * VIDEO LINK(2nd PART): https://www.geeksforgeeks.org/batch/dsa-4/track/DSASP-LinkedList/video/NzAyOQ%3D%3D
 */

public class EfficientSolution {
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

        head = pairwiseSwap(head);
        traverse(head);

    }

    public static Node pairwiseSwap(Node head){

        //base case
        if(head==null || head.next==null){
            return head;
        }


        //to get hold of head , swap first two nodes
        Node curr = head.next.next;
        Node prev = head;
        head = head.next;
        head.next = prev;


        //swap link for remaining nodes
        while(curr!=null && curr.next != null){

            prev.next = curr.next;
            prev = curr;

            Node next = curr.next.next;
            curr.next.next = prev;
            curr = next;

        }

        // to handle last node for both even(last is null) or odd(last is a node)
        prev.next = curr;

        return head;
       
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
