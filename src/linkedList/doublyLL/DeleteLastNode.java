package linkedList.doublyLL;

public class DeleteLastNode {
    
    static class Node{
        int data;
        Node prev;
        Node next;


        Node(int data){
            this.data = data;
        }
    }


    public static void main(String args[]){
        Node head = insertAtStart(null, 40);
        head = insertAtStart(head, 30);
        head = insertAtStart(head, 20);
        head = insertAtStart(head, 10);


        System.out.println("Original LL");
        traverseLL(head);


        System.out.println("After removal of last node");
        head = removeLastNode(head);
        traverseLL(head);
    }

    public static Node removeLastNode(Node head){
        if(head==null || head.next == null){
            //no OR single elment
            return null;
        }

        Node temp = head;

        //iterate until second last node
        while(temp.next.next != null){
            temp = temp.next;
        }

        //free up last node
        Node lastNode = temp.next;
        lastNode.prev = null;

        //modify second last node
        temp.next= null;

        return head;
    }


    public static void traverseLL(Node head){
        Node curr = head;

        while(curr != null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }

    }

    public static Node insertAtStart(Node head, int data){
        Node curr = new Node(data);

        if(head == null){
            return curr;
        }

        curr.next = head;
        head.prev = curr;

        head = curr;

        return head;
    }
    
}
