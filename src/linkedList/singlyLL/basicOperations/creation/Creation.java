package linkedList.singlyLL.basicOperations.creation;


/*
 * 10->20->30->null 
 */

public class Creation {

    static class Node{
        int val;
        Node next;
    
    
        Node(int val, Node next){
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String args[]){

        Node head = new Node(10,null);
        head.next = new Node(20, null);
        head.next.next = new Node(30, null);
        
        System.out.println(head.val +":"+ head.next);
        System.out.println(head.next.val +":"+ head.next.next);
        System.out.println(head.next.next.val +":"+ head.next.next.next);
    }
}
