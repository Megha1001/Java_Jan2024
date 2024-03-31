package linkedList.singlyLL;

/*
 * TIME COMPLEXITY : Theta(POS), where pos is the position
 */

public class SortedInsertLL {

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    public static void main(String args[]){
        Node head = insertAtBegin(null,50);
        head = insertAtBegin(head,40);
        head = insertAtBegin(head,30);
        head = insertAtBegin(head,20);
        head = insertAtBegin(head,10);

        System.out.println("Original LL");
        traverse(head);

        System.out.println("After inserting "+15);
        head = insertAtK(head, 15);
        traverse(head);


        System.out.println("After inserting at end "+60);
        head = insertAtK(head, 60);
        traverse(head);


        System.out.println("After inserting at first "+5);
        head = insertAtK(head, 5);
        traverse(head);
    }

    public static Node insertAtK(Node head, int x){
        Node curr = new Node(x);

        if(head==null){
            return curr;
        }

        // //for cases where we have only one node
        // if(head.next == null){
        //     if(head.data > x){
        //         curr.next = head;
        //         return curr;
        //     }else{
        //         head.next = curr;
        //         return head;
        //     }
        // }

        //head is larger than x
        if(head.data >x){
            curr.next = head;
            return curr;
        }

        
        //for single(head.data < x) and more nodes
        Node temp = head;
        while(temp.next !=null &&temp.next.data < x ){
            temp = temp.next;
        }

        curr.next = temp.next;
        temp.next = curr;

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

    public static Node insertAtBegin(Node head, int data){
        Node curr = new Node(data);

        if(head==null){
            return curr;
        }

        curr.next = head;

        return curr;
    }
    
}
