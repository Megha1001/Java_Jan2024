package linkedList.singlyLL.cycle;

public class CycleDetectionUsingTempNode {

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

        traverse(head);
    }

    public static void traverse(Node head){
        if(head==null){
            return;
        }

        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }

        System.out.println();
    }

    public static Node insertAtEnd(Node head, int data){
        Node newNode = new Node(data);
        if(head==null){
            return newNode;
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;

        return head;
    }
}


