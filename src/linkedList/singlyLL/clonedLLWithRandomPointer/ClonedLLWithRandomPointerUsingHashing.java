package linkedList.singlyLL.clonedLLWithRandomPointer;

/*
 * TIME COMPLEXITY : O(N)
 * AUX SPACE : O(N)
 */

import java.util.HashMap;

public class ClonedLLWithRandomPointerUsingHashing {

    static class Node{
       int data;
       Node next;
       Node random;

       Node(int data){
        this.data = data;
       }
    }

    public static void main(String [] args){
        Node head = new Node(10); 
        head.next = new Node(5); 
        head.next.next = new Node(20); 
        head.next.next.next = new Node(15); 
        head.next.next.next.next = new Node(20); 
        
        head.random = head.next.next;
        head.next.random=head.next.next.next;
        head.next.next.random=head;
        head.next.next.next.random=head.next.next;
        head.next.next.next.next.random=head.next.next.next;
        
        System.out.print( "Original list : \n"); 
        print(head);

        System.out.print( "Cloned list : \n");
        Node clonedLL = clonedLL(head);
        print(clonedLL);

    }

    public static Node clonedLL(Node head){
        if(head==null){
            return head;
        }

        HashMap<Node, Node> h = new HashMap<>();
        
        // clone the nodes of original LL
        Node curr = head;
        while(curr!=null){
            h.put(curr, new Node(curr.data));
            curr = curr.next;
        }

        //clone links from original LL
        curr = head;
        while(curr!=null){
            Node cloned = h.get(curr);
            cloned.next = h.get(curr.next);
            cloned.random = h.get(curr.random);
            curr=curr.next;
        }
        Node head2 = h.get(head);
        return head2;
    }

    public static void print(Node head){
        if(head==null){
            return;
        }

        Node curr = head;
        while(curr != null){
            System.out.println ( "Data = " + curr.data + ", Random  = "+curr.random.data ); 
            curr = curr.next;
        }
    }
    
    
}
