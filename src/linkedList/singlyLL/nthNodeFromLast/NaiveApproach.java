package linkedList.singlyLL.nthNodeFromLast;

/*
 * TIME COMPLEXITY : O(N)
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


        traverse(head);

        printNthNodeFromEnd(head, 2);
    }



    public static void printNthNodeFromEnd(Node head, int x){
        if(head==null){
            return;
        }

        //calculate size
        Node temp = head;
        int size=0;
        while(temp!=null){
            ++size;
            temp=temp.next;
        }

        //not valid
        if(size < x){
            return;
        }

        int traverse = size - x+1;
        temp = head;

        for(int i=1; i<traverse; i++){
            temp = temp.next;
        }

        System.out.print(temp.data);
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
