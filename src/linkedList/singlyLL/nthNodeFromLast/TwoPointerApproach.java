package linkedList.singlyLL.nthNodeFromLast;

/*
 * TIME COMPLEXITY : O(N), without calculating size
 * 
 * APPROACH
 * 1. Maintain two pointer /reference having n difference
 *  a. Have ptr at n from start named fast
 *  b. Have slow ptr now started. 
 *  c. move both the ptr one position at a time.
 *  d. once the fast reached to null the slow will be at n from last position
 */
public class TwoPointerApproach {
    
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


        traverse(head);

        printNthNodeFromEnd(head, 2);
    }



    public static void printNthNodeFromEnd(Node head, int x){
        if(head==null){
            return;
        }

        Node slow = head;
        Node fast = head;

        //mode fast to n postion
        for(int i=1; i<=x; i++){
            fast = fast.next;
        }

        //now move both slow and fast one position ahead
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }


        System.out.print(slow.data);
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

        Node curr = new Node(data);

        if(head==null){
            return curr;
        }

        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = curr;

        return head;
    } 

}
