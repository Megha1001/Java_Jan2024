package linkedList.singlyLL.reverse;

import java.util.ArrayList;

/*
 * APPROACH : 
 * 1. Copy the elements to arrayList
 * 2. Then put it back to original array from last
 * 
 * TIME COMPLExity : O(N)
 * AUX SPACE :O(N)
 * 
 * 2-traversal
 */
public class NaiveSolution {

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
        if(head==null||head.next==null){
            return head;
        }

        ArrayList<Integer> dataList = new ArrayList<>();

        for(Node curr = head; curr!=null; curr= curr.next){
            dataList.add(curr.data);
        }
        for(Node curr = head; curr!=null; curr= curr.next){
            curr.data = dataList.remove(dataList.size() - 1); //remove returns element also
        }

        return head;


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
