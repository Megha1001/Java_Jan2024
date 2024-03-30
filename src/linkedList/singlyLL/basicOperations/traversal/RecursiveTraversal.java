package linkedList.singlyLL.basicOperations.traversal;
/*
 * TIME COMPLEXITY : O(N)
 * AUX SPACE : O(N)
 */
public class RecursiveTraversal {

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    public static void main(String args[]){
        Node head = new Node(10);
        insertAtEnd(head, 20);
        insertAtEnd(head.next, 30);
        
        recursiveTraverse(head);

    }

    public static void insertAtEnd(Node head, int data){

        Node newNode = new Node(data);

        if(head==null){
            head = newNode;
        }else{
            head.next = newNode;
        }

    }

    public static  void recursiveTraverse(Node head){

        if(head == null){
            return;
        }

        System.out.print(head.data+"->");
        recursiveTraverse(head.next);
    }
}
