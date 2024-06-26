package linkedList.singlyLL.basicOperations.traversal;
/*
 * TIME COMPLEXITY : O(N)
 */
public class IterativeTraversal {


    static class Node{
        int data;
        Node next;//bydefault next sets to null

        Node(int data){
            this.data = data;
        }
    }
    
    public static void main(String args[]){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        printList(head);
    }

    public static void printList(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data+"->");
            curr = curr.next;
        }
        System.out.print("NULL");
    }
    
}