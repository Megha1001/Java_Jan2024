package linkedList.singlyLL.reverse;

/*
 * 
 * TIME COMPLExity : O(N)
 * AUX SPACE :O(1)
 * 
 * 1-traversal
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

        System.out.println("Original LL");
        traverse(head);
        System.out.println("Reversed LL");
        head = reverseLL(head);
        traverse(head);
    }
    

    public static Node reverseLL(Node head){

        if(head==null || head.next==null){
            return head;
        }

        Node curr = head;
        Node prev = null;

        while(curr!=null){
            Node next  = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev; //prev would be the new head

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
