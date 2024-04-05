package linkedList.singlyLL.intersection;

/*
 * Approach :
 *  Count nodes in both the list(c1, c2)
 *  Traverse bigger list abs(c1-c2) times.
 *  Traverse both the list simultaneously untila we are at the common node
 * 
 */

public class FindIntersectionOfLLUsingLength {
    

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

        System.out.print("First LL : ");
        traverse(head);
        
        Node head1 = insertAtFirst(null, 60);
        head1 = insertAtFirst(head1, 00);
        head1 = insertAtFirst(head1, 20);
        head1 = insertAtFirst(head1, 30);
        head1 = insertAtFirst(head1, 40);
        head1 = insertAtFirst(head1, 50);
        System.out.print("Second LL : ");
        traverse(head1);
        System.out.println("the intersection point of LL is :"+findIntersectionPoint(head, head1));
        
    }
    
    public static int findIntersectionPoint(Node head, Node head1){
        if(head==null || head1==null){
            return -1;
        }
        
        //find lenght of head1
        Node temp = head;
        int c1=0;
        while(temp!=null){
            c1++;
            temp = temp.next;
        }

        //find length of head2
        temp = head1;
        int c2=0;
        while(temp!=null){
            c2++;
            temp = temp.next;
        }
        
        int diff = Math.abs(c1-c2);
        Node newHead = null;

        if(c1 > c2){

            //traverse c1-c2 in head1
            newHead = head;
            int j=0;
            while(j!=diff){
                newHead = newHead.next;
                ++j;
            }

            head = newHead;

        }else if(c2 > c1){

            //traverse c2-c1 in head2
            newHead = head1;
            int j=0;
            while(j!=diff){
                newHead = newHead.next;
                ++j;
            }

            head1 = newHead;

        }

        temp = head;
        Node temp1 = head1;

        while(temp != null && temp1 != null){
            if(temp.data == temp1.data){
                return temp.data;
            }

            temp = temp.next;
            temp1 = temp1.next;
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
