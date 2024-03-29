package linkedList;

public class Creation2 {

    
    public static void main(String args[]){
        Node1 head = new Node1(10);
        head.next = new Node1(20);
        head.next.next = new Node1(30);

        System.out.println(head.data +":"+ head.next);
        System.out.println(head.next.data +":"+ head.next.next);
        System.out.println(head.next.next.data +":"+ head.next.next.next);
    }
    
}

class Node1{
    int data;
    Node1 next;

    Node1(int data){
        this.data = data;
        this.next = null;
    }
}