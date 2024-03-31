package linkedList.singlyLL.middleOfLL;

/*
 * APPROACH : FAST AND SLOW REFERENCES
 * SLow moves by one , fast by two positions
 * when fast reaches to null(in case of even lenght LL) or end(in case of odd length LL), SLOW should be at middle
 * 
 * TIME COMPLEXITY : O(N)
 * ONE TRAVERSAL
 */
public class SlowAndFastApp {

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
        head = insertAtEnd(head, 60);

        System.out.println("Original LL");
        traverse(head);

        System.out.println("Middle of ll is ");
        printMiddle(head);

    }

    public static void printMiddle(Node head){
        if(head==null){
            return ;
        }
        Node slow = head;
        Node fast = head;

        /*
         * NOTE : fast!=null is still require even when all input LL are odd length since we should never access null.next -> it will cause NullPointerException
         */
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        System.out.println(slow.data);

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

        System.out.println("");
    }

    public static Node insertAtEnd(Node head, int data){
        Node curr = new Node(data);

        if(head==null){
            return curr;
        }

        Node temp = head;
        while(temp.next !=null){
            temp = temp.next;
        }

        temp.next = curr;
        return head;
    }
    
    
}
