package linkedList.singlyLL.middleOfLL;
/*
 * TIME COMPLEXITY : O(N)
 * TWO TRAVERSAL
 */
public class NaiveApproach {

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

        System.out.println("Middle of ll is "+findMiddle(head));

    }

    public static int findMiddle(Node head){
        if(head==null){
            return -1;
        }
        /*
         * Not needed
         */
        // if(head.next ==null){
        //     return head.data;
        // }

        //find size
        Node temp = head;
        int size = 0;
        while(temp!=null){
            ++size;
            temp = temp.next;
        }

        int mid = size/2;
        temp = head;

        for(int i =0; i<mid;i++){
            temp = temp.next;
        }

        return temp.data;

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
