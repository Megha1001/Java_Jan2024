package linkedList.singlyLL.cycle;

import java.util.HashSet;


/*
 * Approach :
 * Use HashSet to store the address of Node.
 *  Visit every Node and check whether its present in Hashset or not. If present then there is a cycle. otherwise there is no cycle.
 * 
 * TIME COMPLEXITY : O(N)
 * AUX SPACE : O(N)
 */
public class CycleDetectionUsingHashSet {

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
        head.next.next.next.next = head;

        // traverse(head);
        System.out.println("is Cycle present : "+isCyclePresent(head));
    }

    public static boolean isCyclePresent(Node head){
        if(head==null){
            return false;
        }
        HashSet<Node> hashSet = new HashSet<Node>();
        
        Node curr = head;
        while(curr!=null){
            if(hashSet.contains(curr)){
                return true;
            }else{
                hashSet.add(curr);
            }
            curr=curr.next;
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


