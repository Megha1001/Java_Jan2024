package linkedList.singlyLL.cycle;


/*
 * Approach : Will have one temp node. and we traverse whole LL while traversing we check whether the next of curr node is temp or not . if its temp
 * there is a loop otherwise will store next of curr node(another temp) and point next of curr node to temp node then change the curr to point another temp and continue till curr !=null
 * 
 * DETECT LOOP IN O(N) but destroy the LL
 */
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
        // head.next.next.next.next = head;

        // traverse(head);
        System.out.println("is Cycle present : "+isCyclePresent(head));
    }

    public static boolean isCyclePresent(Node head){
        if(head==null){
            return false;
        }

        Node temp = new Node(10000); //temp node
        Node curr = head;
        while(curr!=null){
            if(curr.next == null){
                return false;
            }else if (curr.next == temp){
                return true;
            }

            //make next of curr as temp
            Node currNext = curr.next;
            curr.next = temp;
            curr = currNext;
        }

        return false;
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


