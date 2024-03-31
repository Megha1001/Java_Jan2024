package linkedList.circularLL;

public class CircularLL {

    static class Node{
        int data;
        Node next ;

        Node(int data){
            this.data = data;
        }
    }

    public static void main(String [] args){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(15);
        head.next.next.next = head;

        System.out.println("Circular LL ");
        traverse(head);

        System.out.println("Circular LL using for loop method");
        traverseUsingForLoop(head);

        System.out.println("Circular LL using for do while method");
        traverseUsingDoWhileLoop(head);


        head = insertAtBegin(head,1);
        System.out.println("Insert at begin");
        traverseUsingForLoop(head);
    }

    public static void traverse(Node head){
        if(head == null){
            //zero
            return ;
        }

        if(head.next == head){
            System.out.print(head.data);
        }


        Node temp = head;
        System.out.print(temp.data + " ");
        temp = temp.next;
        while(temp != head){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void traverseUsingForLoop(Node head){
        if(head == null){
            return;
        }

        if(head.next == head){
            System.out.print(head.data);
        }

        //sure that it has more than 1 node
        Node temp = head;

        System.out.print(temp.data+" ");

        for(Node p = temp.next; p != head; p= p.next){
            System.out.print(p.data+" ");
        }

    }

    public static void traverseUsingDoWhileLoop(Node head){
        if(head == null){
            return ;
        }

        if(head.next == head){
            System.out.print(head.data);
        }

        Node temp = head;

        do{
            System.out.print(temp.data+" ");
            temp = temp.next;
        }while(temp != head);

    }

    /*
     * TIME COMPLEXiTY : O(N)
     */

    public static Node insertAtBegin(Node head, int data){
        Node newNode = new Node(data);
        if(head == null){
            newNode.next = newNode;
            return newNode;
        }

        Node curr = head;
        while(curr.next != head){
            //traverse till end of LL
            curr = curr.next;
        }

        curr.next = newNode;
        newNode.next = head;

        return newNode;
    }
    
}
