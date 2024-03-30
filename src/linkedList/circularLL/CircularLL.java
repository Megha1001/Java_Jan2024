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

    
}
