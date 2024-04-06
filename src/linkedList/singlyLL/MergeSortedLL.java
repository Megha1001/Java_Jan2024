package linkedList.singlyLL;
/*
 * TIME COMPLEXITY : O(M+N)
 * AUX SPACE : O(1)
 */
public class MergeSortedLL {

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    public static void main(String args[]){
        Node head1 = new Node(10);
        head1.next = new Node(20);
        head1.next.next = new Node(30);


        Node head2 = new Node(5);
        head2.next = new Node(25);
        head2.next.next = new Node(28);
        head2.next.next.next = new Node(35);
        head2.next.next.next.next = new Node(40);
        head2.next.next.next.next.next = new Node(43);


        Node head = mergeTwoSortedLL(head1, head2);
        traverse(head);
    }

    public static Node mergeTwoSortedLL(Node h1, Node h2){

        //base cases
        if(h1 == null){
            return h2;
        }
        if(h2==null){
            return h1;
        }

        Node head = h1; Node tail = h1;

        if(h1.data > h2.data){
            head = h2;
            tail = h2;
            h2 = h2.next;
        }else{
            h1 = h1.next;
        }


        while(h1!=null && h2!=null){
            if(h1.data > h2.data){ // != to maintain stablity
                tail.next = h2;
                tail = h2;
                h2 = h2.next;
            }else{
                tail.next = h1;
                tail = h1;
                h1 = h1.next;
            }
        }


        if(h1!=null){
            tail.next = h1;
        }else{
            tail.next = h2;
        }

        return head;
    }


    public static void traverse(Node head){
        if(head==null){
            return;
        }

        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }

        System.out.println();
    }
    
}
