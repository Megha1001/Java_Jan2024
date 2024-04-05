package linkedList.singlyLL.intersection;

import java.util.HashSet;

class FindIntersectionOfLL {
    
    static class Node{
        int data;
        Node next;
        
        
        Node(int data){
            this.data = data;
        }
    }
    
    public static void main(String[] args) {
        Node head = insertAtFirst(null, 10);
        head = insertAtFirst(head, 20);
        head = insertAtFirst(head, 30);
        head = insertAtFirst(head, 40);
        head = insertAtFirst(head, 50);
        
        traverse(head);
        
        Node head1 = insertAtFirst(null, 60);
        head1 = insertAtFirst(head1, 00);
        head1 = insertAtFirst(head1, 20);
        head1 = insertAtFirst(head1, 80);
        head1 = insertAtFirst(head1, 90);
        
        System.out.println("the intersection point of LL is :"+findIntersectionPoint(head, head1));
        
    }
    
    public static int findIntersectionPoint(Node head, Node head1){
        HashSet<Integer> hashSet = new HashSet<Integer>();
        Node tempHead = head;
        while(tempHead !=null){
            hashSet.add(tempHead.data);
            tempHead=tempHead.next;
        }
        
        tempHead = head1;
        while(tempHead != null){
            if(hashSet.contains(tempHead.data)){
                return tempHead.data;
            }
            tempHead=tempHead.next;
        }
        
        return -1;
        
        
    }
    
    public static Node insertAtFirst(Node head, int data){
        Node newNode = new Node(data);
        
        if(head==null){
            return newNode;
        }
        
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        
        temp.next = newNode;
        
        return head;
    }
    
    public static void traverse(Node head){
        if(head==null){
            return;
        }
        
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}
