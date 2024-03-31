package linkedList.singlyLL;

public class InsertingAtEndMaintainingTailRef {

    private static Node head = null;
    private static Node tail = null;

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }


    public static void main(String args[]){

        insertAtEnd(10);
        insertAtEnd(20);
        insertAtEnd(30);
        insertAtEnd(40);
        insertAtEnd(50);


        traverseUsingDoWhile(head);

    }

    public static void traverseUsingDoWhile(Node head){

        if(head== null){
            return;
        }

        Node temp = head;
        do{
            System.out.print(temp.data+" ");
            temp = temp.next;
        }while(temp != null);

    }


    public static void insertAtEnd(int data){
        Node newNode = new Node(data);
        //no node exist
        if(head==null){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
    }
    
}
