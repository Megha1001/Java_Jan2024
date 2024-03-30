package linkedList.basicOperations;

public class LinkedListOperations {

    static class Node{
        int data;
        Node next;//bydefault next sets to null

        Node(int data){
            this.data = data;
        }
    }
    
    public static void main(String args[]){
        Node head = null;
        head = insertAtStart(head, 5);
        head = insertAtStart(head, 10);
        head = insertAtStart(head, 20);
        head = insertAtStart(head, 30);
        System.out.println("Insert at start of LL");
        printList(head);

        Node head1 = null;
        head1 = insertAtEnd(head1, 5);
        head1 = insertAtEnd(head1, 10);
        head1 = insertAtEnd(head1, 20);
        head1 = insertAtEnd(head1, 30);


        System.out.println("\nInsert at end of LL");
        printList(head1);


        System.out.println("\nInsert at given position of LL");
        head1= insertAtPos(head1, 25, 4);
        printList(head1);


        head1 = deleteFirstNode(head1);
        System.out.println("\nDelete first node");
        printList(head1);


        head1 = deleteLast(head1);
        System.out.println("\nDelete last node");
        printList(head1);


        System.out.println("\nThe searched element is present at "+searchIterative(head1,100));
        System.out.println("\nThe searched element is present at "+searchRecursive(head1,10));
    }

    /*
     * TIME COMPLEXITY : O(N)
     */
    public static void printList(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data+"->");
            curr = curr.next;
        }
        System.out.print("NULL");
    }

    //TIME COMPLEXITY : O(1)
    public static Node insertAtStart(Node head , int data){
        Node curr = new Node(data);
        curr.next = head;
        return curr;
    }

    /*
     * TIME COMPLEXITY : O(N)
     */
    public static Node insertAtEnd(Node head, int data){
        Node curr = new Node(data);

        if(head == null){
            return curr;
        }

        Node tail = head;

        while(tail.next != null){
            tail = tail.next;
        }

        tail.next = curr;

        return head;

    }


    /*
     * Insert at given position, index start from 1
     * TIME COMPLEXITY : O(N)
     */
    public static Node insertAtPos(Node head, int data, int pos){
        Node curr = new Node(data);

        if(pos == 1){
            curr.next = head;
            return curr;
        }

        int j=1;
        Node temp = head;

        while(j!=(pos-1) && temp !=null){
            temp = temp.next;
            ++j;
        }

        //for invalid pos
        if(temp == null){
            return head;
        }

        curr.next = temp.next;
        temp.next = curr;

        return head;

    }

    /*
     * Delete first node or head node
     * TIME COMPLEXITY : O(1)
     */

    public static Node deleteFirstNode(Node head){
        if(head == null){
            return head;
        }

        return head.next;
    }

    /*
     * DELETE last node
     * TIME COMPLEXITY : O(N)
     */

    public static Node deleteLast(Node head){

        //no and only one node first check for no node otherwise NullpointerException
        if(head == null || head.next == null){
            return null;
        }

        Node temp = head;

        //traverse till second last node
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;

        return head;

    }


    /*
     * Search iteratively
     * TIME COMPLEXITY : O(N)
     */
    public static int searchIterative(Node head, int x){

        Node curr = head;
        int pos = 1;

        while(curr != null){
            if(curr.data == x){
                return pos;
            }else{
                ++pos;
                curr = curr.next;
            }
        }
        
        return -1;
    }

    /*
     * TIME COMPLEXITY : O(N)
     * AuX SPACE : O(N)
     */

    public static int searchRecursive(Node head, int x){

        if(head == null){
            return -1;
        }


        if(head.data == x){
            return 1;
        }

        else{
            int res = searchRecursive(head.next, x);

            if(res ==-1){
                return -1;
            }else{
                return res+1;
            }
        }

    }
}
